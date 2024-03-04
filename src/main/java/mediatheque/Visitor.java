package mediatheque;

public interface Visitor {
    void visitBook(Book book);
    void visitCD(CD cd);
}
