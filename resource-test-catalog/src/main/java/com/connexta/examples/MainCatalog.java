package com.connexta.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.apache.commons.io.IOUtils;

@SuppressWarnings("ALL")
public class MainCatalog {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        ResourceLoadingUtility loadingUtility = new ResourceLoadingUtility();

        loadingUtility.runAll("profiles.xml");
    }

}