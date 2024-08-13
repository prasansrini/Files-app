package org.example.service;

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
        FileInfo fileInfo = mFileRepository.getFile(fileId);

        if(fileInfo == null) {
            throw new FileNotFoundException("File with " + fileId + " not found!");
        }

        return fileInfo.toString();
    }
}
