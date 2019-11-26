package com.javafortesters.chap005testwithourownclasses.domainobject.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){

        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());
    }

    @Test
    public void GetDomainAndPort(){

        assertEquals("Get domain bro",
                "192.123.0.2",
                TestAppEnv.DOMAIN);

        assertEquals("Get port bro",
                "67",
                TestAppEnv.PORT);
    }
}
