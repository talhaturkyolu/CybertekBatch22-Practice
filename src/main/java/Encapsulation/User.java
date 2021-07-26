package Encapsulation;

import Enums.Gender;
import Inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    private String firsName;
    private String lastName;
    private Role role;
    private Gender gender;


    public User(long id, LocalDateTime insertDateTime, long insertUserid, LocalDateTime lastUpdatedTime, long lastUpdatedUserid,
                String firsName, String lastName, Role role, Gender gender) {
        super(id, insertDateTime, insertUserid, lastUpdatedTime, lastUpdatedUserid);
        this.firsName = firsName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;
    }

}
