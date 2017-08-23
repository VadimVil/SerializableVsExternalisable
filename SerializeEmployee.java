/**
 * Created by vadim_vil on 22.08.2017.
 */
package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeEmployee {
    public static void main(String[] args) {
        main.Employee emp = new main.Employee();
        emp.setName("Vadim");
        try {
            FileOutputStream targetFile = new FileOutputStream("employee.txt");
            ObjectOutputStream objOS = new ObjectOutputStream(targetFile);
            objOS.writeObject(emp);
            objOS.close();
            targetFile.close();
            System.out.printf("Employee data has been saved");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}