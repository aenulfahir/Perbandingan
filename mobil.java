class Mobil extends Kendaraan {
    private final double konsumsiPerKm = 5;

    public Mobil(int tahunProduksi) {
        super("Mobil", tahunProduksi, 50);
    }

    @Override
    public void bergerak(double jarak) {
        double bensinDibutuhkan = jarak * konsumsiPerKm;
        if (bensinSekarang >= bensinDibutuhkan) {
            bensinSekarang -= bensinDibutuhkan;
            System.out.println("Mobil bergerak sejauh " + jarak + " km.");
        } else {
            System.out.println("Bensin tidak cukup untuk menggerakkan mobil sejauh " + jarak + " km.");
        }
    }
}
