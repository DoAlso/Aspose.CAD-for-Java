package com.aspose.cad.examples.ExportingDGN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.aspose.cad.Image;
import com.aspose.cad.ImageOptionsBase;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.dgn.DgnImage;
import com.aspose.cad.imageoptions.CadRasterizationOptions;
import com.aspose.cad.imageoptions.JpegOptions;
import com.aspose.cad.imageoptions.PdfOptions;

public class ExportEmbeddedDGN
{
    public static void main(String[] args)
    {
        // Input and Output file paths
       //ExStart:ExportEmbeddedDGN
        
       	String dataDir = Utils.getDataDir(ExportEmbeddedDGN.class) + "ExportingDGN/";
		String fileName = dataDir + "BlockRefDgn.dwg";
        com.aspose.cad.Image objImage = com.aspose.cad.Image.load(fileName);
         {
           CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
           rasterizationOptions.setLayouts(new String[] {"Model"});
           PdfOptions pdfOptions = new PdfOptions();
           pdfOptions.setVectorRasterizationOptions(rasterizationOptions);
          objImage.save(dataDir + "BlockRefDgn.pdf", pdfOptions);
          }
       //ExEnd:ExportEmbeddedDGN
    }
}