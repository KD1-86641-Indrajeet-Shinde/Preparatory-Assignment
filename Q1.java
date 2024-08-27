public class Q1 {
    public static void main(String[] args) {
        int n = args.length;
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}