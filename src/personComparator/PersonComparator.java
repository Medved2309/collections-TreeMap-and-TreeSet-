//package personComparator;
//
//import person.Person;
//
//import java.util.Comparator;
//
//public class PersonComparator implements Comparator<Person> {
//
//    private int wordNumb;
//
//
//    public PersonComparator(int wordNumb) {
//        this.wordNumb = wordNumb;
//    }
//
////        @Override
////    public int compare(Person o1, Person o2) {
////        int lengthSurnameFistPerson;
////        lengthSurnameFistPerson = o1.getSurname().split("\\S").length;
////        int lengthSurnameSecondPerson = o2.getSurname().split("\\S").length;
////        if (lengthSurnameFistPerson == lengthSurnameSecondPerson) {
////            return Integer.compare(o1.getAge(), o2.getAge());
////        }
////
////        return lengthSurnameFistPerson > lengthSurnameSecondPerson ? 1 : -1;
////    }
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        int lengthSurnameFistPerson = o1.getSurname().split("\\S").length;
//        int lengthSurnameSecondPerson = o2.getSurname().split("\\S").length;
//        if (lengthSurnameFistPerson > wordNumb && lengthSurnameSecondPerson > wordNumb) {
//            return Integer.compare(o1.getAge(), o2.getAge());
//        }
//        if (lengthSurnameFistPerson == lengthSurnameSecondPerson) {
//            return Integer.compare(o1.getAge(), o2.getAge());
//        }
//        return lengthSurnameFistPerson > lengthSurnameSecondPerson ? 1 : -1;
//    }
//
//
//}