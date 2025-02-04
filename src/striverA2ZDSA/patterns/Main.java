package striverA2ZDSA.patterns;

public class Main {
    public static void main(String[] args) {
//        pattern1(6);
//        pattern2(6);
//        pattern3(6);
//        pattern4(6);
    }

    public static void pattern1(int n){
        for( int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
