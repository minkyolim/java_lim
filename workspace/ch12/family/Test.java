package ch12.family;

public class Test {
    public static void main(String[] args) {
        Parent son = new Son("이태백", 12);
        son.status();
        Parent daughter = new Daughter("홍혜지", 31);
        daughter.status();
    }
}
