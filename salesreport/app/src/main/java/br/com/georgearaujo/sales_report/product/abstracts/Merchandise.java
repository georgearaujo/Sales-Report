package br.com.georgearaujo.sales_report.product.abstracts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class Merchandise extends MerchandiseDefault {
    protected Integer workHours;

    @Override
    public String toString() {
        return "Merchandise{" +
                "workHours=" + workHours +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
