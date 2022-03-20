package tugas3;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Balok {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double LuasPermukaan(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    } 
    
    public double Volume(){
        return panjang*lebar*tinggi;
    }
    
    
}
