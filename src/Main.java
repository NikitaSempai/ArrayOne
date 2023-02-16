import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask();
    }

    public static void firstTask(){
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        String[] str = {"First value", "Second value", "Third value"};
        secondTask(numbers, doubleNumbers, str);
        thirdTask(numbers, doubleNumbers, str);
        fourthTask(numbers);
    }
    public static void secondTask(int[] numbers, double[] doubleNumbers, String[] str){
        System.out.println("Second Task");
        for(int i = 0; i < numbers.length; i++){
                if (i != numbers.length - 1){
                    System.out.print(numbers[i] + ", ");
                }
                else{
                    System.out.print(numbers[i] + "\n");
                }
        }
        for(int i = 0; i < doubleNumbers.length; i++){
            if (i != doubleNumbers.length - 1){
                System.out.print(doubleNumbers[i] + ", ");
            }
            else{
                System.out.print(doubleNumbers[i] + "\n");
            }
        }
        for(int i = 0; i < str.length; i++){
            if (i != str.length - 1){
                System.out.print(str[i] + ", ");
            }
            else{
                System.out.print(str[i] + "\n");
            }
        }
    }
    public static void thirdTask(int[] numbers, double[] doubleNumbers, String[] str){
        System.out.println("Third Task");
        for(int i = numbers.length - 1; i >= 0; i--){
            if (i != 0){
                System.out.print(numbers[i] + ", ");
            }
            else{
                System.out.print(numbers[i] + "\n");
            }
        }
        for(int i = doubleNumbers.length - 1; i >= 0; i--){
            if (i != 0){
                System.out.print(doubleNumbers[i] + ", ");
            }
            else{
                System.out.print(doubleNumbers[i] + "\n");
            }
        }
        for(int i = str.length - 1; i >= 0; i--){
            if (i != 0){
                System.out.print(str[i] + ", ");
            }
            else{
                System.out.print(str[i] + "\n");
            }
        }
    }
    public static void fourthTask(int[] numbers){
        System.out.println("Fourth Task");
        for(int i = 0; i < numbers.length; i++){
        if(numbers[i] % 2 != 0) numbers[i]++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}