package Service;

import Model.Skill;
import Repository.SkillRepository;

import java.util.List;

public class SkillService implements SkillRepository{
    SkillRepository skillRepository;
    public SkillService(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }
    @Override
    public Skill getById(Integer id) {
        return skillRepository.getById(id);
    }

    @Override
    public void deleteById(Integer id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill update(Skill item) {
        return skillRepository.update(item);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepository.getAll();
    }
}
