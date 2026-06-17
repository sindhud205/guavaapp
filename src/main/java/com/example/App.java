package com.example;

/**
 * Hello world!
 *
 */
 import org.apache.commons.io.FileUtils;
 import java.io.File;
 import java.io.IOException;
 import com.google.common.collect.ImmutableList;
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> fruits=ImmutableList.of("apple","banana","cherry");
    	
        System.out.println(fruits);
        File srf=new File("source.txt");
        File dsf=new File("destination.txt");
        
        try{
        	FileUtils.copyFile(srf,dsf);
        	System.out.println("file copied sucess");
        }catch(IOException e){
        
        System.out.println("error while copying:"+e.getMessage());
        }
        
    }
}
