package Abstraction.service;

import Encapsulation.User;

public interface UserService {

    String userByRoleId(int id);
    User userByFirstName(String firstName);


}
