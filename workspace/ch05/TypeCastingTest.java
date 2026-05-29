package ch05;

import java.util.Scanner;

public class TypeCastingTest {
    static void main() {
        String name;
        String nameAnswer;
        String sex;
        String phonNumber;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        name = sc.next();
        nameAnswer = (name.length()==3)?"이름이 세글자" : "이름이 세글자가 아님";
        System.out.println(nameAnswer);
//        if(name.length()==3){
//            System.out.println("이름이 세글자입니다.");
//        }else{
//            System.out.println("이름이 세글자가아닙니다.");
//        }


    }


}
