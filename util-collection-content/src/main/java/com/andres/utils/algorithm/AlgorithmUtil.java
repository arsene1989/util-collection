package com.andres.utils.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hjs
 */
public class AlgorithmUtil {

    public static final String EMPTY = " ";

    /**
     * 根据一段话，根据挑出单词根据ASCII码排序
     * @param sentence String
     */
    public static void sortSentence(String sentence){
        List<String> list = new ArrayList<>();
        String[] array = sentence.split(EMPTY);
        if(array.length > 0){
            for (String word : array) {
                String wordWithoutBlank = word.replaceAll(EMPTY, "");
                if (wordWithoutBlank.length() > 0) {
                    list.add(wordWithoutBlank);
                }
            }
        }

        list = list.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        list.forEach(item -> {
            System.out.print(item);
            System.out.print(EMPTY);
        });
    }

}
