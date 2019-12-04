package rs.edu.kpu.prijavaDogadjajaKPU2019.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    private Integer idRole;

    @NotNull(message = "Morate uneti naziv role")
    private String nazivRole;

    @JsonIgnore
    @OneToMany(mappedBy = "fkIdRole")
    private List<User> users;

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNazivRole() {
        return nazivRole;
    }

    public void setNazivRole(String nazivRole) {
        this.nazivRole = nazivRole;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
