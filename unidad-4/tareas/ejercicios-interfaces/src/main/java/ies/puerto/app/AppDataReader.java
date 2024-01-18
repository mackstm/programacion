package ies.puerto.app;

import ies.puerto.abstrac.DataReaderAbstract;
import ies.puerto.impl.DatabaseDataReader;
import ies.puerto.impl.FileDataReader;
import ies.puerto.interfaz.IDataReader;

public class AppDataReader {
    static DataReaderAbstract dataReader;

    public static void main(String[] args) {
        dataReader = new DatabaseDataReader();
        System.out.println(dataReader.open());
        System.out.println(dataReader.read());
        System.out.println(dataReader.close());
        type(dataReader);
    }

    public static void type(DataReaderAbstract dataReader) {
        System.out.println(dataReader.getClass().getName());
    }
}
