import person.Person;

import java.util.*;


import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Comparator<Person> comparator = Main::compare;

        TreeSet<Person> people = new TreeSet<>(comparator);
        people.add(new Person("Игорь", "Корсаков", 28));
        people.add(new Person("Олег", "Корсаков", 48));
        people.add(new Person("Ольга", "Иванова", 15));
        people.add(new Person("Махмуд", "Тургун Шарифзаде", 18));
        people.add(new Person("Махмуд", "Тургун Шариф", 10));
        people.add(new Person("Мах", "Тур Шаиф", 10));
        people.add(new Person("Маха", "Тур Шаиф Али", 19));
        System.out.println(people.removeIf(person -> (person.getAge() <= 18)));
        for (Person o : people) {
            System.out.printf("Фамилия: %s. Имя: %s. Возраст: %d . Возраст больше 18 лет из списка не удален.\n", o.getSurname(), o.getName(), o.getAge());
        }
    }

    private static int compare(Person o1, Person o2) {
        int lengthSurnameFistPerson = o1.getSurname().split("\\S").length;
        int lengthSurnameSecondPerson = o2.getSurname().split("\\S").length;
        if (lengthSurnameFistPerson == lengthSurnameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return lengthSurnameFistPerson > lengthSurnameSecondPerson ? 1 : -1;
    }
}