package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {


    //NullPointerException
    public static void pointer() throws NullPointerException {
        String string = null;

        System.out.println(string.length());
    }

    //ArrayIndexOutOfBoundsException
    public static void index() throws ArrayIndexOutOfBoundsException {
        int array[] = new int[10];
        int b = array[15];
    }

    //ArithmeticException
    public static void divzero() throws ArithmeticException {
        int divzero = 5/0;
    }

    //ClassCastException
    public static void cast() throws ClassCastException {
        Object obj = new Integer(123);
        System.out.println((String) obj);
    }

    //IOException
    public static void io() throws IOException {
        throw new IOException();
    }

    //FileNotFoundException
    public static void file() throws FileNotFoundException {

        File fl = new File("C:/abc.txt");
        FileReader file = new FileReader(fl);

    }

    // main
    public static void main(String args[]) {

        //pointer error
        try{
            pointer();
        }
        catch(NullPointerException err){
            System.out.println("error: " + err);
        }

        //index error
        try{
            index();
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("error: " + err);
        }

        //cast error
        try{
            cast();
        }
        catch(ClassCastException err){
            System.out.println("error: " + err);
        }

        //divzero error
        try{
            divzero();
        }
        catch(ArithmeticException err){
            System.out.println("error: " + err);
        }

        //file error
        try{
            file();
        }
        catch(FileNotFoundException err){
            System.out.println("error: " + err);
        }

        //io error
        try{
            io();
        }
        catch(IOException err){
            System.out.println("error: " + err);
        }

    }
}