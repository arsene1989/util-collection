package com.andres.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

/**
 * 图片工具
 * @author hjs
 */
public class ImageUtil {

    private ImageUtil(){}

    /**
     * 图片转Gif格式
     * @param imagePath 图片文件路径
     */
    public static void convertImageToGif(String imagePath) {
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));

            // 获取 GIF 图像写入器
            ImageWriter writer = ImageIO.getImageWritersByFormatName("gif").next();
            ImageWriteParam param = writer.getDefaultWriteParam();

            // 创建输出流
            FileOutputStream outputStream = new FileOutputStream("output.gif");
            ImageOutputStream ios = ImageIO.createImageOutputStream(outputStream);

            // 开始写入 GIF
            writer.setOutput(ios);
            writer.write(null, new javax.imageio.IIOImage(image, null, null), param);

            ios.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}