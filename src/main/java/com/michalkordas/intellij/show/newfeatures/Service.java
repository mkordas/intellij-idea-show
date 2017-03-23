package com.michalkordas.intellij.show.newfeatures;

public class Service {
    private final String name;
    private final String path;
    private final int port;
    private final int timeout;
    private final boolean daemon;

    Service(String name, String path, int port, int timeout, boolean daemon) {
        this.name = name;
        this.path = path;
        this.port = port;
        this.timeout = timeout;
        this.daemon = daemon;
    }

    public static void main(String[] args) {
        new Service("service", "/", 8080, 10, true);
    }
}
