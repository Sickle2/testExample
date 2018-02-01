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
        String inputFile = "D:\\Test\\index.html";
        String outFile = "D:\\Test\\fff.pdf";
        OutputStream os = new FileOutputStream(outFile);
        ITextRenderer renderer = new ITextRenderer();
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
