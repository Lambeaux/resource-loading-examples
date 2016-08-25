package com.connexta.examples;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

@SuppressWarnings("ALL")
public class ResourceLoadingUtility {

    public void runAll(String pathWithoutLeadingSlash) throws IOException {
        loadResource(pathWithoutLeadingSlash);
        loadResource("/" + pathWithoutLeadingSlash);
        loadResourceWithClassLoader(pathWithoutLeadingSlash);
        loadResourceWithClassLoader("/" + pathWithoutLeadingSlash);
        staticLoadResource(pathWithoutLeadingSlash);
        staticLoadResource("/" + pathWithoutLeadingSlash);
        staticLoadResourceWithClassLoader(pathWithoutLeadingSlash);
        staticLoadResourceWithClassLoader("/" + pathWithoutLeadingSlash);
    }

    public void loadResource(String path) throws IOException {
        log();
        log(String.format("Load(runtime, class, %s)", path));
        try {
            log(getClass().getResource(path)
                    .toString());
        } catch (NullPointerException e) {
            log("Null");
        }
    }

    public void loadResourceWithClassLoader(String path) throws IOException {
        log();
        log(String.format("Load(runtime, classLoader, %s", path));
        try {
            log(getClass().getClassLoader()
                    .getResource(path)
                    .toString());
        } catch (NullPointerException e) {
            log("Null");
        }
    }

    public void staticLoadResource(String path) throws IOException {
        log();
        log(String.format("Load(static, class, %s)", path));
        try {
            log(ResourceLoadingUtility.class.getResource(path)
                    .toString());
        } catch (NullPointerException e) {
            log("Null");
        }
    }

    public void staticLoadResourceWithClassLoader(String path) throws IOException {
        log();
        log(String.format("Load(static, classLoader, %s)", path));
        try {
            log(ResourceLoadingUtility.class.getClassLoader()
                    .getResource(path)
                    .toString());
        } catch (NullPointerException e) {
            log("Null");
        }
    }

    private void log() {
        System.out.println();
    }

    private void log(String message) {
        System.out.println(message);
    }
}