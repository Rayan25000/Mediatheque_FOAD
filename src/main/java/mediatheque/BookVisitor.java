package mediatheque;

public class BookVisitor implements Visitor{
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitCD(CD cd) {}
}
