package ch08;

public class DoWhileTest {
    public static void main(String[] args) {
        int dice=0;
        int count=0;
        while (dice != 6){
            dice = (int)(Math.random()*6+1);
            System.out.println(dice);
            count++;
        }
        System.out.println(count+"번실행");
    }
}
