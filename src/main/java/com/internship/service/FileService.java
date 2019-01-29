package com.internship.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@Service
public class FileService {

    @Value("${path_to_file}")
    private String path;

    public String readFromFile(String filename) throws IOException {

        String text = "";

        FileReader reader = new FileReader(path + filename + ".txt");
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNextLine()){
            text += scanner.nextLine() + " ";
        }

        reader.close();

        if (text.equals("")){
            text = "File is empty!!!";
        }

        return text;
    }
}
