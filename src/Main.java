import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * ООП (Объектно-ориентированный язык)
         * Инкапсуляция
         * Наследование
         * Полиморфизм
         * Абстракция
         *----------------------------
         * Абстракция - когда мы используем простые вещи, при описани чего-то сложного
         * Эллементами абстракции в Java являются Объекты, классы, переменные
         * -------------------------------------------------------
         * Инкапсуляция - сокрытие полей внутри объекта с целью защиты данных от внешенго
         * воздействия
         * Это private Поля в Классе, к которым мы имеем доступ только через публичные методы.
         * Где Getter методы(getName), являются методами для получения данных,
         * а Setters(setName) для их изменения
         * -----------------------------------------------
         * Наследование - возможность описывать новые классы на основе уже существующих
         * Пример тому наследование классов через extends
         * --------------------------------------------------------
         * Полиморфизм - Данный принцип позволяет программистам использовать одни и те же термины для
         * описания различного поведения, зависящего от контекста.
         *
         * Самым простым примером полиморфизма, явлюятся - переопределние метода и его перегрузка
         *
         */

        //Пример полиморфизма на основе переопределния метода
        Animal animal = new Animal();// одни и те-же теримны ( Родитиельский класс Animal)
        Animal cat = new Cat();
        animal.test();// Описывают различное поведение ( при вызове методов, разный результат)
        cat.test();// зависящий от контекста ( смотря на то, какой именно экземлпяр класса выбран
        // , тот метод и используется.
        System.out.println();

        //Пример полиморфизма - 2 на основе перегрузки метода
        cat.test();



    }
}