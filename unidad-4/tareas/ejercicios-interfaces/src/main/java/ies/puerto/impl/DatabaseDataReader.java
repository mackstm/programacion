package ies.puerto.impl;

import ies.puerto.abstrac.DataReaderAbstract;
import ies.puerto.interfaz.IDataReader;

public class DatabaseDataReader extends DataReaderAbstract {

    @Override
    public String read() {
        return "Reading data from database";
    }

    @Override
    public String open() {
        return "Opening database";
    }

    @Override
    public String close() {
        return "Closing database";
    }
}
