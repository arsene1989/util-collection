package com.andres.utils;

import java.io.File;

/**
 * 文件工具
 * @author hjs
 */
public class FileUtil {

    private FileUtil(){}

    /**
     * 批量重命名
     * @param filePath 文件路径
     * @param keyword 替换关键字
     * @param replacement 替换后的字符串
     */
    public static void batchRename(String filePath, String keyword, String replacement) {
        File directory = new File(filePath);
        if (!directory.exists()){
            return;
        }

        File[] files = directory.listFiles();

        assert files != null;
        for (File file : files){
            String originalName = file.getName();

            System.out.println(originalName);

            if (originalName.contains(keyword)){
                originalName = originalName.replace(keyword, replacement);

                File newFile = new File(filePath + File.separator + originalName);
                boolean renamed = file.renameTo(newFile);

                System.out.println("rename result:" + renamed);
            }
        }
    }
}
