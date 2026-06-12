package ch12.animal;

public class HotDog extends Dog {

    public HotDog(String name) {
//        Dog클래스에서의 생성자 호출
        super(name, 56);

    }

    public HotDog(int age) {
        super("콘도그", 50, 23, 60);

    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void bark() {
        super.bark();
    }

    @Override
    void move() {
        super.move();
    }

    @Override
    void howling() {
        super.howling();
    }
}
