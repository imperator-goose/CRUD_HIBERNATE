package Controller;

import Model.Skill;
import Repository.SkillRepository;
import Service.SkillService;

import java.util.List;

public class SkillController {
    private SkillRepository skillRepository = new SkillRepository() {
        @Override
        public Skill getById(Integer integer) {
            return null;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public Skill save(Skill skill) {
            return null;
        }

        @Override
        public Skill update(Skill item) {
            return null;
        }

        @Override
        public List<Skill> getAll() {
            return null;
        }
    };
    private SkillService skillService = new SkillService(skillRepository);

    public Skill create(Skill skill){
        return skillService.save(skill);
    }
    public Skill read(Integer id){
        return skillService.getById(id);
    }

    public List<Skill> readAll(){
        return skillService.getAll();
    }

    public void update(Skill skill){
        skillService.update(skill);
    }

    public void delete(Integer id){
        skillService.deleteById(id);
    }
}
