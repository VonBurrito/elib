package org.elib.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Hamza Amentag
 * @since 5/6/2022
 */
@Entity
@Table(name = "AUTHOR")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME")
    //@NotNull
    private String firstName;

    @Column(name = "LAST_NAME")
    //@NotNull
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dob;

    @Column(name = "NATIONALITY")
    //@NotNull
    private String nationality;

    @ManyToMany
    @JoinTable(
            name = "AUTHOR_PERIODIC",
            joinColumns = @JoinColumn(name = "AUTHOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "PERIODIC_ID"))
    private List<Periodic>  periodics;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHOR_BOOK",
                joinColumns = @JoinColumn(name = "AUTHOR_ID"),
                inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> books;

    public Author() {
    }

    public Author(Long id, String firstName, String lastName, LocalDate dob, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.nationality = nationality;
    }

    public Author(String firstName, String lastName, LocalDate dob, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
