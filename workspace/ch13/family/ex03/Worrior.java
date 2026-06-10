package ch13.family.ex03;

public class Worrior extends Character {
    public Worrior(String name) {
        super(name, 200, 100, 10, 5);
    }

    @Override
    public void attack() {
        System.out.println("검을 휘둘러 공격!");
    }

    @Override
    public void defence() {
        System.out.println("방패를 들어 가드!");
    }

    @Override
    public void avoid() {
        super.avoid();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
