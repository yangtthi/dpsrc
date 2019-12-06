package test;

/**
 * @Description: TODO
 * @Author wyatt
 * @Data 2019/12/02 16:14
 */
public class Mian {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        System.out.println(bookShelf.getLength());
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
