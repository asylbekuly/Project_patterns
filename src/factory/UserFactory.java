package factory;

import models.Admin;
import models.Member;

public class UserFactory {
    public static User createUser(String userType) {
        switch (userType) {
            case "Admin":
                return new Admin();
            case "Member":
                return new Member();
            default:
                throw new IllegalArgumentException("Unknown user type");
        }
    }
}