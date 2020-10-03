/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paarkavi Saravanan
 */
public class name_phnnum_file {
    public static void main(String args[]) throws FileNotFoundException, IOException{
      Scanner obj=new Scanner(System.in);
      FileWriter f=new FileWriter("customerdetail.txt");
      BufferedWriter bw=new BufferedWriter(f);
      String str1[]={"athvik-9361391756","kavikirthu-6385824304","hari-9443736879","indra-9487682560","prakavi-9856724589"};
      for(String i:str1)
      {
          bw.write(i);
          bw.newLine();
      }
      bw.close();
      System.out.println("Enter the name to retrive their phone number");
      String str=obj.next();
      int index=0;
      int c=0;
      boolean found=false;
      for(int i=0;i<str1.length;i++)
      {
      if(str1[i].contains(str))
      {
         index=i;
         found =true;
         c=str.length();
       break;
         
      }
      }
      if(found)
      {
         
          System.out.println(str1[index].substring(c+1));
      }
      else
      {
          System.out.println("Invalid Input!!Enter the correct name");
      }
    
}
}
