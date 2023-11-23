package Service;

import Model.Developer;
import Repository.DeveloperRepository;

import java.util.List;

public class DeveloperService implements DeveloperRepository {
    DeveloperRepository developerRepository;
    public DeveloperService(DeveloperRepository developerRepository){
        this.developerRepository = developerRepository;
    }
    @Override
    public Developer getById(Integer id) {
        return developerRepository.getById(id);
    }

    @Override
    public void deleteById(Integer id) {
        developerRepository.deleteById(id);
    }

    @Override
    public Developer save(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Developer update(Developer item) {
        return developerRepository.update(item);
    }

    @Override
    public List<Developer> getAll() {
        return developerRepository.getAll();
    }
}
