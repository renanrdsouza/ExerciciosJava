public class Tabela {
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("N      10*N      100*N      1000*N");
        System.out.println();

        while (counter <= 5) {
            System.out.println(counter + "      " + counter * 10 + "        "
                    + counter * 100 + "        " + counter * 1000);
            counter++;
        }
    }
}
