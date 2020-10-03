/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Paarkavi Saravanan
 */
public class charstream_binary {
     public static void main(String args[]) throws Exception {
        FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("lab10_image.jpg");
        fou=new FileWriter("lab10_image_output_char.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
     

}
