package com.proyectoFinal.cuencaNan.aws3;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Asset {

    private byte[] content;
    private String contentType;

    // Constructor con todos los parámetros
    public Asset(byte[] content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }

    // Constructor vacío
    public Asset() {
    }

    // Getters y Setters
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

