import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: pomTest
 * @Copyright: Copyright (c) 2018/2/1
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/2/1 11:32
 */
public class Html2PDF {
    public static void main(String[] args) throws IOException, DocumentException {
        //输入的html文件
        String inputFile = "D:\\Test\\index.html";
        //输出文件
        String outFile = "D:\\Test\\fff.pdf";
        OutputStream os = new FileOutputStream(outFile);
        //创建渲染器
        ITextRenderer renderer = new ITextRenderer();
        /*
        * 字体渲染器 如果出现中文不出现的状况，
        * 需要在html的body标签加上<body style="font-family: SimSun;">
        * SimSun不是固定的和下面填写的字体对应。
        * */
        ITextFontResolver fontResolver = renderer.getFontResolver();
        fontResolver.addFont("C:/Windows/fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        String url = new File(inputFile).toURI().toURL().toString();
        renderer.setDocument(url);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
        renderer.finishPDF();
    }
}
