package br.com.georgearaujo.sales_report.exception;

public class InvalidFieldException extends Exception {

    public InvalidFieldException(String message, Throwable cause){
        super(message, cause);
    }

    public InvalidFieldException(String message){
        super(message);
    }
}
