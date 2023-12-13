package by.skachkovdmitry.flatSearching.core.dto.exception;

import java.util.Objects;

public class ResponseExceptionDTO {

    private final String logref = "ERROR";
    private String message;


    public ResponseExceptionDTO() {
    }

    public ResponseExceptionDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLogref() {
        return logref;
    }
}
