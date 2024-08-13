package org.example.repository;

import org.example.entity.FileInfo;

public interface FileRepository {
    boolean saveFile(FileInfo fileInfo);

    FileInfo getFile(int fileId);
}
