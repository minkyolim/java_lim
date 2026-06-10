package ch13.family.ex03;

public class Test {
    public static void main(String[] args) {
        Worrior wo = new Worrior("강전사");
        Mage ma = new Mage("나법사");

        wo.attack();
        wo.avoid();
        System.out.println(wo);

        ma.attack();
        ma.avoid();
        System.out.println(ma);
    }


}
