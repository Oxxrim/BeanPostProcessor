package com.internship.controller;

import com.internship.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController()
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/file")
    public String readTextFromFile(@RequestParam String filename) throws IOException {

        String text = fileService.readFromFile(filename);

        return text;
    }
}
