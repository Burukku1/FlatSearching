package by.dmitryskachkov.exception.enumeration;

public enum ErrorType {

    FOUR("400"),
    FIVE("500");

    private final String type;

    ErrorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
