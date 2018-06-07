/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zip;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 *
 * @author Administrator
 */
public class Zip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ZipFile zp1 = new ZipFile("C:\\temp\\zip1.zip");
        ZipFile zp2 = new ZipFile("C:\\temp\\zip2.zip");
        Enumeration<? extends ZipEntry> zip1 = zp1.entries();
        Enumeration<? extends ZipEntry> zip2 = zp2.entries();
        System.out.println("\nZIP FILE 1: ");
        while(zip1.hasMoreElements()){
            ZipEntry entry = zip1.nextElement();
            if(entry.isDirectory()){
                System.out.println("DIR: " + entry.getName() + " CRC-32: " + entry.getCrc());
            }
            else{
                System.out.println("FILE: " + entry.getName() + " CRC-32: " + entry.getCrc());
            }
        }
        System.out.println("\nZIP FILE 2: ");
        while(zip2.hasMoreElements()){
            ZipEntry entry = zip2.nextElement();
            if(entry.isDirectory()){
                System.out.println("DIR: " + entry.getName() + " CRC-32: " + entry.getCrc());
            }
            else{
                System.out.println("FILE: " + entry.getName() + " CRC-32: " + entry.getCrc());
            }
        }
        System.out.println();
    }
}
