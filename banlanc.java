import java.util.Arrays;
public class banlanc {
    public static void main(String[] arge){
        int[] numbers = {1,1,2,3,4,1,2,3,4,5,5};
        int coutn = numbers.length;
        int[] clearss = new int[coutn];
        int x;
        x = 0;

        Arrays.sort(numbers);
        for (int i = 0; i < coutn-1; i++) {
            if(numbers[i] != numbers[i+1]){
                clearss[x] = numbers[i];
                x++;
            }
        }
        clearss[x++] = numbers[coutn-1];
        for (int i = 0; i < x; i++) {
            System.out.print(clearss[i]+" ");
        }
    }
}
