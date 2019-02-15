package start;

public class Cw23a {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 5, 2, 3, 6, 7, 9, 3};

        int max_value = numbers[0];
        int max_value2= numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value) {
                max_value = numbers[i];
                index = i;
            }
        }

        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] > max_value2 && index != i){
                max_value2 = numbers[i];
            }
        }
        System.out.println(max_value);
        System.out.println(max_value2);
        System.out.println(max_value*max_value2);
    }
}
