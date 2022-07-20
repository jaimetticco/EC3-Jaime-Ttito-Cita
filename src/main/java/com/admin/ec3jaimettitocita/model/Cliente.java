package com.admin.ec3jaimettitocita.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    private String nombre;
    private String celular;


    @JsonIgnoreProperties({"clientes","hospitals"})
    @ManyToMany(mappedBy = "clientes", cascade ={CascadeType.PERSIST, CascadeType.MERGE})
    private List<Hospital>hospitals = new ArrayList<>();


}
