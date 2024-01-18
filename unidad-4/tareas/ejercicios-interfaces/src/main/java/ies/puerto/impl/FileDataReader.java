package ies.puerto.impl;

import ies.puerto.interfaz.IDataReader;

public class FileDataReader implements IDataReader {

    @Override
    public String read() {
        return "Data from file has been read";
    }

    @Override
    public String open() {
        return "Opening file system";
    }

    @Override
    public String close() {
        return "Closing file system";
    }
}
