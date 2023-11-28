package Controller;

import Model.Skill;
import Model.Specialty;
import Repository.Impl.SpecialtyRepositoryImpl;
import Repository.SpecialtyRepository;
import Service.SpecialtyService;

import java.util.List;

public class SpecialtyController {
    private final SpecialtyRepositoryImpl specialtyRepository = new SpecialtyRepositoryImpl();

    public Specialty create(Specialty specialty){
        return  specialtyRepository.save(specialty);
    }

    public Specialty read(Integer id){
        return specialtyRepository.getById(id);
    }

    public List <Specialty> getAll(){
        return specialtyRepository.getAll();
    }

    public Specialty update(Specialty specialty, Integer id){
        specialtyRepository.update(specialty, id);
        return specialty;
    }

    public Specialty delete(Integer id){
        return specialtyRepository.deleteById(id);
    }
}
