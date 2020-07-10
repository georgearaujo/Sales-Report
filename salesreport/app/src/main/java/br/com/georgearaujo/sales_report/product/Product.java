package br.com.georgearaujo.sales_report.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.georgearaujo.sales_report.product.abstracts.Merchandise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Merchandise {
    private List<Feedstock> feedstocks = new ArrayList<>();

    public BigDecimal calculateAmount() {
        final BigDecimal amount = BigDecimal.ZERO;
        for (Feedstock feedstock : feedstocks){amount.add(feedstock.getPrice());}
        return amount;
    }
}
