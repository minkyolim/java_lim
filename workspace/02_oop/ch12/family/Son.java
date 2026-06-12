package ch12.family;

public class Son extends Parent {

    public Son(String name, int age) {
//    부모생성자 3개중 2개만 초기화, 부모변수에 직접접근, 부모와 자식간 결속력이강해짐
//     캡슐화가 어려워짐 즉 별로 안좋음
        super(name, age);
//        super.sex = "남";
    }
}
