package com.michalkordas.intellij.show.second;

public class StrungOut {
    public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
    private static class String {
        private final java.lang.String s;
        public String(java.lang.String s) {
            this.s = s;
        }
        public java.lang.String toString() {
            return s;
        }
    }
}
