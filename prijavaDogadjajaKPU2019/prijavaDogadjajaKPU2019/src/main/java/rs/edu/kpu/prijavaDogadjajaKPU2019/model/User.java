package rs.edu.kpu.prijavaDogadjajaKPU2019.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUser;

    @NotNull(message = "Morate uneti korisničko ime")
    private String username;

    @NotNull(message = "Sifra mora biti uneta")
    private String password;

    @ManyToOne
    @JoinColumn(name = "fk_id_role")
    private Role fkIdRole;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getFkIdRole() {
        return fkIdRole;
    }

    public void setFkIdRole(Role fkIdRole) {
        this.fkIdRole = fkIdRole;
    }

}
