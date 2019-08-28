package com.aspose.cad.examples.CADConversion;

import java.awt.Image;
import com.aspose.cad.examples.Utils.Utils;
import com.aspose.cad.fileformats.cad.CadImage;
import com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity;
import com.aspose.cad.fileformats.cad.cadobjects.acadtable.CadTableEntity;
import com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject;

public class ReadingDWT {

	public static void main(String[] args) {
		
		// The path to the resource directory.
                 //ExStart:ReadingDWT
		String dataDir = Utils.getDataDir(ReadingDWT.class) + "CADConversion/";
		String srcFile = dataDir + "conic_pyramid.dxf";
		
		// Load a CAD drawing  in an instance of CadImage
		//CadImage cadImage = (CadImage) Image.load(srcFile);
               com.aspose.cad.fileformats.cad.CadImage objImage =(CadImage) com.aspose.cad.Image.load(srcFile);
                       
                for(Object style : objImage.getStyles())
                {
                    // Set the font name
                    ((com.aspose.cad.fileformats.cad.cadtables.CadStyleTableObject)style).setPrimaryFontName("Arial");
                }

                //ExEnd:ReadingDWT
	}
}
