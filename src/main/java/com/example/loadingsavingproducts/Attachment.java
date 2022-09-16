package com.example.loadingsavingproducts;

public class Attachment {
    private final String _fileName;
    private final byte[] _fileContents;

    public Attachment(String fileName, byte[] fileContents){
        _fileName = fileName;
        _fileContents = fileContents;
    }

    public String getFileName() {
        return _fileName;
    }

    public byte[] getFileContents() {
        return _fileContents;
    }
}
