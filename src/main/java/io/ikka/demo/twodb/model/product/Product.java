package io.ikka.demo.twodb.model.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "products")
@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String name;
}
