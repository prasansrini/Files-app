package org.example.repository;

import java.util.Optional;

import org.example.entity.FileInfo;

public interface FileRepository {
    boolean saveFile(FileInfo fileInfo);

    Optional<FileInfo> getFile(int fileId);
}
