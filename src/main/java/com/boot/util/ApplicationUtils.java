/**
 * 
 */
package com.boot.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

/**
 * @author Sushant
 *
 */
public class ApplicationUtils {
	
	
	public static void generatePDF(String fileNameWithPath, String pdfName) throws DocumentException, IOException{
		// step 1
    	Document document = new Document();
        // step 2
    	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Prashant\\Downloads\\invoices\\"+pdfName+".pdf"));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(fileNameWithPath));	
        //step 5
         document.close();

        System.out.println( "PDF Created!" );
		
	}

}
