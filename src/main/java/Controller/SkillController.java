package Controller;

import Model.Skill;
import Repository.SkillRepository;
import Service.SkillService;

import java.util.List;

public class SkillController {
    private final SkillService skillService = new SkillService();

    public Skill create(Skill skill){
        return skillService.save(skill);
    }

    public Skill read(Integer id){
        return skillService.getById(id);
    }

    public List<Skill> readAll(){
        return skillService.getAll();
    }

    public Skill update(Skill skill, Integer id){
        skillService.update(skill,id);
        return skill;
    }


    public Skill delete(Integer id){
        return skillService.deleteById(id);
    }

}
