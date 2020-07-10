package br.com.georgearaujo.sales_report.util;

import android.widget.EditText;

import java.math.BigDecimal;

public class StringUtils {

    public static String getStringToField(EditText field){
        return formatString(field.getText().toString());
    }

    public static String formatString(String text){
        return text.trim();
    }
}
