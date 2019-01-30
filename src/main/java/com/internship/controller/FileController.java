package com.internship.controller;

import com.internship.service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController()
public class FileController {

    @Autowired
    private FileServiceImpl fileServiceImpl;

    @GetMapping("/file")
    public String readTextFromFile(@RequestParam String filename) throws IOException {

        String text = fileServiceImpl.readFromFile(filename);

        return text;
    }
}
