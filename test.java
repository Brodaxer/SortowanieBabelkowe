public class test {
    public static void main(String[] args) {
        double[] tab = {10, 20, 321, 45, 1, 234, 145, 22, 38};
        Sortable test = new Sortable() {
            @Override
            public double sort(double[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < n-1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            double a =tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = a;
                        }

                    }
                    n = n - 1;
                } while (n > 1);
                return 0;
            }
        };
        test.sort(tab);
        for (double s : tab
        ) {
            System.out.println(s);

        }
    }
}
