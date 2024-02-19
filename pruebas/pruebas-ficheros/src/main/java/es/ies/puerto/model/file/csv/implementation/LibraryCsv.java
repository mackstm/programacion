package es.ies.puerto.model.file.csv.implementation;

import es.ies.puerto.model.entity.BookEntity;
import es.ies.puerto.model.entity.LibraryEntity;
import es.ies.puerto.model.interfaces.ILibrary;

import java.io.File;
import java.util.List;

/**
 * I don't know what's even going on anymore
 * @author Jose Maximiliano Boada Martin
 */
public class LibraryCsv implements ILibrary {

    public boolean fileExists(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    public boolean isDirectory(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    @Override
    public LibraryEntity searchLibrary(int id) {
        return null;
    }

    @Override
    public LibraryEntity searchLibrary(LibraryEntity library) {
        return null;
    }

    @Override
    public LibraryEntity updateLibrary(LibraryEntity library) {
        return null;
    }

    @Override
    public LibraryEntity deleteLibrary(LibraryEntity library) {
        return null;
    }

    @Override
    public List<BookEntity> searchBooksInLibrary(LibraryEntity library) {
        return null;
    }
}
