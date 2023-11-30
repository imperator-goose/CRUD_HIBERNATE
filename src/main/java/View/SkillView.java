package View;

import Controller.SkillController;
import Model.Skill;
import Model.Status;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkillView {
    SkillController skillController;
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Scanner scanner;
    public void startWorkingSkill(){
        boolean is = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите сделать со Skill?");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        int choice = scanner.nextInt();
        while(is){
            switch (choice) {
                case 1:
                    addNewSkills();
                    is = false;
                    break;
                case 2:
                    getSkillById();
                    is = false;
                    break;
                case 3:
                    showAllSkills();
                    is = false;
                    break;
                case 4:
                    updateSkill();
                    is = false;
                    break;
                case 5:
                    deleteSkill();
                    is = false;
                    break;
                }
            }
        }

    private void deleteSkill() {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            scanner = new Scanner(System.in);

            System.out.println("Введите ID навыка, который хотите удалить");
            int id = scanner.nextInt();
            skillController.delete(id);
            System.out.println(skillController.read(id));
            startWorkingSkill();

            transaction.commit();
        }

    }

    public List<Skill> addNewSkills() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            List<Skill> skills = new ArrayList<>();
            String nameSkill;

            Skill skill = new Skill();
            System.out.println("Введите название скилла");
            nameSkill = scanner.nextLine();
            skill.setName(nameSkill);
//            skill.setStatus(Status.ACTIVE);
            session.save(skill);
            skills.add(skill);

            transaction.commit();

            return skills;
        }
    }

    private void getSkillById() {
        try (Session session = sessionFactory.openSession()) {
            scanner = new Scanner(System.in);

            System.out.println("Пожалуйста, введите ID скилла, который хотите найти: ");
            int skillId = scanner.nextInt();

            Skill skillById = session.get(Skill.class, skillId);
            System.out.println("Найден скилл: " + skillById);

            startWorkingSkill();
        }
    }

    private void showAllSkills() {
        try (Session session = sessionFactory.openSession()) {
            List<Skill> skills = session.createQuery("FROM Skill", Skill.class).list();
            System.out.println(skills);

            startWorkingSkill();
        }
    }

    private void updateSkill() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Skill skill = new Skill();

            System.out.println("Введите id скилла, который хотите заменить");
            int id = scanner.nextInt();
            System.out.println("Введите новое имя скилла");
            scanner.nextLine();
            String name = scanner.nextLine();
            skill.setId(id);
            skill.setName(name);
            session.update(skill);
            System.out.println("Вы успешно изменили навык " + session.get(Skill.class, id));

            transaction.commit();

            startWorkingSkill();
        }



    }

    public static void main(String[] args) {
        SkillView skillView = new SkillView();
        skillView.startWorkingSkill();
    }
}
