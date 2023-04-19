/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class XFile {
    
      
    //File
    public static void writeFile(String path){
        File f = new File(path);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
            byte[] arr = {10,20,30};  
            fos.write(arr);           
            fos.close();              
        } catch (FileNotFoundException e) {  
            System.err.println("File not found");
        } catch (IOException ex) {  
            System.err.println("Failed");
        }
    }

    public static void readFile(String path){
        File f = new File(path);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            int fileSize = (int) f.length();
            byte[] arr = new byte[fileSize];
            fis.read(arr);          
            for (int i = 0; i < fileSize; i++) {
                System.out.println(arr[i] + " ");
            }
            fis.close();                    
        } catch (FileNotFoundException e) { 
            System.err.println("File not found");
        } catch (IOException ex) {  
            System.err.println("Failed");
        }
    }
    

    //  Data File
    public static void writeDataFile(String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(5);
            dos.writeUTF("Pé Tòn ");
            dos.writeDouble(9.8);
            dos.close();
        }catch (IOException ex) {
            System.err.println("Failed");
        }
    }
    public static void readDataFile(String path){
         try{
            FileInputStream fos = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fos);
                System.out.println(dis.readInt());
                System.out.println(dis.readUTF());
                System.out.println(dis.readDouble());  
            dis.close();
        }catch (IOException ex) {
            System.err.println("Failed");
        }
    }
    
    
    //  Buffer
    public static void writeBuffer(String path , String text){
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        }catch(IOException e){
            System.err.println("Failed");
        }
    }
    
    public static String readBuffer(String path){
        StringBuilder sb = new StringBuilder();
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String FirstLine = br.readLine();
            while(FirstLine != null)
            {       // kiểm tra khác null   
                sb.append(FirstLine);      
                FirstLine = br.readLine();  
                if(FirstLine != null)
                    sb.append("\n");
            }
        }catch (IOException e) {
            System.err.println("Failed");
        }
        return sb.toString();
    }
    
    // Object
    public static void writeObject(String path, Object o){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(path)
            );
            oos.writeObject(o);
            oos.close();
        }catch(IOException e){
//            System.err.println("Failed write Object");
            e.printStackTrace();
        }
    }
    
    public static Object readObject(String path){
        try{
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(path)
            );
            Object o = ois.readObject();
            ois.close();
            return o;
        }catch(IOException e){
        e.printStackTrace();
        }catch (ClassNotFoundException ex) {
//            System.err.println("Class not found");
        }
        return null;
    }
    
        //  các cách gọi ra
    public static void main(String[] args) {
        // File
//        String filePath = "./src/Library/testFile.dat";
//        writeFile(filePath);
//        readFile(filePath);

        // Data file
//        String DatafilePath = "./src/Library/testDataFile.dat";
//        writeDataFile(DatafilePath);
//        readDataFile(DatafilePath);

        // Buffer
//        String BufferFilePath = "./src/Library/testFileBuffer.dat";
//        writeBuffer(BufferFilePath, "Poé Tòn \n gru gru");
//        readBuffer(BufferFilePath);

//        // Object
//        List<Cat> catList = new ArrayList<>();
//        catList.add(new Cat("Meow",3.4, Boolean.FALSE,1000.0));
//        catList.add(new Cat("mr.Cat",1.3, Boolean.FALSE,1000.0));
//        String fileObjectPath = "./src/Library/cat.dat";
//        writeObject(fileObjectPath, catList);
//        
//        List<Cat> readList = (List<Cat>) readObject(fileObjectPath);
//        
//        for (Cat cat : readList) {
//            System.out.println(cat.getWeight());  //in ra cân nặng
//        }
    }
}
