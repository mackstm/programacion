package es.ies.puerto.model.interfaces;

import es.ies.puerto.model.entity.BookEntity;
import es.ies.puerto.model.entity.LibraryEntity;

import java.util.List;

/**
 * Library interface
 * @author Jose Maximiliano Boada Martin
 */
public interface ILibrary {
    public LibraryEntity searchLibrary(int id);
    public LibraryEntity searchLibrary(LibraryEntity library);
    public LibraryEntity updateLibrary(LibraryEntity library);
    public LibraryEntity deleteLibrary(LibraryEntity library);
    public List<BookEntity> searchBooksInLibrary(LibraryEntity library);
}
