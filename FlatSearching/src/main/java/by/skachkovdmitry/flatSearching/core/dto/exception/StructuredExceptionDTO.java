package by.skachkovdmitry.flatSearching.core.dto.exception;


import java.util.List;

public class StructuredExceptionDTO {
    private final String logref = "STRUCTURED_ERROR";

    private List<ErrorDetail> errors;


    public StructuredExceptionDTO() {
    }

    public StructuredExceptionDTO(List<ErrorDetail> errors) {
        this.errors = errors;
    }

    public String getLogref() {
        return logref;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }
}
