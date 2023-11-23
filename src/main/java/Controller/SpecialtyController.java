package Controller;

import Model.Specialty;
import Repository.SpecialtyRepository;
import Service.SpecialtyService;

import java.util.List;

public class SpecialtyController {
    private SpecialtyRepository specialtyRepository = new SpecialtyRepository() {
        @Override
        public Specialty getById(Integer integer) {
            return null;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public Specialty save(Specialty specialty) {
            return null;
        }

        @Override
        public Specialty update(Specialty item) {
            return null;
        }

        @Override
        public List<Specialty> getAll() {
            return null;
        }
    };

    private SpecialtyService specialtyService = new SpecialtyService(specialtyRepository);
    public Specialty read(Integer id){
        return specialtyService.getById(id);
    }

    public List<Specialty> readAll(){
        return specialtyService.getAll();
    }

    public void update(Specialty specialty){
        specialtyService.update(specialty);
    }

    public void delete(Integer id){
        specialtyService.deleteById(id);
    }
}
