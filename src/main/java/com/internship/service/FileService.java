package com.internship.service;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


@Service
public class FileService implements FileServiceImpl {

    @Value("${path_to_file}")
    private String path;

    public String readFromFile(String filename) throws IOException {

        String text = "";
        File file = new File(path + filename + ".txt");

        if (!file.exists()){
            text = "The file does not exist";
        } else {
            text = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name());
        }

        return text;
    }
}
