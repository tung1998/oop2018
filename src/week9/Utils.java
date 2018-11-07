package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) {
        BufferedReader br = null;
        FileReader fr = null;
        String data;
        data = "";
        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                data = data +"\n"+sCurrentLine;
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
        return data;
    }


    public static void writeContentToFile(String path){
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                    new FileWriter(path);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("new data");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + path + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }


    public static void writeContentToEndFile(String path){
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                    new FileWriter(path,true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.append("\nnew data at end");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + path + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
//
//
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath+'\\'+fileName);
        return file;
    }




    public static void main(String[] args) {
        String path = "D:\\data\\github\\oop2018\\src\\week9\\data\\data.txt";
        System.out.println(readContentFromFile(path));
        writeContentToFile(path);
        System.out.println(readContentFromFile(path));
        writeContentToEndFile(path);
        System.out.println(readContentFromFile(path));
        File file =  findFileByName("D:\\data\\github\\oop2018\\src\\week9\\data","data.txt");
        System.out.println(readContentFromFile(file.getPath()));
    }
}
