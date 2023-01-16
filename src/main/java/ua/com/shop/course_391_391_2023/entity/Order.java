package ua.com.shop.course_391_391_2023.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_created;
    private String payment;
    private String delivery;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Clients clientes;


    @OneToMany(mappedBy = "orders")
    private List<ProductHasOrder> productHasOrderList;

}
