package com.company.SerializationandDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {


    public static void main(String[] args) {
        Employee emp = new Employee();
        try {
            FileInputStream f = new FileInputStream("file1.txt");
            ObjectInputStream obj = new ObjectInputStream(f);
            emp=(Employee) obj.readObject();
            obj.close();
            f.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.println("Deserialized data: ");
        System.out.println(emp.name);
        System.out.println(emp.rollno);
        System.out.println(emp.password);
    }

}
