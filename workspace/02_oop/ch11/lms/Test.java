package ch11.lms;

public class Test {
    public static void main(String[] args) {
        강의실 room1 = new 강의실();
        room1.위치 = "인문동";
        room1.호수 = 102;
        room1.수용인원 = 30;

        강의실 room2 = new 강의실();
        room2.위치 = "공대";
        room2.호수 = 304;
        room1.수용인원 = 20;

        과목 sub1 = new 과목();
        sub1.과목번호 = 1;
        sub1.과목명 = "인문학 개론";
        sub1.강의시간 = "월요일 3~4교시";
        sub1.수용인원 = 25;
        sub1.담당교수 = "강교수";
        sub1.진행강의실 = room1;

        과목 sub2 = new 과목();
        sub2.과목번호 = 2;
        sub2.과목명 = "자바 기초";
        sub2.강의시간 = "수요일 1~2교시";
        sub2.수용인원 = 20;
        sub2.담당교수 = "박교수";
        sub2.진행강의실 = room2;

        학생 s1 = new 학생();
        s1.생년월일 = 20004987;
        s1.학번 = "202613378";

        학생 s2 = new 학생();
        s2.생년월일 = 20004987;
        s2.학번 = "202512368";

        교수 l1 = new 교수();
        l1.이름 = "강교수";

        교수 l2 = new 교수();
        l2.이름 = "박교수";



    }
}
