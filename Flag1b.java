public class Flag1b {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.print("====");
                } else {
                    System.out.print("****");
                }
            }
            System.out.println();
        }
    }

}
