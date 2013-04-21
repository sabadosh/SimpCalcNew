package com.console;

import java.io.*;

public class InputReader {

    public static String getInput() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String line = bufferRead.readLine();
            if (line.equals("exit") || line.equals("Exit") || line.equals("quit")) {
                System.exit(1);
            }
            return line;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Double getArgFromConsole() {
        try {
            Double arg;
            arg = Double.parseDouble(getInput());
            return arg;
        } catch (Exception e) {
            System.out.print("Enter proper double value:");
            return getArgFromConsole();
        }
    }

    public static String getOperationFromConsole() {
            return getInput();
    }



}
