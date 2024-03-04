package mediatheque;

public class CDVisitor implements Visitor{
    public void visitBook(Book book) {}

    @Override
    public void visitCD(CD cd) {
        cd.print();
    }
}
