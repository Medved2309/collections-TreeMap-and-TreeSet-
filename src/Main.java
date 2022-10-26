import person.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> comparator = (o1, o2) -> {
            int lengthSurnameFistPerson = o1.getSurname().split("\\S").length;
            int lengthSurnameSecondPerson = o2.getSurname().split("\\S").length;
            if (lengthSurnameFistPerson == lengthSurnameSecondPerson) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return lengthSurnameFistPerson > lengthSurnameSecondPerson ? 1 : -1;
        };
        
        TreeSet<Person> people = new TreeSet<>(comparator);
        people.add(new Person("Игорь", "Корсаков", 28));
        people.add(new Person("Олег", "Корсаков", 48));
        people.add(new Person("Ольга", "Иванова", 15));
        people.add(new Person("Махмуд", "Тургун Шарифзаде", 18));
        people.add(new Person("Махмуд", "Тургун Шариф", 10));
        people.add(new Person("Мах", "Тур Шаиф", 10));
        people.add(new Person("Маха", "Тур Шаиф Али", 19));
        //   Collections.sort(people, (comparator));
        for (Person o : people) {
            System.out.printf("Фамилия: %s. Имя: %s. Возраст: %d\n", o.getSurname(), o.getName(), o.getAge());
        }

    }

//    private static int compare(Person o1, Person o2) {
//
//        int lengthSurnameFistPerson = o1.getSurname().split("\\S").length;
//        int lengthSurnameSecondPerson = o2.getSurname().split("\\S").length;
//        if (lengthSurnameFistPerson == lengthSurnameSecondPerson) {
//            return Integer.compare(o1.getAge(), o2.getAge());
//        }
//
//        return lengthSurnameFistPerson > lengthSurnameSecondPerson ? 1 : -1;
//    }
}