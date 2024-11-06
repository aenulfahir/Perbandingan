class Pesawat extends Kendaraan {
    private final double konsumsiPerKm = 10;

    public Pesawat(int tahunProduksi) {
        super("Pesawat", tahunProduksi, 100);
    }

    @Override
    public void bergerak(double jarak) {
        double bensinDibutuhkan = jarak * konsumsiPerKm;
        if (bensinSekarang >= bensinDibutuhkan) {
            bensinSekarang -= bensinDibutuhkan;
            System.out.println("Pesawat bergerak sejauh " + jarak + " km.");
        } else {
            System.out.println("Bensin tidak cukup untuk menggerakkan pesawat sejauh " + jarak + " km.");
        }
    }
}
