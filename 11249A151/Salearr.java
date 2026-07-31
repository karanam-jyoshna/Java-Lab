public class Salearr {
    public static void main(String[] args) {

        int[] sales = {4500, 6700, 3200, 8900, 7600, 5400, 9100, 6200, 4800, 7300, 8100, 6900};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max)
                max = sales[i];

            if (sales[i] < min)
                min = sales[i];
        }

        System.out.println("Highest Sales = " + max);
        System.out.println("Lowest Sales = " + min);
    }
}
