package org.example.controller;

import org.example.entity.FileInfo;
import org.example.exception.FileNotFoundException;
import org.example.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/files")
public class FileController {
    @Autowired
    private FileService mFileService;

    @PostMapping("/save")
    public void saveFile(@RequestBody FileInfo fileInfo) {
        boolean result = mFileService.saveFile(fileInfo);
        if(result) {
            System.out.println("File " + fileInfo.getId() + " saved successfuly!");
        } else {
            System.out.println("Unknown error occured while saving file " + fileInfo.getId() + ".");
        }
    }

    @GetMapping("/{id}")
    public String getFile(@PathVariable int id) throws FileNotFoundException {
        return mFileService.getFile(id);
    }
}
