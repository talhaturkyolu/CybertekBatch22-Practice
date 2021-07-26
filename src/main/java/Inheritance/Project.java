package Inheritance;

import Encapsulation.User;
import Enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project extends BaseEntity{

    private String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetail;

    public Project(long id, LocalDateTime insertDateTime, long insertUserid, LocalDateTime lastUpdatedTime, long lastUpdatedUserid,
                   String projectCode, String projectName, User assignedManager, LocalDate startDate, LocalDate endDate,
                   Status projectStatus, String projectDetail) {
        super(id, insertDateTime, insertUserid, lastUpdatedTime, lastUpdatedUserid);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;
    }
}
