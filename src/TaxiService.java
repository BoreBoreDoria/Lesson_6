public interface TaxiService {

    void callTaxi();
    void getMoney(int money);

    default void SayThanks(String name) {
        System.out.println("Спасибо за поездку - " + name);

    }
}
