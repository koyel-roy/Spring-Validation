package spring.validation.validation.api.v1.products;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/products")
public class ProductApi {

    private ProductRepository repo;

    public ProductApi(ProductRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Product addOne(@RequestBody @valid Product product){
        return repo.save(product);
    }
    


}
