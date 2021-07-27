package Abstraction.implementation;

import Abstraction.service.UserService;
import Encapsulation.Role;
import Encapsulation.User;
import Enums.Gender;

public class UserServiceImplementation implements UserService {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Talha","Trkyolu",new Role(2,"Tester"), Gender.MALE);
        User user1 = new User("Hafize","Aksoy",new Role(3,"Tester"), Gender.FEMALE);
        User user2 = new User("Nuriddin","Trkyolu",new Role(4,"Tester"), Gender.MALE);
        User user3 = new User("Anton","Zgurskiy",new Role(5,"Tester"), Gender.MALE);
        return user2.getFirsName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User("Elif","Aksoy",new Role(4,"Developer"), Gender.FEMALE);
        return user;
    }

    // hafize is done
}
