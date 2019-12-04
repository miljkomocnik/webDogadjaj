package rs.edu.kpu.prijavaDogadjajaKPU2019.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tip_dogadjaja")
public class TipDogadjaja implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipDogadjaja;

    @NotNull(message = "naziv tipa mora biti unet")
    private String nazivTipa;

    @ManyToOne
    @JoinColumn(name = "fk_nad_tip")
    private TipDogadjaja fkNadTip;

    @OneToMany(mappedBy = "fkNadTip")
    private List<TipDogadjaja> tipoviDogadjaja;

    @OneToMany(mappedBy = "fkDogadjajTipId")
    private List<Dogadjaj> listaDogadjaja;

    public Integer getIdTipDogadjaja() {
        return idTipDogadjaja;
    }

    public void setIdTipDogadjaja(Integer idTipDogadjaja) {
        this.idTipDogadjaja = idTipDogadjaja;
    }

    public String getNazivTipa() {
        return nazivTipa;
    }

    public void setNazivTipa(String nazivTipa) {
        this.nazivTipa = nazivTipa;
    }

    public TipDogadjaja getFkNadTip() {
        return fkNadTip;
    }

    public void setFkNadTip(TipDogadjaja fkNadTip) {
        this.fkNadTip = fkNadTip;
    }

    public List<TipDogadjaja> getTipoviDogadjaja() {
        return tipoviDogadjaja;
    }

    public void setTipoviDogadjaja(List<TipDogadjaja> tipoviDogadjaja) {
        this.tipoviDogadjaja = tipoviDogadjaja;
    }
}
