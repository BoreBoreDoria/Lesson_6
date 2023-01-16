import old.Account;

public interface Car extends Mechanism {

    void drive();

    String info();

    default void openDoor(){
        System.out.println("Дверь открывается");
    }
}
