package com.andres.utils;

import java.io.File;

/**
 * @author hjs
 */
public class OperateFiles {

    private final static String WORDS = ".Chi_Eng.WEB-HR.AAC.1024X576.x264-YYeTs人人影视";

    public static void main(String[] args) {
        String path = "D:\\迅雷下载\\Two and a half men\\2";

        File directory = new File(path);

        File[] files = directory.listFiles();

        assert files != null;
        for (File file : files){
            String originalName = file.getName();

            System.out.println(originalName);

            if (originalName.contains(WORDS)){
                originalName = originalName.replace(WORDS,"");
            }

            File newFile = new File(path + File.separator + originalName);
            boolean renamed = file.renameTo(newFile);

            System.out.println("rename result:" + renamed);
        }
    }
}
