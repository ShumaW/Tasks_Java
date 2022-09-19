public class Main {
    public static void main(String[] args) {

        System.out.println("First level");
        dobleLingthStr("Hello world!");
        System.out.println("------------------------------");
        System.out.println("Second level");
        lastChar("abcdefj");
        System.out.println("");
        firstChar("abcdefgh");




    }

    public static void dobleLingthStr (String str) {
        System.out.println(str.length() * 2);
    }

    public static void lastChar (String str) {
        System.out.println(str.substring(1) + str.charAt(0));
    }

    public static void firstChar (String str) {

        System.out.println(str.charAt(str.length()-1) + str.substring(0, str.length()-2));
    }

}