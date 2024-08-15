
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
     JTextField username;
      JPasswordField password;
     JButton login,cancel;
    Login(){// constructor
        setLayout(null);
        
        JLabel user = new JLabel("Username");  //username label
        user.setBounds(230,300,100,30);
        user.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        add(user);
        
        username = new JTextField();//username box
        username.setBounds(450,300,250,40);
        username.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        add(username);
        
        JLabel pass = new JLabel("Password");  //password label
        pass.setBounds(230,450,100,30);
         pass.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        add(pass);
        
         password = new JPasswordField();//password box
        password.setBounds(450,450,250,40);
         password.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        add(password);
        
         login = new JButton("Login"); //login button
        login.setBounds(200,600,250,60);
        login.setBackground(Color.BLACK);//background color
        login.setForeground(Color.white);//text color
        login.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        login.addActionListener(this);
        add(login);
        
         cancel = new JButton("Cancel");//cancel button
        cancel.setBounds(480,600, 220,60);
        cancel.setBackground(Color.BLACK);//background color
        cancel.setForeground(Color.white);//text color
        cancel.setFont(new Font("serif",Font.PLAIN,20));//1)font-family ,2)font-typre 3) font-size
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));//image path
        Image i2 = i1.getImage().getScaledInstance(550, 600, Image.SCALE_DEFAULT);//image crop
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(800, 150, 550, 600);
        add(image);
        
       setBounds(0,0,1550,1000);
       setVisible(true); 
    }
    
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String user = username.getText();
            String pass = password.getText();
            
        try{
            Conn c = new Conn();
          
            
            String query = "select * from login where username='"+user+"' and password='"+pass+"'";
//            
            ResultSet rs = c.s.executeQuery(query); 
            if(rs.next()){ 
                new Dashboard();
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==cancel){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new Login();//direct constructor call
    }
}
