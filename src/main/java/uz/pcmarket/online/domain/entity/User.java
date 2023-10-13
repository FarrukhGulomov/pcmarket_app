package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.utils.Role;

@Getter
@Setter
@Builder
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

    @OneToOne(optional = false)
    private Address address;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false,unique = true)
    private String email;

    @Builder.Default
    private Role role = Role.CLIENT;


}
