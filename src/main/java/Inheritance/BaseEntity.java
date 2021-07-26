package Inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    private long id;
    private LocalDateTime insertDateTime;
    private long insertUserid;
    private LocalDateTime lastUpdatedTime;
    private long lastUpdatedUserid;

}
