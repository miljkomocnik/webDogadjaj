package rs.edu.kpu.prijavaDogadjajaKPU2019.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.edu.kpu.prijavaDogadjajaKPU2019.model.Dogadjaj;

@Repository
public interface DogadjajRepository extends CrudRepository<Dogadjaj, Integer> {

}
