import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] scores = new int[3];
        String[] name = new String[5];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        name[0] = "홍길동";
        name[1] = "간달프";
        name[2] = "강호동";
        System.out.println(scores[1]);
        System.out.println(Arrays.toString(name));

        String[] fruit = {"사과", "수박", "멜론"};
        int[] age = {54, 67, 12};
        System.out.println(Arrays.toString(fruit));
        System.out.println(age[0]);
        System.out.println(age.length);

        for (int i = 0; i < fruit.length; i++) {
            System.out.println("과일" + i + " : " + fruit[i]);
        }

    }
}
