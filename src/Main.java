import person.Person;
import personComparator.PersonComparator;

import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        PersonComparator personComparator = new PersonComparator(2);
        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Игорь", "Корсаков", 28));
        people.add(new Person("Олег", "Корсаков", 48));
        people.add(new Person("Ольга", "Иванова", 15));
        people.add(new Person("Махмуд", "Тургун Шарифзаде", 18));
        people.add(new Person("Махмуд", "Тургун Шариф", 10));
        people.add(new Person("Мах", "Тур Шаиф", 10));
        people.add(new Person("Маха", "Тур Шаиф Али", 19));
        for (Person o : people) {
            System.out.printf("Фамилия: %s. Имя: %s. Возраст: %d\n", o.getSurname(), o.getName(), o.getAge());
        }
    }
}