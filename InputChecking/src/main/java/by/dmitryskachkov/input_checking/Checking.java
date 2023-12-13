package by.dmitryskachkov.input_checking;

public interface Checking {
    boolean isGoodEmail(String email);

    boolean isGoodPassword(String password);

    boolean isGoodFullName(String fullName);
}
