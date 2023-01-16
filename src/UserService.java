public class UserService {

    public Account createUser(String name) {
        return new User(name);
    }

    public Account createUserVip(String name) {
        return new UserVip(name);
    }

    public Account createUser(String name, String password) {
        return new User(name, password);
    }
}
