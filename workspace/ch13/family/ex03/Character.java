package ch13.family.ex03;

public abstract class Character {
    private String name;
    private int hp;
    private int mp;
    private int statStr;
    private int statInt;

    public Character(String name, int hp, int mp, int statStr, int statInt) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.statStr = statStr;
        this.statInt = statInt;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public abstract void attack();

    public abstract void defence();

    public void avoid() {
        mp -= 50;
        System.out.println("재빠른 행동으로 회피했다!");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", statStr=" + statStr +
                ", statInt=" + statInt +
                '}';
    }
}
