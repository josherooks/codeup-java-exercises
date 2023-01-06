import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person peeps1 = new Person("Charlie");
        Person peeps2 = new Person("Mac");
        Person peeps3 = new Person("Dennis");
        String[] people = new String[3];
        people = new String[]{String.valueOf(peeps1), String.valueOf(peeps2), String.valueOf(peeps3)};
        System.out.println(Arrays.toString(people));
    }
}
