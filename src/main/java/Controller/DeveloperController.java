package Controller;

import Model.Developer;
import Repository.DeveloperRepository;
import Repository.Impl.DeveloperRepositoryImpl;
import Service.DeveloperService;

import java.util.List;

public class DeveloperController {
    private final DeveloperRepositoryImpl developerRepository = new DeveloperRepositoryImpl();

    public Developer create(Developer developer){
        return developerRepository.save(developer);
    }

    public Developer read(Integer id){
        return developerRepository.getById(id);
    }

    public List<Developer> getAll(){
        return developerRepository.getAll();
    }

    public Developer update(Developer developer, Integer id){
        developerRepository.update(developer,id);
        return developer;
    }

    public Developer delete(Integer id){
        return developerRepository.deleteById(id);
    }

}
