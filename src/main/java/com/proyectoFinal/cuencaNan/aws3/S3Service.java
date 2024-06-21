package com.proyectoFinal.cuencaNan.aws3;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;



@Service
public class S3Service {

	private final String BUCKET = "practicasjohnsiguenza";

	@Autowired
	private AmazonS3 s3client;

	public String putObject(MultipartFile multipartFile) {
		String extension = StringUtils.getFilenameExtension(multipartFile.getOriginalFilename());
		String key = String.format("%s.%s", UUID.randomUUID(), extension);

		ObjectMetadata objectMetadata = new ObjectMetadata();
		objectMetadata.setContentType(multipartFile.getContentType());

		try {
			PutObjectRequest objectRequest = new PutObjectRequest(BUCKET, key, multipartFile.getInputStream(),
					objectMetadata);
			s3client.putObject(objectRequest);
			return key;
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public Asset getObject(String key) {
		S3Object s3Object = s3client.getObject(BUCKET, key);
		ObjectMetadata metaData = s3Object.getObjectMetadata();

		try {
			S3ObjectInputStream inputStream = s3Object.getObjectContent();
			byte[] bytes = IOUtils.toByteArray(inputStream);

			return new Asset(bytes, metaData.getContentType());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleteObject(String key) {
		s3client.deleteObject(BUCKET, key);
	}

	public String getObjectUrl(String key) {
		return String.format("https://%s.s3.amazonaws.com/%s", BUCKET, key);
	}
}
