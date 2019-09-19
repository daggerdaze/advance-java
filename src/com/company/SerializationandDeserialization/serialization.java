package com.company.SerializationandDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {




    public static void main(String[] args) {

         Employee emp = new Employee();
        emp.setName("shivam");
        emp.setRollno(1);
        emp.setPassword("pass1234");

        try {
            FileOutputStream fileout = new FileOutputStream("file1.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fileout);

            obj.writeObject(emp);
            obj.close();
            fileout.close();
            System.out.println("serialized data is saved");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
