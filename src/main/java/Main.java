import Abstraction.implementation.UserServiceImplementation;
import Encapsulation.Role;
import Encapsulation.User;
import Enums.Gender;
import Enums.Status;
import Inheritance.BaseEntity;
import Inheritance.Project;
import Polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // ---------------- ENUM -----------------
        System.out.println(Gender.MALE);
        System.out.println(Status.COMPLETED.getValue());


        // ------------ ENCAPSULATION -------------
        System.out.println("\nENCAPSULATION");
        User user = new User("Mike","Smith",new Role(1,"Manager"),Gender.MALE);
        System.out.println(user.getFirsName());
        System.out.println(user.getLastName());
        System.out.println(user.getGender());
        System.out.println(user.getRole().getDescription());
        user.getRole().setDescription("Tester");
        System.out.println(user.getRole().getDescription());


        // -------------- INHERITANCE -----------------
        System.out.println("\nINHERITANCE");
        Project project = new Project(10, LocalDateTime.now(),5,LocalDateTime.now(),4,"PRJ01",
                "CRM",new User("Mike","Project",new Role(2,"EMployee"),Gender.FEMALE), LocalDate.now(),
                LocalDate.now().plusMonths(6),Status.OPEN,"CRM detail app");

        System.out.println(project.getAssignedManager().getRole().getDescription());


        // -------------- ABSTRACTION -----------------
        System.out.println("\nABSTRACTION");
        UserServiceImplementation userServiceImplementation = new UserServiceImplementation();
        System.out.println(userServiceImplementation.userByRoleId(4));

        // ---- POLYMORPHISM-------------------
        System.out.println("\nPOLYMORPHISM");
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation1 = new UserServiceImplementation();

        ((Employee)employee2).getEmployeeHours(); // Down casting


    }
}
