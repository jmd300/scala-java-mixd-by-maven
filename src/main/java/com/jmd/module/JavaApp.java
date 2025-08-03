package com.jmd.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaApp {

    private static final Logger LOG = LoggerFactory.getLogger(JavaApp.class);

    public static void main(String[] args) {
        System.out.println("Java Hello World!");
        System.out.println("Java concat arguments by java =" + foo(args));
        System.out.println("Java concat arguments by scala =" + ScalaApp.foo(args));
    }

    public static String foo(String[] args) {
        var sb = new StringBuilder();
        for (String arg : args) {
            sb.append(" ");
            sb.append(arg);
        }
        return sb.toString();
    }


}
