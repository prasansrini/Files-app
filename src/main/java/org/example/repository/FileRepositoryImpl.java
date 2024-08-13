package org.example.repository;

import java.util.Optional;

import org.example.entity.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class FileRepositoryImpl implements FileRepository {

    @Autowired
    private EntityManager mEntityManager;

    @Override
    @Transactional
    public boolean saveFile(FileInfo fileInfo) {
        mEntityManager.persist(fileInfo);

        return true;
    }

    @Override
    public Optional<FileInfo> getFile(int fileId) {
        return Optional.ofNullable(mEntityManager.find(FileInfo.class, fileId));
    }    
}
