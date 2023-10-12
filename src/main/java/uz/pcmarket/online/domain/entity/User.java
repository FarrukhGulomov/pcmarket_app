package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.utils.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false,unique = true)
    private String phone;

    @Builder.Default
    private Role role=Role.GUEST;

    @OneToOne
    private Address address;
}
