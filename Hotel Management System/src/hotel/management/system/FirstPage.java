
package hotel.management.system;



//package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class FirstPage extends JFrame implements Runnable  {
    Thread t;
  
    FirstPage(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 
        
         setBounds(0,0,3000,1000);
         
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
      Image i2 = i1.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(550,0,400,200);
      add(image);
        
        
        
        //setSize(2000,2000);
       
        
        JTextArea t1=new JTextArea("A");
        t1.setFont(new Font("Tohoma",Font.PLAIN,20));
        t1.setBounds(745,180,250,30);
        t1.setForeground(Color.BLACK);
        add(t1);
        
        JTextArea t2=new JTextArea("Project Report");
        t2.setFont(new Font("Tohoma",Font.PLAIN,20));
        t2.setBounds(685,205,250,30);
        t2.setForeground(Color.BLACK);
        add(t2);
        
        JTextArea t3=new JTextArea("On");
        t3.setFont(new Font("Tohoma",Font.PLAIN,20));
        t3.setBounds(740,230,250,30);
        t3.setForeground(Color.BLACK);
        add(t3);
        
        JTextArea t4=new JTextArea("HOTEL MANAGEMENT SYSTEM");
        t4.setFont(new Font("Tohoma",Font.BOLD,20));
        t4.setBounds(600,260,310,30);
        t4.setForeground(Color.DARK_GRAY);
        add(t4);
        
        JTextArea t5=new JTextArea("Submitted To");
        t5.setFont(new Font("Tohoma",Font.PLAIN,20));
        t5.setBounds(690,290,250,30);
        t5.setForeground(Color.BLACK);
        add(t5);
        
        JTextArea t6=new JTextArea("Bharati Vidyapeeth Deemed University,Pune");
        t6.setFont(new Font("Tohoma",Font.BOLD,20));
        t6.setBounds(550,320,435,30);
        t6.setForeground(Color.ORANGE);
        add(t6);
        
        JTextArea t7=new JTextArea("In partial fulfillment of the requirement of");
        t7.setFont(new Font("Tohoma",Font.PLAIN,20));
        t7.setBounds(575,350,450,30);
        t7.setForeground(Color.BLACK);
        add(t7);
        
        JTextArea t8=new JTextArea("BACHLOR OF COMPUTER APPLICATION BCA-III(SEM-V)");
        t8.setFont(new Font("Tohoma",Font.BOLD,20));
        t8.setBounds(490,380,550,30);
        t8.setForeground(Color.BLACK);
        add(t8);
        
        JTextArea t9=new JTextArea("2023-24");
        t9.setFont(new Font("Tohoma",Font.PLAIN,20));
        t9.setBounds(710,410,250,30);
        t9.setForeground(Color.BLACK);
        add(t9);
        
        JTextArea t10=new JTextArea("Submitted By,");
        t10.setFont(new Font("Tohoma",Font.PLAIN,20));
        t10.setBounds(685,440,250,30);
        t10.setForeground(Color.BLACK);
        add(t10);
        
        JTextArea t11=new JTextArea("Miss.AARTI MALLAYYA SWAMI");
        t11.setFont(new Font("Tohoma",Font.BOLD,20));
        t11.setBounds(600,470,550,30);
        t11.setForeground(Color.BLACK);
        add(t11);
        
        JTextArea t12=new JTextArea("Miss.ANUSHKA SANJAY YADAV");
        t12.setFont(new Font("Tohoma",Font.BOLD,20));
        t12.setBounds(600,500,550,30);
        t12.setForeground(Color.BLACK);
        add(t12);
        
        JTextArea t13=new JTextArea("Under the Guidance of");
        t13.setFont(new Font("Tohoma",Font.PLAIN,20));
        t13.setBounds(640,525,250,30);
        t13.setForeground(Color.BLACK);
        add(t13);
        
        JTextArea t14=new JTextArea("DR.P.P.PATIL");
        t14.setFont(new Font("Tohoma",Font.BOLD,20));
        t14.setBounds(680,555,550,30);
        t14.setForeground(Color.BLACK);
        add(t14);
        
        JTextArea t15=new JTextArea("Through");
        t15.setFont(new Font("Tohoma",Font.PLAIN,20));
        t15.setBounds(710,580,250,30);
        t15.setForeground(Color.BLACK);
        add(t15);
        
        JTextArea t16=new JTextArea("THE DIRECTOR");
        t16.setFont(new Font("Tohoma",Font.BOLD,20));
        t16.setBounds(670,610,550,30);
        t16.setForeground(Color.BLACK);
        add(t16);
        
         JTextArea t20=new JTextArea("DR. AJIM SHAIKH");
        t20.setFont(new Font("Tohoma",Font.BOLD,20));
        t20.setBounds(670,640,550,30);
        t20.setForeground(Color.BLACK);
        add(t20);
        
        JTextArea t17=new JTextArea("BHARATI VIDYAPEETH DEEMED UNIVERSITY,PUNE");
        t17.setFont(new Font("Tohoma",Font.BOLD,20));
        t17.setBounds(490,670,600,30);
        t17.setForeground(Color.BLACK);
        add(t17);
        
        JTextArea t18=new JTextArea("YASHWANTRAO MOHITE INSTITUTE OF MANAGEMENT,KARAD");
        t18.setFont(new Font("Tohoma",Font.BOLD,20));
        t18.setBounds(440,700,650,30);
        t18.setForeground(Color.BLACK);
        add(t18);
        
        JTextArea t19=new JTextArea("(2023-24)");
        t19.setFont(new Font("Tohoma",Font.PLAIN,20));
        t19.setBounds(700,730,250,30);
        t19.setForeground(Color.BLACK);
        add(t19);
        
        
        t=new Thread(this);
        t.start();
  
                      
       

         setVisible(true);
    
    }
    
    public void run(){
        try{
            Thread.sleep(6000);
            setVisible(false);
               new HotelManagementSystem();
        }
        catch(Exception e){}
    }
    
    
    
    public static void main(String[]args){
        new FirstPage();

}
}