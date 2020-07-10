package br.com.georgearaujo.sales_report.sale;

import br.com.georgearaujo.sales_report.product.abstracts.Merchandise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Merchandise merchandise;
    private Integer amount;
}
