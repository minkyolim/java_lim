package ch12.animal;

public class Test {
    public static void main(String[] args) {
//        부모타입으로 자식객체생성/업캐스팅
//        부모메서드 호출가능/오버라이딩
//        두개합쳐 다형성
        Animal dog = new Dog("멍멍이", 40);
        dog.eat();
        dog.bark();
        dog.move();
        System.out.println(dog.name + "나이: " + dog.age);
        System.out.println();
//        다운캐스팅
        ((Dog) dog).howling();
        System.out.println();
//        자기자신타입으로 객체생성시 자체메서드 사용가능 /howling() <-- class Dog
        Dog dog2 = new Dog("월월이", 20);
        dog2.howling();
        System.out.println(dog2.name + "나이: " + dog2.age);
        System.out.println();
        Dog hot = new HotDog("핫도그");
        Dog con = new HotDog(12);
        hot.eat();
        System.out.println(hot.age);
    }


}
