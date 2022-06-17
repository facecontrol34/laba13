package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileReader FR = new FileReader("text.txt");
            FileWriter FW = new FileWriter("code.txt")){
            int C = 0;
            String text = "";
            while((C = FR.read()) != -1){
                text += (char)C;
            }

            String a = text.replaceAll("\\//.+", "");
            String c = a.replaceAll("/\\*(?s).*?\\*/", "");

            FileWriter FW = new FileWriter("code.txt");
            FW.write(c);
            FW.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
