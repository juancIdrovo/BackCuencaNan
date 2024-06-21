package com.proyectoFinal.cuencaNan.aws3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Asset {
	
	private byte[] content;
	private String contentType;
	
	
	public Asset(byte[] content, String contentType) {
		super();
		this.content = content;
		this.contentType = contentType;
	}
	
	public Asset() {
		super();
	}
	
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
