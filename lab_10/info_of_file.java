/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Paarkavi Saravanan
 */
public class info_of_file {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the filename");
        String filename=obj.next();
        File f=new File(filename);
        System.out.println("INFORMATION OF THE FILE");
        char s;   
        do
        {
            System.out.println("1.Availability of the file\n"+
                               "2.readable or writable or both\n"+
                               "3.Type of the file\n"+
                               "4.Length of the file in bytes\n");
            System.out.println("enter the number of ur choice");
            int a=obj.nextInt();
            switch(a)
            {
                case 1:
                {
                    System.out.println("Availability==> "+f.exists());
                    break;
                }
                case 2:
                {
                    if(f.canRead()&& f.canWrite())
                    {
                        System.out.println("the file is both readable and writable");
                    }
                    else if(f.canRead())
                    {
                        System.out.println("the file is readable");
                        
                    }
                    else if(f.canWrite())
                    {
                        System.out.println("the file is writable");
                    }
                    else
                    {
                        System.out.println("undefined property");
                    }
                    break;
                }
                case 3:
                {
                    int c=filename.length();
                    System.out.println("Type of the file");
                    int index=filename.lastIndexOf(".");
                    if(index>0)
                    {
                        String type=filename.substring(index+1);
                        System.out.println( type);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Length of the file in bytes:"+f.length()+" bytes");
                    break;
                }
               
    
            }
            System.out.println("=====================");
            
            System.out.println("enter 'y' to continue ");
             s=obj.next().charAt(0);
             System.out.println("=====================");
        }while(s=='y'||s=='Y');
            
        
    }
}
