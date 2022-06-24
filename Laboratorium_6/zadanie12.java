class TestScores {

    static double Srednia(double[] tab) {
        double suma = 0;
        int ilosc = tab.length;

        for (int i =0; i < tab.length; i++) {
            suma += tab[i];
        }
        return (suma/ilosc);
    }
    public static void main(String[] args) {

        double[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sqrt = Srednia(tab);

        try {
            for (int i =0; i< tab.length; i++) {
                if (tab[i] < 0 || tab[i] > 100) {
                    throw new IllegalArgumentException();
                }
            }
            System.out.println(sqrt);
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawne liczby");
        }
    }
}
