package org.example.service;

import org.example.entity.FileInfo;
import org.example.exception.FileNotFoundException;

public interface FileService {
    boolean saveFile(FileInfo fileInfo);

    String getFile(int fileId) throws FileNotFoundException;
}
