package com.panda.user.server.infrastructure.util.entity;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @author jinli
 * @date 2020/10/23
 */
public class ImageVerificationCode {
    
    private int weight;
    private int height;
    private String text;
    private Random r = new Random();
    private String[] fontNames = {"Georgia","宋体", "华文楷体", "黑体", "微软雅黑", "楷体_GB2312"};
    private String codes = "123456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
    
    public ImageVerificationCode(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    
    private Color randomColor() {
        int r = this.r.nextInt(225);
        int g = this.r.nextInt(225);
        int b = this.r.nextInt(225);
        return new Color(r, g, b);
    }
    
    private Font randomFont() {
        int index = r.nextInt(fontNames.length);
        String fontName = fontNames[index];
        int style = r.nextInt(4);
        int size = r.nextInt(10) + 24;
        return new Font(fontName, style, size);
    }
    
    private char randomChar() {
        int index = r.nextInt(codes.length());
        return codes.charAt(index);
    }
    
    private void drawLine(BufferedImage image) {
        int num = r.nextInt(10);
        Graphics2D g = (Graphics2D) image.getGraphics();
        for (int i = 0; i < num; i++) {
            int x1 = r.nextInt(weight);
            int y1 = r.nextInt(height);
            int x2 = r.nextInt(weight);
            int y2 = r.nextInt(height);
            g.setColor(randomColor());
            g.drawLine(x1, y1, x2, y2);
        }
    }
    
    
    private BufferedImage createImage() {
        BufferedImage image = new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(new Color(255, 255, r.nextInt(245) + 10));
        g.fillRect(0, 0, weight, height);
        return image;
    }
    
    public BufferedImage getImage() {
        BufferedImage image = createImage();
        Graphics2D g = (Graphics2D) image.getGraphics();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String s = randomChar() + "";
            sb.append(s);
            float x = i * 1.0F * weight / 4;
            g.setFont(randomFont());
            g.setColor(randomColor());
            g.drawString(s, x, height - 5);
        }
        this.text = sb.toString();
        drawLine(image);
        return image;
    }
    
    public String getText() {
        return text;
    }
    
    public  void output(BufferedImage image, OutputStream out) throws IOException {
        ImageIO.write(image, "JPEG", out);
    }
}
