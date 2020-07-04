package br.com.georgearaujo.sales_report.product;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends Merchandise {

    private List<Merchandise> merchandises;
    private Integer workHours;

    public void addMaterialToTheProduct(@NonNull Merchandise merchandise){
        if(merchandises == null){
            merchandises = new ArrayList();
        }
        merchandises.add(merchandise);
    }
}
