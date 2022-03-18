package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write(
                "«Aa»," +"\n"+
                " «Bb»" +"\n"+
                " «Cc»" +"\n"+
                " «Dd»" +"\n"+
                " «Ee»" +"\n"+
                " «Ff»" +"\n"+
                " «Gg»" +"\n"+
                " «Hh»" +"\n"+
                " «Ii»" +"\n"+
                " «Jj»" +"\n"+
                " «Kk»" +"\n"+
                " «Ll»" +"\n"+
                " «Mm»" +"\n"+
                " «Nn»" +"\n"+
                " «Oo»" +"\n"+
                " «Pp»" +"\n"+
                " «Qq»" +"\n"+
                " «Rr»" +"\n"+
                " «Ss»" +"\n"+
                " «Tt»" +"\n"+
                " «Vv»" +"\n"+
                " «Ww»" +"\n"+
                " «Xx»" +"\n"+
                " «Yy»" +"\n"+
                " «Zz» "+"\n");
        fileWriter.write(0+"\n");
        fileWriter.write(1+"\n");
        fileWriter.write(2+"\n");
        fileWriter.write(3+"\n");
        fileWriter.write(4+"\n");
        fileWriter.write(5+"\n");
        fileWriter.write(6+"\n");
        fileWriter.write(7+"\n");
        fileWriter.write(8+"\n");
        fileWriter.write(9+"\n");


        fileWriter.close();

        try(FileReader fileReader = new FileReader("test.txt")) {
            int a;
            while ((a = fileReader.read()) != -1){
                System.out.print((char) a);
            }
        }catch (IOException e){
            e.printStackTrace();


        }
    }
}
