import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        GamePlay gamePlay=new GamePlay();
        gamePlay.play();
    }
    public void play(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the target:");
        int target=scanner.nextInt();
        System.out.println("Enter the number:");
        int no1=scanner.nextInt();
        int no2=scanner.nextInt();
        int no3=scanner.nextInt();
        int no4=scanner.nextInt();
        int[] number={no1,no2,no3,no4};
        s:
        for (int i=0;i<number.length;i++){
            int num=0;
            if (i==0) {
                num = number[0] + number[1];
            }else if (i==1){
                num = number[0] - number[1];
            }
            else if (i==2){
                num = number[0] * number[1];
            }
            for (int j=0;j<number.length;j++){
                int num1=0;
                if (i==0) {
                    num1 = num + number[2];
                }else if (i==1){
                    num1 = num - number[2];
                }
                else if (i==2){
                    num1 = num * number[2];
                }
                for (int k=0;k<number.length;k++){
                    int num2=0;
                    if (i==0) {
                        num2 = num1 + number[3];
                        if (target==num2) {
                            System.out.println(no1+"+"+no2+"+"+no3+"+"+no4+"="+target);
                            break s;
                        }
                    }else if (i==1){
                        num2 = num1 - number[3];
                        if (target==num2){
                            System.out.println(no1+"-"+no2+"-"+no3+"-"+no4+"="+target);
                            break s;
                        }
                    }
                    else if (i==2){
                        num2 = num1 * number[3];
                        if (target==num2){
                            System.out.println(no1+"*"+no2+"*"+no3+"*"+no4+"="+target);
                            break s;
                        }
                    }

                }
            }
        }

    }
}
