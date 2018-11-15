package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public List<String> Functions = new ArrayList<>();

    public Task1(File file){
        this.Functions = getAllFunctions(file);
    }

    public static List<String> getAllFunctions(File path){
        List<String> Function= new ArrayList<String>();

        BufferedReader br = null;
        FileReader fr = null;
        String data;
        data = "";
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(path.getPath());
            br = new BufferedReader(fr);

            String sCurrentLine;
            int check =0;
            int count =0;
            while ((sCurrentLine = br.readLine()) != null) {

                if (sCurrentLine.contains("public static")&&!sCurrentLine.contains("//")&&!sCurrentLine.contains("/*")&&!sCurrentLine.contains("*/")){
                    check =1;
//                    System.out.println("start save"+sCurrentLine);

                }

                if (sCurrentLine.contains("}")&&check==1){
                    count --;

                }
                if (sCurrentLine.contains("{")&&check==1){
                    count ++;

                }

                if(check==1&&count>=1){
                    data = data +"\n"+sCurrentLine;
                }
                if(check==1&&count==0){
                    data = data +"\n"+sCurrentLine+"\n"+"   }";
//                    System.out.println("end save"+sCurrentLine);
                    Function.add(data);
                    data="";
                    check=0;
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
//        Function.add(data);
        return Function;
    }


    public String findFunctionByName(String Name){
        List<String> Element= new ArrayList<String>();
        String data[];
        String dataFunction = "not FOund";
        data=Name.split("\\(");
        Element.add(data[0]);
//        data = data[1].split("\\)");
        if (data[1] != null && data[1].length() > 0) {
            data[1] = data[1].substring(0, data[1].length() - 1);
        }
        data = data[1].split(",");
        Element.add(data[0]);
        Element.add(data[1]);
//        System.out.println(Element);
        int check;
        for(String function: this.Functions) {
            check =1;
            String[] lines = function.split("\n");
//            System.out.println(lines[1]);
            for(String element: Element) {
                if(!lines[1].contains(element)){
//                    System.out.println(lines[1]+":"+element);
                    check=0;
                }
            }
            if (check == 1) dataFunction=function;
        }
        return dataFunction;
    }


    public static void main(String[] args) {
        File file =new File("D:\\data\\github\\oop2018\\src\\week9\\Utils.java");
        Task1 data = new Task1(file);
//        List<String> data = getAllFunctions(file);

//        System.out.println("(");
//        for(String function: data.Functions) {
//            System.out.println("////////////////////////////////");
//            System.out.println(function);
//        }


        System.out.println("findFileByName(String,String):::::::::::::::::::");
        System.out.println(data.findFunctionByName("findFileByName(String,String)"));
    }
}

