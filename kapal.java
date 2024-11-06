class Kapal extends Kendaraan {
    private final double konsumsiPerKm = 7;

    public Kapal(int tahunProduksi) {
        super("Kapal", tahunProduksi, 70);
    }

    @Override
    public void bergerak(double jarak) {
        double bensinDibutuhkan = jarak * konsumsiPerKm;
        if (bensinSekarang >= bensinDibutuhkan) {
            bensinSekarang -= bensinDibutuhkan;
            System.out.println("Kapal bergerak sejauh " + jarak + " km.");
        } else {
            System.out.println("Bensin tidak cukup untuk menggerakkan kapal sejauh " + jarak + " km.");
        }
    }
}
