package lab10;

public interface Lendable {
    void lend();
    void returnBook();
    boolean isAvailable();
    int count = 0;
}
