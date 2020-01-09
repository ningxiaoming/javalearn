package com.vision.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.authenticator.AuthenticatorBase;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author NingXioaoming
 * @createTime 2020/1/8 16:11
 * @description
 */
public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        //attempt Authentication when Content-Type is json
        if(request.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE)
                ||request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)){

            ObjectMapper objectMapper = new ObjectMapper();
            UsernamePasswordAuthenticationToken authenticationToken = null;
            try (InputStream is = request.getInputStream()){

            }catch (IOException e){

            }


        }


        return super.attemptAuthentication(request, response);
    }
}
