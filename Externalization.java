package main;

import java.io.*;

public class Externalization {
    public static void main(String[] args) {
        String fileName = "emploeeEX.txt";
        Contact emploeeEX = new Contact();
        emploeeEX.setName("Sasha");
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emploeeEX);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis;
        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Contact readContact = (Contact) ois.readObject();
            ois.close();
            System.out.println("Contact read = " + readContact);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}