package com.example.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String Token;

    public JwtToken(String jwt){
        this.Token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return Token;
    }

    @Override
    public Object getCredentials() {
        return Token;
    }
}
