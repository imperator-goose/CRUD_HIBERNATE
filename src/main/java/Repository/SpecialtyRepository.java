package Repository;

import Model.Specialty;

public interface SpecialtyRepository extends GenericRepository<Specialty, Integer>{
    Specialty update(Specialty specialty, Integer id);
}
