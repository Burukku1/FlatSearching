package by.dmitryskachkov.exception;


import by.dmitryskachkov.exception.enumeration.ErrorType;

import java.util.Objects;


public class Response extends Exception {


    private ErrorType type;
    private String message;


    public Response() {
    }

    public Response(String message, ErrorType type) {
        this.message = message;
        this.type = type;
    }

    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response that)) return false;
        return type == that.type && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, message);
    }
}

