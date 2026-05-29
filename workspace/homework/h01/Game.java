package homework.h01;

import java.util.Scanner;

public class Game {
    //    유저 스테이터스
    static String name;
    static int hp = 100;
    static int mp = 100;
    static int power = 10;
    static int defense = 10;

    public static void main(String[] args) {
        System.out.println("===== 멋쟁이 전사 키우기 =====");
        Scanner sc = new Scanner(System.in);
        Game gm = new Game();

        System.out.print("캐릭명을 지어주세요 : ");
        name = sc.next();

        System.out.println("=======캐릭터=======");
        System.out.println("닉네임 : " + name);
        System.out.println("체력 : " + hp);
        System.out.println("마나 : " + mp);
        System.out.println("공격력 : " + power);
        System.out.println("방어력 : " + defense);
        System.out.println("===================");

        while (true) {
            System.out.println("=======마을=======");
            System.out.println("1.모험을떠난다 2.쉰다 3.스테이터스");
            int num = sc.nextInt();
            if (num == 1) {
//                1.모험을떠난다
                gm.adventure();
            } else if (num == 2) {
//                2.쉰다
                System.out.println("====================");
                System.out.println("휴식을 취합니다. 체력과 마나가 전부 회복되었습니다.");
                System.out.println("====================");
                hp = 100;
                mp = 100;
            } else if (num == 3) {
//                스테이터스
                System.out.println("=======스테이터스=======");
                System.out.println("닉네임 : " + name);
                System.out.println("체력 : " + hp);
                System.out.println("마나 : " + mp);
                System.out.println("공격력 : " + power);
                System.out.println("방어력 : " + defense);
                System.out.println("====================");
            }
        }

    }

    //    1.모험을떠난다
    void adventure() {
//        적 스테이터스
        int enemyHp = 50;
        int enemyPower = 15;
        int enemyDefense = 0;
//        수비했을때 방어력증가치
        int userActDefense = defense * 2;
//        적 필사기데미지
        int enemySpecialMove = enemyPower * 2;

        System.out.println("=======마을외곽=======");
        System.out.println("적을 만났습니다");

        outer:
        while (true) {
            System.out.println("적의 체력 : " + enemyHp);
            System.out.println(name + "의 체력 : " + hp);
            System.out.println("1.공격한다 2.수비한다 3.도망친다");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num == 1) {
//                1.공격한다
//                유저공격턴
                System.out.println("====================");
                if (power > enemyDefense) {
                    enemyHp = enemyHp - (power - enemyDefense);
                    System.out.println(name + " 이/가 공격하였습니다.");
                    System.out.println((power - enemyDefense) + "의 데미지를 입혔습니다.");
                } else {
                    System.out.println(name + " 이/가 공격하였습니다.");
                    System.out.println("0의 데미지를 입혔습니다.");
                }
//                적 공격턴
                if ((int) (Math.random() * 6) < 4) {
//                    적 일반공격
                    if (enemyPower > defense) {
                        hp = hp - (enemyPower - defense);
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 " + (enemyPower - defense) + "의 데미지를 입었습니다.");
                    } else {
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                    }
                } else {
//                    적 필사기공격
                    if (enemySpecialMove > defense) {
                        hp = hp - (enemySpecialMove - defense);
                        System.out.println("적이 필사기를 사용했습니다!");
                        System.out.println(name + " 이/가 " + (enemySpecialMove - defense) + "의 데미지를 입었습니다.");
                    } else {
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                    }
                }
                System.out.println("====================");
            } else if (num == 2) {
//                2.수비한다
                System.out.println("====================");
                System.out.println(name + " 이/가 방어태세를 취합니다");

//                적 공격턴
                if ((int) (Math.random() * 6) < 4) {
//                   적 일반공격
                    if (enemyPower > userActDefense) {
                        hp = hp - (enemyPower - userActDefense);
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 " + (enemyPower - userActDefense) + "의 데미지를 입었습니다.");
                    } else {
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                    }
                } else {
//                    적 필사기공격
                    if (enemySpecialMove > userActDefense) {
                        hp = hp - (enemySpecialMove - userActDefense);
                        System.out.println("적이 필사기를 사용했습니다!");
                        System.out.println(name + " 이/가 " + (enemySpecialMove - userActDefense) + "의 데미지를 입었습니다.");
                    } else {
                        System.out.println("적이 공격하였습니다.");
                        System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                    }
                }
                System.out.println("====================");
            } else if (num == 3) {
//                3.도망친다
                int randomNumber = (int) (Math.random() * 6) + 1;
                System.out.println(randomNumber);
                switch (randomNumber) {
                    case 2, 4, 5:
                        System.out.println("====================");
                        System.out.println("도망에 성공했습니다.");
                        System.out.println("====================");
                        break outer;
                    case 1, 3, 6:
                        System.out.println("====================");
                        System.out.println("도망에 실패했습니다.");
                        //                적 공격턴
                        if (randomNumber < 4) {
//                   적 일반공격
                            if (enemyPower > defense) {
                                hp = hp - (enemyPower - defense);
                                System.out.println("적이 공격하였습니다.");
                                System.out.println(name + " 이/가 " + (enemyPower - defense) + "의 데미지를 입었습니다.");
                            } else {
                                System.out.println("적이 공격하였습니다.");
                                System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                            }
                        } else {
//                    적 필사기공격
                            if (enemySpecialMove > defense) {
                                hp = hp - (enemySpecialMove - defense);
                                System.out.println("적이 필사기를 사용했습니다!");
                                System.out.println(name + " 이/가 " + (enemySpecialMove - defense) + "의 데미지를 입었습니다.");
                            } else {
                                System.out.println("적이 공격하였습니다.");
                                System.out.println(name + " 이/가 0의 데미지를 입었습니다.");
                            }
                        }
                        System.out.println("====================");
                        break;
                }

            }
//            유저사망/적사망
            if (hp <= 0) {
                System.out.println("====================");
                System.out.println(name + "의 눈앞이 깜깜해졌다!");
                System.out.println("====================");
                break;
            } else if (enemyHp <= 0) {
                System.out.println("====================");
                System.out.println(name + " 이/가 적을 쓰러트렸습니다.\n모험을 마치고 마을로 돌아갑니다.");
                System.out.println("====================");
                break;
            }
        }

    }

}
