package com.jwt;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String jwt = JWTHandler.createJWT("123", "zooki", "enosh", TimeUnit.SECONDS.toMillis(3));
        System.out.println(jwt);
        // https://developer.okta.com/blog/2018/10/16/token-auth-for-java
    }
}
