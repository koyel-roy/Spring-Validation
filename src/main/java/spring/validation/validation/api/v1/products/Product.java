package spring.validation.validation.api.v1.products;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table(name = "products")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 512, unique = true)
    @NotBlank(message = "product name cannot be blank")
    @Length(min = 5, max = 512, message ="Product name must be between 5-512 characters" )
    private String name;
    
    @Min(value = 10, message = "Product price must be greater or equal to 10")
    @Max(value = 9999, message = "Product prices must be less than or equal to 9999")
    private float price;

    public Product(){}

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }
    
}
