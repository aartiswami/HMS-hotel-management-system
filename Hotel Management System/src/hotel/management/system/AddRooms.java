
package hotel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddRooms extends JFrame implements ActionListener{

    JButton add, cancel;
    JTextField tfroom,tfprice;
    JComboBox typecombo,cleancombo,availablecombo;
    public AddRooms() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Rooms");
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
	heading.setBounds(150, 20, 200, 20);
	add(heading);
        
        JLabel lblroomno = new JLabel("Room Number");
	lblroomno.setForeground(new Color(25, 25, 112));
	lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblroomno.setBounds(60, 80, 120, 30);
	add(lblroomno);
        
        tfroom = new JTextField();
	tfroom.setBounds(200, 80, 150, 30);
	add(tfroom);
        
        JLabel lblavailable = new JLabel("Available");
	lblavailable.setForeground(new Color(25, 25, 112));
	lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblavailable.setBounds(60, 130, 120, 30);
	add(lblavailable);

        String availableOptions[] ={ "Available", "Occupied" };
        availablecombo = new JComboBox(availableOptions);
	availablecombo.setBounds(200, 130, 150, 30);
        availablecombo.setBackground(Color.WHITE);
	add(availablecombo);
   
        JLabel lblclean = new JLabel("Cleaning Status");
	lblclean.setForeground(new Color(25, 25, 112));
	lblclean.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblclean.setBounds(60, 180, 120, 30);
	add(lblclean);

        String cleanOptions[] ={ "Cleaned", "Dirty" };
        cleancombo = new JComboBox(cleanOptions);
	cleancombo.setBounds(200, 180, 150, 30);
        cleancombo.setBackground(Color.WHITE);
	add(cleancombo);
        
        JLabel lblprice = new JLabel("Price");
	lblprice.setForeground(new Color(25, 25, 112));
	lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblprice.setBounds(60, 230, 150, 30);
	add(lblprice);
        
        tfprice = new JTextField();
	tfprice.setBounds(200, 230, 150, 30);
	add(tfprice);
        
        JLabel lbltype = new JLabel("Bed Type");
	lbltype.setForeground(new Color(25, 25, 112));
	lbltype.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lbltype.setBounds(60, 280, 120, 30);
	add(lbltype);

        String typeOptions[] ={ "Single Bed", "Double Bed" };
        typecombo = new JComboBox(typeOptions);
	typecombo.setBounds(200, 280, 150, 30);
        typecombo.setBackground(Color.WHITE);
	add(typecombo);

        add = new JButton("Add Room");	
	add.setBounds(60, 350, 130, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
	add(add);

        cancel = new JButton("Cancel");	
	cancel.setBounds(220, 350, 130, 30);	
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
	add(cancel);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(400,30,500,300);
        add(image);

        
        setBounds(330,200,940,470);
        setVisible(true);
        
    }
    
        public void actionPerformed(ActionEvent ae){
       
            
            if(ae.getSource() == add){
               
              
                String roomnumber = tfroom.getText();
                String available = (String)availablecombo.getSelectedItem();
                String status = (String)cleancombo.getSelectedItem();
                String price  = tfprice.getText();
                String type = (String)typecombo.getSelectedItem();         
              
                try{
                Conn conn = new Conn();
                String str = "INSERT INTO room values( '"+roomnumber+"', '"+available+"', '"+status+"','"+price+"', '"+type+"')";

		conn.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, " New Room  Added Successfully");
                setVisible(false);
               
                }catch(Exception e){
                   e.printStackTrace();
                }
            
            }else {
                setVisible(false);
            }
        }
        

    
    public static void main(String[] args){
        new AddRooms();
    }
    
}
