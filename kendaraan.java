abstract class Kendaraan {  
    protected String jenis;  
    protected int tahunProduksi;  
    protected double kapasitasBensin;  
    protected double bensinSekarang;  

    public Kendaraan(String jenis, int tahunProduksi, double kapasitasBensin) {  
        this.jenis = jenis;  
        this.tahunProduksi = tahunProduksi;  
        this.kapasitasBensin = kapasitasBensin;  
        this.bensinSekarang = kapasitasBensin; 
    }  

    public abstract void bergerak(double jarak);  

    public void info() {  
        System.out.println("Jenis Kendaraan: " + jenis);  
        System.out.println("Tahun Produksi: " + tahunProduksi);  
        System.out.println("Kapasitas Bensin: " + kapasitasBensin + " L");  
        System.out.println("Sisa Bensin: " + bensinSekarang + " L");  
    }  
}