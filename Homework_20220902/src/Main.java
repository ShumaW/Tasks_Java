public class Main {
    public static void main(String[] args) {

        System.out.println("First level");

        // � �������������� ����� while �������� �����, ���������� ��� ����� �� 0 �� ������� ����� n.
        //������: �� ����� n=3  �� ������ 0,1,8,27

        int num = 5;
        int num1 = 0;
        int result = 0;

        while (num1<=num) {
            result = num1*num1*num1;  // M� ��� �� ����� ������ Math.pow(value, powValue) !!!!!
            System.out.println(result);
            num1+=1;
        }
        System.out.println("---------------------------------------------");
        System.out.println("Second level");

        // � �������������� ����� while �������� �����, ���������� ���������  ��������� ������� ����� n  �� ��� ����� ����� �� 0 �� n..
        //������: �� ����� n=3  �� ������ 0,3,6,9

        int num2 = 6;
        int num3 = 0;
        int result1 = 0;

        while(num3<=num2) {
            result1 = num3*num2;
            System.out.println(result1);
            num3+=1;
        }


    }
}