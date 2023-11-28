package Service;

import Model.Skill;
import Repository.Impl.SkillRepositoryImpl;
import Repository.SkillRepository;

import java.util.List;

public class SkillService implements SkillRepository{
    private final SkillRepositoryImpl skillRepositoryImpl;

    public SkillService(SkillRepositoryImpl skillRepositoryImpl) {
        this.skillRepositoryImpl = skillRepositoryImpl;
    }
    public SkillService() {
        this.skillRepositoryImpl = new SkillRepositoryImpl();
    }

    @Override
    public Skill getById(Integer id) {
        return skillRepositoryImpl.getById(id);
    }

    @Override
    public Skill deleteById(Integer integer) {
        return skillRepositoryImpl.deleteById(integer);
    }

    @Override
    public Skill save(Skill skill) {
        return skillRepositoryImpl.save(skill);
    }

    @Override
    public Skill update(Skill item, Integer integer) {
        return skillRepositoryImpl.update(item,integer);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepositoryImpl.getAll();
    }
}
