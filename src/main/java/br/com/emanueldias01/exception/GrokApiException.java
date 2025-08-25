package br.com.emanueldias01.exception;


public class GrokApiException extends RuntimeException {
    public GrokApiException(String message) {
        super(message);
    }

    public GrokApiException(String message, Throwable cause) {
        super(message, cause);
    }
}

