package com.mounir.ecommerce.configuration;

public enum RestMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");
    private String method;

    public String getMethod() {
        return method;
    }

    RestMethod(String method) {
        this.method = method;
    }
}
