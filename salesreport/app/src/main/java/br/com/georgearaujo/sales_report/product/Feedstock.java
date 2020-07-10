package br.com.georgearaujo.sales_report.product;

import java.math.BigDecimal;

import br.com.georgearaujo.sales_report.product.abstracts.MerchandiseDefault;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Feedstock extends MerchandiseDefault {
    public Feedstock(String name, String description, BigDecimal price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }
}
