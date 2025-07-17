//package com.orangehrm.utilities;
//
//import java.io.*;
//import java.nio.file.*;
//import java.util.*;
//
//public class MethodContentExtractor {
//
//    public static List<String> extractMethodContent(String className, String methodName, boolean untilFailure, int failureLineNumber) {
//        List<String> steps = new ArrayList<>();
//        String classFilePath = "src/test/java/" + className.replace(".", "/") + ".java"; // adjust this path if needed
//
//        try {
//            List<String> allLines = Files.readAllLines(Paths.get(classFilePath));
//            boolean insideMethod = false;
//            int openBraces = 0;
//            int currentLine = 0;
//
//            for (String line : allLines) {
//                currentLine++;
//                String trimmed = line.trim();
//
//                if (!insideMethod) {
//                    if (trimmed.contains("void " + methodName + "(")) {
//                        insideMethod = true;
//                        openBraces = 0;
//                    }
//                }
//
//                if (insideMethod) {
//                    if (trimmed.contains("{")) openBraces++;
//                    if (trimmed.contains("}")) openBraces--;
//
//                    if (openBraces > 0 || (openBraces == 0 && trimmed.endsWith(";"))) {
//                        steps.add(trimmed);
//                    }
//
//                    if (untilFailure && currentLine == failureLineNumber) {
//                        break;
//                    }
//
//                    if (openBraces == 0) break; // method ended
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return steps;
//    }
//}
//package com;


