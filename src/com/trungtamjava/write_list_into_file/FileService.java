package com.trungtamjava.write_list_into_file;

import java.io.*;
import java.util.List;

public class FileService {
    public static void writeToFile(List<Person> persons) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(persons);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static List<Person> readFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("person.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Person> persons = (List<Person>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return persons;
    }
}
