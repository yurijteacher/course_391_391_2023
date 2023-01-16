package ua.com.shop.course_391_391_2023.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int age;
    private int phone;
    private String email;

    @OneToMany(mappedBy = "clientes")
    private List<Order> orderes;

    @OneToMany(mappedBy = "clientts")
    private List<Address> addresses;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    public Users user;

}
