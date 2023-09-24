package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Вася",23));
        personList.add(new Person("Петя",3));
        personList.add(new Person("Коля",56));
        personList.add(new Person("Ваня",2));
        personList.add(new Person("Денис",27));
        personList.add(new Person("Валя",89));
        personList.add(new Person("Галя",4));

        personList.stream().
                filter(p ->p.getAge()>18 ).
                sorted(Comparator.comparing(Person::getAge)).
                map(Person::getName).
                forEach(System.out::println);

//        for(Person person: personList){
//            System.out.println(person);;
//        }
    }
}
