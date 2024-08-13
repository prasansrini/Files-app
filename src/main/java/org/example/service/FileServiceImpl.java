package org.example.service;

import java.util.Optional;

import org.example.entity.FileInfo;
import org.example.exception.FileNotFoundException;
import org.example.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileRepository mFileRepository;

    @Override
    public boolean saveFile(FileInfo fileInfo) {
        return mFileRepository.saveFile(fileInfo);
    }

    @Override
    public String getFile(int fileId) throws FileNotFoundException {
        Optional<FileInfo> fileToFind = mFileRepository.getFile(fileId);
        if(!fileToFind.isEmpty()) {
            return fileToFind.get().toString();
        }  else {
            throw new FileNotFoundException("File with " + fileId + " not found!");
        }
    }
}
