public class main {  
    public static void main(String[] args) {  
        Pesawat pesawat = new Pesawat(2022);  
        Mobil mobil = new Mobil(2021);  
        Kapal kapal = new Kapal(2020);  

        double jarak = 3;  

        System.out.println("Sebelum bergerak:");  
        pesawat.info();  
        mobil.info();  
        kapal.info();  

        System.out.println("\nBergerak sejauh " + jarak + " km:");  
        pesawat.bergerak(jarak);  
        mobil.bergerak(jarak);  
        kapal.bergerak(jarak);  

        System.out.println("\nSetelah bergerak:");  
        pesawat.info();  
        mobil.info();  
        kapal.info();  
    }  
}