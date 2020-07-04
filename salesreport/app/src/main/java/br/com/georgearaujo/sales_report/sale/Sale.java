package br.com.georgearaujo.sales_report.sale;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.georgearaujo.sales_report.customer.Customer;
import br.com.georgearaujo.sales_report.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    private BigDecimal price;
    private Customer customer;
    private List<Item> items;
    private LocalDateTime dateSale;

}
