package Service;

import Model.Specialty;
import Repository.SpecialtyRepository;

import java.util.List;

public class SpecialtyService implements SpecialtyRepository{
    SpecialtyRepository specialtyRepository;
    public SpecialtyService(SpecialtyRepository specialtyRepository){
        this.specialtyRepository = specialtyRepository;
    }
    @Override
    public Specialty getById(Integer id) {
        return specialtyRepository.getById(id);
    }

    @Override
    public void deleteById(Integer id) {
        specialtyRepository.deleteById(id);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    @Override
    public Specialty update(Specialty item) {
        return specialtyRepository.update(item);
    }

    @Override
    public List<Specialty> getAll() {
        return specialtyRepository.getAll();
    }
}
