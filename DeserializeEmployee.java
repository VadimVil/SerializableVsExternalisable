package main;

import java.io.*;

public class DeserializeEmployee {
    public static void main(String[] args) {
        Employee emp;
        try {
            FileInputStream sourceFile = new FileInputStream("employee.txt");
            ObjectInputStream objIs = new ObjectInputStream(sourceFile);
            emp = (Employee) objIs.readObject();
            objIs.close();
            sourceFile.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException exs) {
            System.out.println("Employee class not found");
            exs.printStackTrace();
            return;
        }
        System.out.println("Name: " + emp.getName());
    }
}