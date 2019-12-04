package rs.edu.kpu.prijavaDogadjajaKPU2019.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dogadjaj")
public class Dogadjaj implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDogadjaja;

    @ManyToOne
    @JoinColumn(name = "fk_dogadjaj_tip_id")
    private TipDogadjaja fkDogadjajTipId;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User fkUserId;

    public Integer getIdDogadjaja() {
        return idDogadjaja;
    }

    public void setIdDogadjaja(Integer idDogadjaja) {
        this.idDogadjaja = idDogadjaja;
    }

    public TipDogadjaja getFkDogadjajTipId() {
        return fkDogadjajTipId;
    }

    public void setFkDogadjajTipId(TipDogadjaja fkDogadjajTipId) {
        this.fkDogadjajTipId = fkDogadjajTipId;
    }

    public User getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(User fkUserId) {
        this.fkUserId = fkUserId;
    }
}
