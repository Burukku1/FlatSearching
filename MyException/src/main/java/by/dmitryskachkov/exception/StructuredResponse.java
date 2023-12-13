package by.dmitryskachkov.exception;




import by.dmitryskachkov.exception.enumeration.ErrorType;

import java.util.List;
import java.util.Objects;


public class StructuredResponse extends Exception {

    private ErrorType type;

    private List<ErrorDetail> errors;


    public StructuredResponse() {
    }

    public StructuredResponse(ErrorType type) {
        this.type = type;
    }


    public void addToList(ErrorDetail addError) {
        this.errors.add(addError);
    }

    public StructuredResponse(List<ErrorDetail> errors) {
        this.errors = errors;
    }


    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }

    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StructuredResponse that)) return false;
        return type == that.type && Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, errors);
    }
}
