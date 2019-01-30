package com.internship.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@EnableAsync
@Service
public class FileService implements FileServiceImpl {

    @Value("${path_to_file}")
    private String path;

    public String readFromFile(String filename) {

        String text = "";

        FileReader reader = null;
        try {
            reader = new FileReader(path + filename + ".txt");

            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()){
                text += scanner.nextLine() + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (text.equals("")){
            text = "File is empty!!!";
        }

        return text;
    }
}
