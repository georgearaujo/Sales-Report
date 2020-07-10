package br.com.georgearaujo.sales_report.util;

import android.widget.EditText;

import br.com.georgearaujo.sales_report.exception.InvalidFieldException;

public class ValidateUtils {
    public static void validateEmptyString(EditText editText, String stringException) throws InvalidFieldException {
        if(editText.getText().toString().trim().isEmpty()){
            throw new InvalidFieldException(stringException);
        }
    }
}
