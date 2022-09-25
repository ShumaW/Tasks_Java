public class Main {
    public static void main(String[] args) {
        int [] arroy = {3,6,-1,4,-5,9,-21,20};

        System.out.println("First level");
        System.out.println(findMax(arroy));
        System.out.println("---------------------------------------------------");
        System.out.println("Second level");
        System.out.println(difference(arroy));
    }
    // Дан массив целых чисел ( не пустой) . Написать метод, возвращающий наибольший элемент  этого массива .
    public static int findMax (int [] arroy){
        int max = 0;
        for (int i = 0; i < arroy.length; i++) {

            if (max < arroy[i]) {
                max = arroy[i];
            }

        }
        return max;
    }

    // Дан массив целых чисел ( не пустой) . Написать метод, возвращающий разницу между наибольшим и наименьшим  элементами  этого массива .
    public static int difference (int [] arroy){
        int min =0;
        int max = 0;
        int dif = 0;

        for (int i = 0; i < arroy.length; i++) {
            if (min> arroy[i]) {
                min = arroy [i];
            }
        }
        for (int j = 0; j <arroy.length ; j++) {
            if (max < arroy[j]) {
                max = arroy[j];
            }
        }
        dif=max-min;
        return dif;
    }
}