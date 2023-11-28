package Service;

import Model.Specialty;
import Repository.Impl.SpecialtyRepositoryImpl;
import Repository.SpecialtyRepository;

import java.util.List;

public class SpecialtyService implements SpecialtyRepository{
    private SpecialtyRepositoryImpl specialtyRepository;
    @Override
    public Specialty getById(Integer integer) {
        return specialtyRepository.getById(integer);
    }

    @Override
    public Specialty deleteById(Integer integer) {
        return specialtyRepository.deleteById(integer);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    @Override
    public List<Specialty> getAll() {
        return specialtyRepository.getAll();
    }

    @Override
    public Specialty update(Specialty specialty, Integer id) {
        return null;
    }
}
