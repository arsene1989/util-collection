package com.andres.utils.test;

import com.andres.utils.ImageUtil;
import org.junit.Test;

/**
 * @author hjs
 */
public class ImageUtilTest {

    @Test
    public void testImageConvertGif(){
        String imagePath = "F:\\S\\软件设计师\\pdf\\综合知识\\BB1n9vIn.jpg";
        ImageUtil.convertImageToGif(imagePath);
    }
}
