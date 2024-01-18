package com.nicolas.examen.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "email may not be null")
    @Size(min = 5, message = "email should have min two chars")
    private String username;

    @NotNull(message = "email may not be null")
    @Size(min = 5, message = "email should have min two chars")
    private String email;

    @NotNull(message = "email may not be null")
    @Size(min = 5, message = "email should have min two chars")
    private String password;

    
    @Transient
    private String passwordConfirmation;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
}
