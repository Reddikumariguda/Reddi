package com.k7it.java.lang;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
public class SystemProperties {

	public static void main(String[] args) throws IOException {
		
			int age=Integer.parseInt(System.getProperty("age"));
			String name=System.getProperty("name");
			double ht=Double.parseDouble(System.getProperty("ht"));
			double wt=Double.parseDouble(System.getProperty("wt"));
			System.out.println("Name:"+name+" Age:"+age+" -ht:"+ht+" wt:"+wt);
			
			Properties p = System.getProperties();
			//System.out.println(p);
			
			FileInputStream f1=new FileInputStream("E:\\javapractices\\Test\\src\\com\\k7it\\java\\lang\\Application.Properties");
			p.load(f1);
			/*
			 * System.out.println(p.getProperty("name"));
			 * System.out.println(p.getProperty("age"));
			 * System.out.println(p.getProperty("ht"));
			 * System.out.println(p.getProperty("wt"));
			 */
			System.out.println("Name:"+p.getProperty("name")+",Age:"+p.getProperty("age")+",ht:"+p.getProperty("ht")+",wt:"+p.getProperty("wt"));
			}
			}

