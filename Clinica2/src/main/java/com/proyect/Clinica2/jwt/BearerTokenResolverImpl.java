package com.proyect.Clinica2.jwt;

import com.proyect.Clinica2.exceptions.BearerTokenException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

public class BearerTokenResolverImpl implements BearerTokenResolver {

    private static final Pattern authorizationPattern = Pattern.compile("^Bearer (?<token>[a-zA-Z0-9-._~+/]+=*)$", 2);

    @Override
    public String resolve(HttpServletRequest request) {
        String authorization = request.getHeader(AUTHORIZATION);
        if (!StringUtils.startsWithIgnoreCase(authorization, "bearer")) {
            return null;
        } else {
            Matcher matcher = authorizationPattern.matcher(authorization);
            if (!matcher.matches()) {
                throw new BearerTokenException("Bearer token is malformed");
            } else {
                return matcher.group("token");
            }
        }
    }



}
