package ds.array;

public class ArrayDemo {
    public static void main(String[] args) {
         int[] prices  = new int[5];
//         initializationType1(prices);
//        initializationType2(prices);

    }

    public static void initializationType1(int[] prices) {
        prices[0] = 100;
        prices[1] = 200;
        prices[2] = 300;
        prices[3] = 400;
        prices[4] = 500;
        iteration(prices);
    }

    public static void initializationType2(int[] prices){
        for (int i = 0; i < prices.length; i++) {
            prices[i] = (i+1) *100;
        }
        iteration(prices);
    }







    public static void iteration(int[] prices) {
        for (int price = 0; price < prices.length; price++){
            System.out.println(prices[price]);
        }
    }
}
