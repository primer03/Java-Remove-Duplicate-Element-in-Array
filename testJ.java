import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
class testJ{
    public static  boolean check = false;
    public static void main(String[] args){
        Scanner myinput = new Scanner(System.in);
        int max = 0,min = 0,inttemp,n; 
        // System.out.println(b);
        String Testtext;
        Integer[] Nus = new Integer[10];
        // System.out.println(Nus[i]);
        String maxs = JOptionPane.showInputDialog("Enter Max Number :");
        String mins = JOptionPane.showInputDialog("Enter Min Number :");
        Testtext = JOptionPane.showInputDialog("Enter Min Text :");
        // System.out.print("Enter Max Number : ");
        // max = myinput.nextInt();
        // System.out.print("Enter Min Number : ");
        // min = myinput.nextInt();
        max = Integer.parseInt(maxs);
        min = Integer.parseInt(mins);
        // int b = (int)(Math.random()*(max-min+1)+min);  
        if(max < min){
            inttemp = min;
            min = max;
            max = inttemp;
        }
        for(int i = 0; i < 10; i++){
            int b = (int)(Math.random()*(max-min+1)+min); 
            Nus[i] = b;
            System.out.println(Nus[i]);
        }
        for (int i = 0; i < 10; i++) {
            n=i;
            for(int j = i; j < 10; j++){
                if(Nus[n] > Nus[j]){
                    n = j;
                }
            }
            if(n != i){
                int temp = Nus[i];
                Nus[i] = Nus[n];
                Nus[n] = temp;
            }
        }
        System.out.println("---------------------");
        Arrays.sort(Nus);
        for (int i = 0; i < 10; i++) {
            System.out.print(Nus[i]+" ");
        }
        System.out.print("\n");
        String strtxt;
        char str;
        strtxt = Testtext.toUpperCase();
        for (int i = 0; i < Testtext.length(); i++) {
            str = strtxt.charAt(i);
            System.out.print(str+" ");
        }
        String message = "HEEEEEEEEEEEEEEE";
        JOptionPane.showMessageDialog(null, message+'J');
    }
}