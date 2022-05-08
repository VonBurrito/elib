package org.elib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Hamza Amentag
 * @since 5/6/2022
 */
@Entity
public class Periodic extends Document{

    @Column(name = "AUTORS")
    @ManyToMany(mappedBy = "periodics")
    protected List<Author> authors;

    public Periodic() {
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
