import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hoang Van C", 10, 4));
        students.add(new Student("Pham Van A", 10, 1));
        students.add(new Student("Hoang Van A", 9, 2));
        students.add(new Student("Nguyen Van B", 5, 3));
        students.add(new Student("Nguyen Van A", 5, 5));
        students.add(new Student("Hoang Van G", 4, 6));
        students.add(new Student("Hoang Van H", 10, 7));
        students.add(new Student("Hoang Van I", 2, 8));
        students.add(new Student("Hoang Van G", 1, 9));
        students.add(new Student("Hoang Van A", 7, 10));

//        students.add(new Student("A", 10, 1));
//        students.add(new Student("A", 9, 2));
//        students.add(new Student("B", 5, 3));
//        students.add(new Student("C", 10, 4));
//        students.add(new Student("A", 5, 5));
//        students.add(new Student("G", 4, 6));
//        students.add(new Student("H", 10, 7));
//        students.add(new Student("I", 2, 8));
//        students.add(new Student("G", 1, 9));
//        students.add(new Student("A", 7, 10));
        students.stream()
                .sorted((o1, o2) -> o1.getFullName().compareTo(o2.getFullName()))
                .forEach(System.out::println);

        System.out.println("------------------------------");
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getFullName().compareTo(o2.getFullName());
                if(result != 0){
                    return result;
                }

                return o2.getAge() - o1.getAge();
            }
        });


        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if(result != 0){
                    return result;
                }

                return o2.getGPA() - o1.getGPA();
            }
        });
        System.out.println("---------------------------");

        //students.forEach(System.out::println);

        students.forEach(System.out::println);

        System.out.println("------------------------------------------");


        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                var lastName1 = o1.getFullName().substring(o1.getFullName().lastIndexOf(" ") + 1);
                var lastName2 = o2.getFullName().substring(o2.getFullName().lastIndexOf(" ") + 1);
                var compare = lastName1.compareTo(lastName2);
                if (compare == 0) {
                    var firstName1 = o1.getFullName().substring(0, o1.getFullName().indexOf(" "));
                    var firstName2 = o2.getFullName().substring(0, o2.getFullName().indexOf(" "));
                    return firstName1.compareTo(firstName2);
                }
                return compare;
            }
        });
        students.forEach(System.out::println);

        


    }
}