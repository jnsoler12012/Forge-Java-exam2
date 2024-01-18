package com.nicolas.examen.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Song title may not be null")
    @Size(min = 2, message = "Song title should have min two chars")
    private String title;

    @NotNull(message = "genre may not be null")
    @Size(min = 2, message = "genre should have min two chars")
    private String genre;


    @NotNull(message = "lyrics may not be null")
    @Size(min = 5, message = "lyrics should have min 5 chars")
    private String lyrics;

    private int numberOfUpdates;

    @Column(updatable = false)
    private Date createdAt;
    private Date updatedAt;
}
