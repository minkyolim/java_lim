package ch07;

public class Gugudan {
    public static void main(String[] args) {
        Gugudan gugu = new Gugudan();
        gugu.gugudan();
    }

    void gugudan() {
        for (int i=1;i<=9;i++){
            System.out.println(i+"단");
            for (int j=1; j<=9; j++){
                int result =0;
                result = i*j;
                String isSamYukGu = Integer.toString(result);
                System.out.println(i+"X"+j+"="+result);
                if (isSamYukGu.contains("3")||isSamYukGu.contains("6")||isSamYukGu.contains("9")){
                    System.out.println("짝!");
                }
                if (j==9){
                    System.out.println();
                }
            }
            if (i == 9){
                System.out.println("구구단이 끝났습니다");
            }
        }
    }


}
