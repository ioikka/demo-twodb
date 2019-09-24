package io.ikka.demo.twodb.model.customer;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users")
@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String name;
}
