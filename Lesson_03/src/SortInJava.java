import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortInJava {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Person[] list = new Person[4];
        list[0] = new Person("John", 25, "Mỹ");
        list[1] = new Person("Chris", 30, "Mỹ");
        list[2] = new Person("Anna", 18, "Mỹ");
        list[3] = new Person("Joe", 21, "Mỹ");

        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Arrays.sort(list, (o1, o2) -> o1.getAge() - o2.getAge());


        for (Person p: list){
            System.out.println(p.getName() + " - " + p.getAge());
        }

        Arrays.stream(list)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .forEach(i -> System.out.println(i.getName()));
    }
}
