package com.proggersofluck.stankinviewservice.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Stairs")
public class Stair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "position_x")
    private float positionX;
    @Column(name = "position_y")
    private float positionY;
    @Column(name = "floor")
    private int floor;
}
