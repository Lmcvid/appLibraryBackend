package com.example.appLibraryBackend.modelos;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data // usar anotaciones de Lombok, Para utilizar los metodos get & setter y métodoconstructor.
@NoArgsConstructor // Método constructor vacío
@AllArgsConstructor// Metodo constructor con todos los atributos.
@Setter
@Getter
@Entity // Define esta clase como una entidad (tabla).
@Table(name="tbllibro") //Darle nombre a la tabla de sql.

public class Libro {
    @Id //Define al atributo id como primary Key. Se pone sobre el atributo que lleva la observación.
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Genera Id automatico consecutivamente.
    @Column(name="idbook", nullable = false, length = 20, unique = true) //Para darle otro nombre en la tabla.
    private Long id;
    private String name;
}
