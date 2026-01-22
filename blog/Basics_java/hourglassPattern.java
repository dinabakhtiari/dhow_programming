public class hourglassPattern {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = n; i >= 1; i--) {
            printRow(i, n);
        }

        for (int i = 2; i <= n; i++) {
            printRow(i, n);
        }
    }

    // این همان متدی است که برنامه شما نمی‌شناخت:
    public static void printRow(int stars, int total) {
        // ۱. چاپ ستاره‌های سمت چپ
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }

        int spaces = 2 * (total - stars);
        for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }

        // ۳. چاپ ستاره‌های سمت راست
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }

        // رفتن به خط بعد
        System.out.println();
    }
}
