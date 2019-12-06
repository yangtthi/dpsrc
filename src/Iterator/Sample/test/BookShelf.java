package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @Author wyatt
 * @Data 2019/12/02 15:56
 */
public class BookShelf implements Aggregate{
    private List<Book> books;
    private int last;

    public Book getBoolAt(int index){
        return books.get(index);
    }

    public void appendBook(Book newBook){
        if(books == null || books.size() == 0){
            books = new ArrayList<>();
        }
        books.add(newBook);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
