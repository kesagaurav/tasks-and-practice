package FileIoPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) {
		try {
			
			
			   FileInputStream in= new FileInputStream("D:\\gaurav important pictures\\Saved Pictures");
			   FileOutputStream o = new FileOutputStream("D:\\lion.jpg");
			   BufferedInputStream B=new BufferedInputStream(in);
			   BufferedOutputStream Bo= new BufferedOutputStream(o);
			   
			   int a =0;
			   while(a!=-1) {
				   a=B.read();
				   Bo.write(a);
			   }
			   B.close();
			   Bo.close();
					}
					 catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
				}

	}


