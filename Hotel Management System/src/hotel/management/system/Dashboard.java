
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    Dashboard(){    // constructor
        setBounds(0,0,1550,1000); //image frame
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));//image path
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);//image maximum/minimum size
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma",Font.PLAIN,46));//1)font-family ,2)font-typre 3) font-size
        text.setForeground(Color.WHITE);//text color
        image.add(text);
        
        JMenuBar mb = new JMenuBar(); //top manu bar
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");//hotel management menu add
        hotel.setForeground( Color.red);
        mb.add(hotel);
        //hotel management menu
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenu admin = new JMenu("ADMIN");//admin menu add
        admin.setForeground( Color.BLUE);
        mb.add(admin);
        
        //admin three columns
        JMenuItem addemployee = new JMenuItem("Add Employee");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("Add Rooms");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        
//        JMenuItem adddriver = new JMenuItem("Add Driver");
//        adddriver.addActionListener(this);
//        admin.add(adddriver);
        
      
        
         setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Add Employee")){
            new AddEmployee();
        }else if (ae.getActionCommand().equals("Add Rooms")){
   new AddRooms();
            }
//         else if (ae.getActionCommand().equals("Add Driver")){
//   new AddDriver();
//            }
         else if (ae.getActionCommand().equals("RECEPTION")){
   new Reception();
            }
    }

    public static void main(String[]args){
        new Dashboard();
    }
}
