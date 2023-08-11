package org.aguzman.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios") //Nombre de la tabla asignada a esta clase. Cada atributo de esta clase, va a pertenecer a campos de la tabla
//(Es opcinal colcoar @table, sino se define por default el nombre de la tabla es el mismo que el nombre de la clase,
// en este caso Usuarios)
public class Usuario {

    //Atributo id es la primary key.Toda clase Entity requiere de una PK
    @Id
    //IDENTITY El motor de la DB genera de forma la PK de forma incremental automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column - El name se utiliza cuando en la tabla la columna se llama distinto que en el atributo.
    //Si los campos se llaman igual se omite el @column
    private String nombre;
    @Column(unique = true)
    private String email;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
