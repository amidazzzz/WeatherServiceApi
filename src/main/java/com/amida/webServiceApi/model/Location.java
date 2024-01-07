package com.amida.webServiceApi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
