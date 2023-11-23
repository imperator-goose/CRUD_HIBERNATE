package View;

import Controller.SkillController;
import Model.Skill;

import java.util.List;
import java.util.Scanner;

public class SkillView {
    Scanner scanner;
    private SkillController skillController = new SkillController();
    SkillView(){
        scanner = new Scanner(System.in);
    }
    public void writeNewSkill(){
        Skill skillToSave = new Skill();
        System.out.println("Введите название Skill");
        String nameSkill = scanner.nextLine();
        skillToSave.setName(nameSkill);

        skillController.create(skillToSave);
    }

    public void updateSkill(){
        System.out.println("Введите id Skill для обновления ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите новое название Skill");
        String nameSkill = scanner.nextLine();
        Skill skillToSave = new Skill(id, nameSkill);

        skillController.update(skillToSave);
    }

    public void deleteSkill(){
        System.out.println("Введите id Skill для удаления");
        Integer id = scanner.nextInt();

        skillController.delete(id);
    }

    public void getAllSkill(){
        List<Skill> specialties = skillController.readAll();
        for (Skill item: specialties) {
            System.out.println(item);

        }
    }

    public void findSkillById() {
        System.out.println("Введите id Skill для поиска");
        Integer id = scanner.nextInt();

        Skill skill = skillController.read(id);
        System.out.println(skill);
    }
}
