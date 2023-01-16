package old;

import old.Account;

public class User extends Account {

    public User(String name) {
        super.name = name;
    }

    public User(String name, String password) {
        super.name = name;
        super.password = password;
    }
}
