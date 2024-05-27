package com.andres.utils.test;

import com.andres.utils.FileUtil;
import org.junit.Test;

/**
 * @author hjs
 */
public class FileUtilsTest {

    @Test
    public void testRename(){
        String path = "D:\\迅雷下载\\Two and a half men\\2";
        String keyword = ".Chi_Eng.WEB-HR.AAC.1024X576.x264-YYeTs人人影视";
        String replacement = "";
        FileUtil.batchRename(path, keyword, replacement);
    }
}
