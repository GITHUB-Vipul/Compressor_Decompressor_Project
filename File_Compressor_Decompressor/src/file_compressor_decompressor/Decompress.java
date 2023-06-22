/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file_compressor_decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author family
 */
public class Decompress {
    public static void  method(File path) throws IOException
    {
        String fileDirectory=path.getParent();
                FileInputStream fis=new FileInputStream(path);
                GZIPInputStream gzip=new GZIPInputStream(fis);
                FileOutputStream fos=new FileOutputStream(fileDirectory+"/DecompressedFile");
                byte[] buffer =new byte[1024];
                int len;
                while((len=fis.read(buffer))!=-1)
                {
                    fos.write(buffer,0,len);
                }
                gzip.close();
                fos.close();
                fis.close();
    }
    
}
