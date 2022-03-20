package tugas3;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class PersegiPanjang {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double Luas(){
        return panjang*lebar;
    }
    
    public double Keliling(){
        return 2*(panjang+lebar);
    }
}
