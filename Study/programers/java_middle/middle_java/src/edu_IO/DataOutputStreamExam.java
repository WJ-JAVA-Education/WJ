package edu_IO;

import java.io.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExam{
    public static void main(String[] args){
        
        try(
            DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
            out.writeInt(10);
            out.writeBoolean(true);
            out.writeDouble(50.5);
         }
        catch(Exception e){      
            e.printStackTrace();
        }
    }
}