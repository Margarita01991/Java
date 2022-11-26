// Вывести все простые числа от 1 до 1000

public class Task02 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n ; i++){
            boolean test = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    test = false;
                    break;
                }                
            }
            if(test){
                System.out.print(i + " ");
            }
        }
    }
}
