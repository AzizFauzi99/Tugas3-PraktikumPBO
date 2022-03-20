package tugas3;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Interface extends JFrame {
    
    JLabel lJudul = new JLabel("Cuboid Calculator");
    JLabel lLength = new JLabel("Length");
    JLabel lWidth = new JLabel("Width");
    JLabel lHeight = new JLabel("Height");
    JLabel lResult = new JLabel("Result");
    JLabel lLuas = new JLabel("");
    JLabel lKeliling = new JLabel("");
    JLabel lVolume = new JLabel("");
    JLabel lLuasPermukaan = new JLabel("");
    
    JTextField tfLength = new JTextField();
    JTextField tfWidth = new JTextField();
    JTextField tfHeight = new JTextField();
    
    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");
    
    public Interface(){
        setTitle("Cuboid Calculator");
        setSize(400, 440);
        setLayout(null);
        
        add(lJudul);
        add(lLength);
        add(lWidth);
        add(lHeight);
        add(lResult);
        add(lKeliling);
        add(lLuas);
        add(lVolume);
        add(lLuasPermukaan);
        
        add(tfLength);
        add(tfWidth);
        add(tfHeight);
        
        add(btnCount);
        add(btnReset);
        
        lJudul.setBounds(130,10,200,20);
        
        lLength.setBounds(40, 60, 100, 20);
        tfLength.setBounds(130, 60, 180, 20);
        
        lWidth.setBounds(40,100,100,20);
        tfWidth.setBounds(130,100,180,20);
        
        lHeight.setBounds(40, 140,100,20);
        tfHeight.setBounds(130,140,180,20);
        
        lResult.setBounds(130, 160, 100, 20);
        lKeliling.setBounds(40, 200, 300, 20);
        lLuas.setBounds(40, 240, 300, 20);
        lVolume.setBounds(40, 280, 300, 20);
        lLuasPermukaan.setBounds(40, 320, 300, 20);
        
        btnCount.setBounds(90,360,80,20);
        btnReset.setBounds(200,360,80,20);
        
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String length = tfLength.getText().toString();           
                String width = tfWidth.getText().toString();               
                String height = tfHeight.getText().toString();
                
                if (length.equals("") || width.equals("") || height.equals("")){
                    JOptionPane.showMessageDialog(null, "Ada data yang masih kosong");
                }else{
                    try{
                    double panjang = Double.parseDouble(length); 
                    double lebar = Double.parseDouble(width); 
                    double tinggi = Double.parseDouble(height);
                    
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    double luas = pp.Luas();
                    double keliling = pp.Keliling();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    double lp = balok.LuasPermukaan();
                    double volume = balok.Volume();
                    
                    lKeliling.setText("Square Area                      : " + luas);
                    lLuas.setText("Square Circumference  : " + keliling);
                    lVolume.setText("Cuboid Volume                 : " + volume);
                    lLuasPermukaan.setText("Cuboid Surface Area      : " + lp);
                    
                    }catch(NumberFormatException exception){
                        JOptionPane.showMessageDialog(null, exception);
                    }
                    
                    
                }
                
                
                
            }
            
        });
        
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfLength.setText("");
                tfWidth.setText("");
                tfHeight.setText("");
                lLuas.setText("");
                lKeliling.setText("");
                lLuasPermukaan.setText("");
                lVolume.setText("");               
            }
                       
        });
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
