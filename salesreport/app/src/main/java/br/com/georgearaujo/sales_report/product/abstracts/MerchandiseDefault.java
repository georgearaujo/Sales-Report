package br.com.georgearaujo.sales_report.product.abstracts;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class MerchandiseDefault {
    protected Integer id;
    protected String name;
    protected String description;
    protected BigDecimal price;

    @Override
    public String toString() {
        return "MerchandiseDefault{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
