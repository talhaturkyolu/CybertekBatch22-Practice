package Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETED("Completed"), UAT_TEST("Uat Testing");
    private final String value;
}
