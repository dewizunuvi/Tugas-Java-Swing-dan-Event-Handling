//Nama : Dewi Zunuvi Setiawati
//NIM : 123190117

package javaswing;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GUI extends JFrame implements ActionListener {
    double panjang, lebar, tinggi;
    
        JLabel lpanjang = new JLabel("Panjang");
        final JTextField fpanjang = new JTextField(5);
        JLabel llebar = new JLabel("Lebar");
        final JTextField flebar = new JTextField(5);
        JLabel ltinggi = new JLabel("Tinggi");
        final JTextField ftinggi = new JTextField(5);
        
        JButton benter = new JButton("Enter");
        
        JLabel lluas = new JLabel("");
        JLabel lkeliling = new JLabel("");
        JLabel lvolume = new JLabel("");
        JLabel lpermukaan = new JLabel("");
        
        JButton breset = new JButton("");
        
    private Object input;
        public GUI() {
            setSize(400,500);
            
            setLayout(null);
            add(lpanjang);
            add(fpanjang);
            add(llebar);
            add(flebar);
            add(ltinggi);
            add(ftinggi);
            add(benter);
            add(breset);
            
            lpanjang.setBounds(10,10,120,20);
            fpanjang.setBounds(130,10,150,20);
            llebar.setBounds(10,35,120,20);
            flebar.setBounds(130,35,150,20);
            ltinggi.setBounds(10,60,120,20);
            ftinggi.setBounds(130,60,150,20);
            benter.setBounds(130,90,70,20);
            breset.setBounds(130,215,70,20);
            setVisible(true);
            
            benter.addActionListener(this);
            breset.addActionListener(this);
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == benter)
        {
            
            
            try{
             panjang = Double.valueOf(fpanjang.getText());
             lebar = Double.valueOf(flebar.getText());
             tinggi = Double.valueOf(ftinggi.getText());
             
             PersegiPanjangBalok b = new PersegiPanjangBalok(panjang, lebar, tinggi);
            
             lluas = new JLabel("Luas " + b.luas());
             lkeliling = new JLabel("Keliling " + b.keliling());
             lvolume = new JLabel("Volume " + b.volume());
             lpermukaan = new JLabel("L. Permukaan " + b.luasPermukaan());
            
             add(lluas);
             add(lkeliling);
             add(lvolume);
             add(lpermukaan);
            
             lluas.setBounds(120,120,90,20);
             lkeliling.setBounds(120,140,90,20);
             lvolume.setBounds(120,165,90,20);
             lpermukaan.setBounds(120,185,120,20);
             setVisible(true);
             
            }catch(Exception error){
                 String message = "Error";
                JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        if(e.getSource() == breset)
        {
        fpanjang.setText(""); //delete panjang
        flebar.setText("");
        ftinggi.setText("");
        lluas.setText("");
        lkeliling.setText("");
        lvolume.setText("");
        lpermukaan.setText("");
        fpanjang.requestFocus();//pointer kembali ke input panjang
        }
        
    }
    }
       
public class Javaswing {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

