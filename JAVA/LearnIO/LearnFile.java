package JAVA.LearnIO;

import edu.princeton.cs.algs4.In;

import java.io.*;
import java.util.Properties;

public class LearnFile {
    public static void readfile(String filepath){
        FileInputStream fis = null;
        int tmp = 0;
        try {
            fis = new FileInputStream(filepath);
            while((tmp = fis.read()) != -1){
                System.out.print((char)tmp);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void writefile(String filepath){
        FileOutputStream fot = null;
        String str = "hello World";
        try{
            fot = new FileOutputStream(filepath);
            fot.write(str.getBytes());
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                fot.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void copyFile(String fpIn, String fpOut){
        FileOutputStream fot = null;
        FileInputStream fit = null;
        byte[] bytes = new byte[1024];
        try{
            fot = new FileOutputStream(fpOut);
            fit = new FileInputStream(fpIn);
            while((fit.read(bytes)) != -1){
                fot.write(bytes, 0, bytes.length);
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                fot.close();
                fit.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void fileReader(String fp){
        FileReader fr = null;
        int tmp = 0;
        try{
            fr = new FileReader(fp);
            while((tmp = fr.read()) != -1){
                System.out.print((char)tmp);
            }
        }catch(IOException e){
            System.out.println();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void fileWriter(String fp, String str){
        FileWriter fw = null;
        try{
            fw = new FileWriter(fp);
            fw.write(str);
        }catch(IOException e){
            System.out.println();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void readLine(String fp) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(fp));
        String str = null;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
    public static void createProperties(String filepath) throws IOException {
        Properties pp = new Properties();
        pp.setProperty("id", "01");
        pp.setProperty("name", "lucy");
        pp.setProperty("age","33");
        FileWriter fw = new FileWriter(filepath);
        pp.store(fw, null);
    }
    public static void loadProperties(String filepath) throws IOException {
        Properties pp = new Properties();
        pp.load(new FileReader(filepath));
        System.out.println(pp.getProperty("name"));
        System.out.println(pp.getProperty("id"));
        System.out.println(pp.getProperty("age"));

    }
    public static void main(String[] args) throws IOException {
        String filepath = "/home/zsm/CS/books/DSA/code/JAVA/LearnIO/";
//      File file = new File(filepath);

        String path = "/home/zsm/CS/books/DSA/code/JAVA/LearnIO/a";
//        File dir1 = new File(path);
//        dir1.mkdir();
        //LearnFile.readfile(filepath);

        //writefile("/home/zsm/CS/books/DSA/code/JAVA/LearnIO/test.txt");
        //copyFile(filepath, "/home/zsm/CS/books/DSA/code/JAVA/LearnIO/OIPC1.jpeg");
        //fileReader(filepath);
        //fileWriter(filepath, "不要温和地走入那个良夜");

//        PrintStream ps = System.out;
//
//        try {
//            ps.write("2333".getBytes());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(filepath),"utf-8");
//        BufferedReader br = new BufferedReader(isr);
//        int linenum = 0;
//        String str = null;
//        while((str = br.readLine()) != null){
//            System.out.println(linenum++ + str);
//        }
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        String pppath = filepath + "test.properties";
//        createProperties(pppath);
        loadProperties(pppath);


    }


}
