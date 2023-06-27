package com.proyect.Clinica2.jwt;

import jakarta.servlet.http.HttpServletRequest;

public interface BearerTokenResolver {
    String resolve(HttpServletRequest request);
}
