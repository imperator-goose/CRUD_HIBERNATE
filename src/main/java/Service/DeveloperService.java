package Service;

import Model.Developer;
import Repository.DeveloperRepository;
import Repository.Impl.DeveloperRepositoryImpl;

import java.util.List;

public class DeveloperService implements DeveloperRepository {

    private DeveloperRepositoryImpl developerRepository;

    @Override
    public Developer getById(Integer integer) {
        return developerRepository.getById(integer);
    }

    @Override
    public Developer deleteById(Integer integer) {
        return developerRepository.getById(integer);
    }

    @Override
    public Developer save(Developer developer) {
        return developerRepository.save(developer);
    }

    @Override
    public Developer update(Developer item, Integer integer) {
        return developerRepository.update(item,integer);
    }

    @Override
    public List<Developer> getAll() {
        return developerRepository.getAll();
    }
}
