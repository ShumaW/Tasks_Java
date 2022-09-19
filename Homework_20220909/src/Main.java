public class Main {
    public static void main(String[] args) {

        System.out.println("First level");
        printNumber(1,12);
        System.out.println("-------------------------------------");
        System.out.println("Second level");
        summaryNumber(1,6);
    }
<<<<<<< HEAD
    // C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
=======
    // C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n.
>>>>>>> 35ade43f9b47884315a4d2c07824652f3eecad13
    public static int printNumber (int num1, int num2) {

        for ( ; num1 <= num2; num1++) {
            System.out.println(num1);
        }

        return num1;
    }

<<<<<<< HEAD
    // C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
=======
    // C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n.
>>>>>>> 35ade43f9b47884315a4d2c07824652f3eecad13

    public static int summaryNumber(int num1, int num2){
        int sum = 0;
        for (; num1<=num2; num1++) {
            sum+=num1;
            System.out.println(sum);
        }
        return num1;
    }
}
