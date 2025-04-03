package com.example.appLibraryBackend.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/*@Data // usar anotaciones de Lombok, Para utilizar los metodos get & setter y métodoconstructor.
@NoArgsConstructor // Método constructor vacío
@AllArgsConstructor// Metodo constructor con todos los atributos.
@Setter
@Getter*/
//@Entity // Define esta clase como una entidad (tabla).
@Entity
//@Table(name="tbllibro") //Darle nombre a la tabla de sql.

public class Libro {
    @Id //Define al atributo id como primary Key. Se pone sobre el atributo que lleva la observación.
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Genera Id automatico consecutivamente.
    //@Column(name="idbook", nullable = false, length = 20, unique = true) //Para darle otro nombre en la tabla.
    @Column(length = 20) //Para darle otro nombre en la tabla.
    private Long id;
    @Column(nullable=false, length = 30)
    private String name;

    // Relación o asociación de que un libro puede tener varios prestamos.
    @OneToMany(mappedBy = "libro") //Entidad de libro toma la relación uno
    @JsonManagedReference
    private List<Prestamo> prestamos;

    // Constructores
    public Libro(){}

    public Libro(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
