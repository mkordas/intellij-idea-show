package com.michalkordas.intellij.show.puzzlers;

public class IAmBroken {

    public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}

class String {

    private final java.lang.String value;

    public String(java.lang.String value) {
        this.value = value;
    }

    public java.lang.String toString() {
        return value;
    }
}
