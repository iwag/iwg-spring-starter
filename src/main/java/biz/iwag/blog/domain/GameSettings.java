package biz.iwag.blog.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A GameSettings.
 */
@Entity
@Table(name = "game_settings")
public class GameSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public GameSettings name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameSettings gameSettings = (GameSettings) o;
        if (gameSettings.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), gameSettings.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "GameSettings{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
