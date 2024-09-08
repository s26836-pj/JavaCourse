package org.example.lecture8;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        // Read file content as a String
        String content = FileUtils.readFileToString(new File("src/main/resources/try.txt"), "UTF-8");

        // Split the content into words, remove non-alphabetical characters and count unique words
        Set<String> words = Arrays.stream(StringUtils.split(content.toLowerCase(), " \n")) //you can add also .,!?
                .collect(Collectors.toSet());

        // Write the number of unique words to a file
        FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), "words count: " + words.size(), "UTF-8");

//        Here is for HashMap because I wasn't sure which one you wanted us to use

//        HashMap<String, Integer> wordMap = new HashMap<>();
//
//        (count unique words)
//        for (String word : words) {
//            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//        }
//        FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), "words count: " + wordMap.size(), "UTF-8");

    }
}

