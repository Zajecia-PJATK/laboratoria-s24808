enum rodzaj{
    BENZYNA, DIESEL, ELEKTRYK
}
abstract class Maszyna{
    protected String marka, nazwa, pojemnoscSilnika;
    protected rodzaj rodzajSilnika;
}

class Kosiarka extends Maszyna{
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, String pojemnoscSilnika, rodzaj rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public String wyswietl() {
        System.out.println("marka: " + marka + " " +
                ", nazwa: " + nazwa + " " +
                ", pojemnoscSilnika: " + pojemnoscSilnika + " " +
                ", rodzajSilnika: " + rodzajSilnika == rodzaj.BENZYNA + " " +
                ", czyMelekser: " + czyMelekser  + " " +
                ", czyNaped: " + czyNaped  + " " +
                ", liczbaOstrzy: " + liczbaOstrzy);
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}
