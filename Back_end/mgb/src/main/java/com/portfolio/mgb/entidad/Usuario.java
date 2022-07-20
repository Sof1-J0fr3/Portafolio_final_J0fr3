package com.portfolio.mgb.entidad;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Usuario{
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
    private Long id;
@NotNull
@Size(min=1, max=30)
    private String nombre;
@NotNull
@Size(min=1, max=30)
    private String apellido;

@Size(min=1, max=30)
    private String img;
    
}