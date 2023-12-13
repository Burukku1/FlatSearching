package by.skachkovdmitry.flatSearching.core.dto.exception;

import java.util.Objects;

public class ErrorDetail {
    private String message;

    private String field;

    public ErrorDetail() {
    }

    public ErrorDetail(String message, String field) {
        this.message = message;
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ErrorDetail that)) return false;
        return Objects.equals(message, that.message) && Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, field);
    }
}
