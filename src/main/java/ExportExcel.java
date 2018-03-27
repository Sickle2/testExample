
import cn.ucfgroup.eten.dao.entity.ActBankRun;
import cn.ucfgroup.eten.dao.service.ActBankRunService;
import cn.ucfgroup.eten.dao.vo.ActBankRunModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: cn.ucfgroup.eten.fore.utils
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/3/21 20:22
 * @Copyright: Copyright (c) 2018/3/21
 */
public class ExportExcel {
    private static final long serialVersionUID = 1L;

    public static void exportExcel( List<Map<Object,Object>> data) throws  IOException {
//        HSSFWorkbook wb = new HSSFWorkbook();
//        HSSFSheet sheet = wb.createSheet("sheet0");  //创建table工作薄
//        HSSFRow row ;
//        HSSFCell cell;
//
//        row = sheet.createRow(0);
//        cell = row.createCell(0);
//        cell.setCellValue("时间");
//        cell = row.createCell(1);
//        cell.setCellValue("资金类型");
//        cell = row.createCell(2);
//        cell.setCellValue("金额（元）");
//        cell = row.createCell(3);
//        cell.setCellValue("余额（元）");
//        for (int i = 1; i < data.size()+1; i++) {
//            row = sheet.createRow(i);//创建表格行
//            for (int j = 0; j < 4; j++) {
//                cell = row.createCell(0);//根据表格行创建单元格
//                String time = data.get(j).get("reldate").toString();
//                cell.setCellValue(time.substring(0,4)+"-"+time.substring(4,6)+"-"+time.substring(6,8));
//                cell = row.createCell(1);
//                cell.setCellValue((String)data.get(j).get("resv"));
//                cell = row.createCell(2);
//                cell.setCellValue((Double) data.get(j).get("amount"));
//                cell = row.createCell(3);
//                cell.setCellValue((Double)data.get(j).get("currBal"));
//            }
//        }
//
//        ByteArrayOutputStream os = new ByteArrayOutputStream();
//        wb.write(os);
//        byte[] content = os.toByteArray();
//        InputStream is = new ByteArrayInputStream(content);
//        response.reset();
//        response.setContentType("application/vnd.ms-excel");
//        response.setHeader("Content-Disposition", "attachment;filename=table.xls");
//
//        ServletOutputStream out = response.getOutputStream();
//        BufferedInputStream bis = null;
//        BufferedOutputStream bos = null;
//
//        try {
//            bis = new BufferedInputStream(is);
//            bos = new BufferedOutputStream(out);
//            byte[] buff = new byte[2048];
//            int bytesRead;
//            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
//                bos.write(buff, 0, bytesRead);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null)
//                bis.close();
//            if (bos != null)
//                bos.close();
//        }
//        wb.write(new FileOutputStream("D:/workspace/table.xls"));//这行是直接写到本地的
    }


    public static void main(String[] args) throws  IOException {
        String string = "20180326";
        System.out.println();
    }
}