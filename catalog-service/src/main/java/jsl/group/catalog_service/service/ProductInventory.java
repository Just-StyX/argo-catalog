package jsl.group.catalog_service.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ProductInventory {
    public static ProductList getProducts() {
        return new ProductList(
                List.of(
                        new Product("Banana", BigDecimal.valueOf(2.5)),
                        new Product("Pineapple", BigDecimal.valueOf(3.49)),
                        new Product("Diamond Customer", BigDecimal.valueOf(1555.9999)),
                        new Product("Gold Customer", BigDecimal.valueOf(1999.99999))
                ),
                LocalDateTime.now()
        );
    }
}
