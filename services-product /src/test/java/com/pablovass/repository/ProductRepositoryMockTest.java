package com.pablovass.repository;

import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProductRepositoryMockTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenRetunListProduct() {
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1200.40"))
                .status("Created")
                .createAt(new Date()).build();

        productRepository.save(product01);

        List<Product> founds = productRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);
    }
}