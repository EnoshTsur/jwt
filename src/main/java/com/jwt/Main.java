package com.jwt;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String jwt = JWTDemo.createJWT("123", "zooki", "enosh", TimeUnit.SECONDS.toMillis(3));
        System.out.println(jwt);
    }
}
