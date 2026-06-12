package ch13.family.ex03;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 200, 5, 10);
    }

    @Override
    public void attack() {
        System.out.println("마법을 사용해 공격!");
    }

    @Override
    public void defence() {
        System.out.println("실드마법으로 가드!");
    }

    @Override
    public void avoid() {
        super.avoid();
        setMp(getMp()+30);
        System.out.println("마법사특전 마나회복 30!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
