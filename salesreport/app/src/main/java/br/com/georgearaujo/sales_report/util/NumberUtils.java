package br.com.georgearaujo.sales_report.util;

import android.widget.EditText;

import java.math.BigDecimal;

public class NumberUtils {

    public static BigDecimal getBigDecimalToField(EditText field){
        return getBigDecimal(field.getText().toString());
    }

    public static BigDecimal getBigDecimal(String number){
        return new BigDecimal(number);
    }
}
