package Controller;

import Model.Developer;
import Repository.DeveloperRepository;
import Service.DeveloperService;

import java.util.List;

public class DeveloperController {
    private DeveloperRepository developerRepository = new DeveloperRepository() {
        @Override
        public Developer getById(Integer integer) {
            return null;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public Developer save(Developer developer) {
            return null;
        }

        @Override
        public Developer update(Developer item) {
            return null;
        }

        @Override
        public List<Developer> getAll() {
            return null;
        }
    };

    private DeveloperService developerService = new DeveloperService(developerRepository);

    public Developer create(Developer developer){
        return developerService.save(developer);
    }

    public Developer read(Integer id){
        return developerService.getById(id);
    }

    public List<Developer> readAll(){
        return developerService.getAll();
    }

    public void update(Developer developer){
        developerService.update(developer);
    }

    public void delete(Integer id){
        developerService.deleteById(id);
    }


}
