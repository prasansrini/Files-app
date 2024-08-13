package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "file_info")
@EntityListeners(FileInfo.class)
public class FileInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_size")
    private Integer fileSize;

    @Column(name = "file_description")
    private String fileDescription;

    @Column(name = "file_type")
    private String fileType;

    public FileInfo() {
    }

    public FileInfo(String fileName, Integer fileSize, String fileDescription, String fileType) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileDescription = fileDescription;
        this.fileType = fileType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", fileDescription='" + fileDescription + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}
