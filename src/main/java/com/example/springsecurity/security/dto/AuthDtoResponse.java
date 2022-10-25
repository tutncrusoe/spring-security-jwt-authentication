package com.example.springsecurity.security.dto;

public class AuthDtoResponse {
    private String email;
    private String accessToken;

    public AuthDtoResponse() {}

    public AuthDtoResponse(String email, String accessToken) {
        this.email = email;
        this.accessToken = accessToken;
    }
}