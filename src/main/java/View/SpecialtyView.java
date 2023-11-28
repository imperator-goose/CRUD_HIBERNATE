package View;

import Controller.SpecialtyController;
import Model.Specialty;

import java.util.List;
import java.util.Scanner;

public class SpecialtyView {
//    Scanner scanner;
//    private SpecialtyController specialtyController = new SpecialtyController();
//    SpecialtyView(){
//        scanner = new Scanner(System.in);
//    }
//    public void writeNewSpecialty(){
//        Specialty specialtyToSave = new Specialty();
//        System.out.println("Введите название Specialty");
//        String specialtyName = scanner.nextLine();
//        specialtyToSave.setName(specialtyName);
//    }
//
//    public void updateSpecialty(){
//        System.out.println("Введите id Specialty для обновления ");
//        Integer id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Введите новое название Specialty");
//        String nameSpecialty = scanner.nextLine();
//        Specialty specialtyToSave = new Specialty(id, nameSpecialty);
//
//        specialtyController.update(specialtyToSave);
//    }
//
//    public void deleteSpecialty(){
//        System.out.println("Введите id Specialty для удаления");
//        Integer id = scanner.nextInt();
//
//        specialtyController.delete(id);
//    }
//
//    public void getAllSpecialties(){
//        List<Specialty> specialties = specialtyController.readAll();
//        for (Specialty item: specialties) {
//            System.out.println(item);
//
//        }
//    }
//
//    public void findSpecialtyById() {
//        System.out.println("Введите id Specialty для поиска");
//        Integer id = scanner.nextInt();
//
//        Specialty specialty = specialtyController.read(id);
//        System.out.println(specialty);
//    }
}
