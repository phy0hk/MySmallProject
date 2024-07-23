import java.util.Scanner;

public class NumGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HideArr[] = new int[4];
        boolean win = false;
        for(int i=0;i<4;i++){
            HideArr[i] = (int)(Math.random());
        }
        for(int i=0;i<8;i++){
            System.out.println("\nEnter four digit :");
            int temp = scanner.nextInt();
            String output[] = {"x","x","x","x"};
            int Answer[] = {temp/1000,(temp%1000)/100,(temp%100)/10,temp%10};
            if (HideArr[0]==Answer[0]&&HideArr[1]==Answer[1]&&HideArr[2]==Answer[2]&&HideArr[3]==Answer[3]) {
                win = true;
                break;
            }
            for(int j=0;j<4;j++){
                // System.out.println(HideArr[j]);
                if (HideArr[j]==Answer[j]) {
                    output[j] = "*"; 
                }
                for(int k=j+1;k<4;k++){
                    if (HideArr[k]==Answer[j]) {
                        output[j] = "!";
                    }
                }
                System.out.print(output[j]);
            }    
            if (win) {
                break;
            }    
        }
        if (win) {
            System.out.println("You win!!");
        }
        else{
            System.out.println("You lose!!");
        }
}
}