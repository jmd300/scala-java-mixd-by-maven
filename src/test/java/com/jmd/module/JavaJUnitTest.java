package com.jmd.module;

import org.junit.Test;

public class JavaJUnitTest {

    @Test
    public void test1() {
        System.out.println("Java TestOK1");
        ScalaApp.main(new String[]{"1", "2"});
        JavaApp.main(new String[]{"1", "2"});

    }
}
