
package hotel.management.system;
import javax.swing.*; 
import java.awt.*; //text color
import java.awt.event.*;//ActionListner
                                                  //implements ActionListener == finding click on button 
public  class HotelManagementSystem extends JFrame implements ActionListener {

  HotelManagementSystem(){
//      setSize(1366,565);   //frame size  //length , breadth  
//      setLocation(100,100); //location X,Y
      this.setBounds(0,0,1550,1000); //combination of set size and loaction
      this.setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));//image path
      JLabel image = new JLabel(i1);
      image.setBounds(80,120,1366,565);//image on frame ||||      location_x  location_Y , length,   breadth  //// 
      add(image); //display image
      JLabel text = new JLabel("Hotel Management System");
      text.setBounds(20,430,1000,90);//text layout
      text.setForeground(Color.WHITE);//text color
      text.setFont(new Font("serif",Font.PLAIN,70));//1)font-family ,2)font-typre 3) font-size
      image.add(text);//adding text ex- hotel management system
      
      JButton next = new JButton("Next");
      next.setBounds(1150,450,150,50);
      next.setBackground(Color.white);//background color
      next.setForeground(Color.black);//text color
      next.addActionListener(this);                     //finding actionlistner button(next)
      next.setFont(new Font("serif",Font.PLAIN,25));//1)font-family ,2)font-typre 3) font-size
       
      image.add(next);
      
      setVisible(true);//empty frame is visible
      while(true){
          text.setVisible(false);//lable is hide 500 milli sec
          try {
              Thread.sleep(500);
          }catch(Exception e){
              e.printStackTrace();
           }
          text.setVisible(true); //label are shown after 500 milli sec
              try{
              Thread.sleep(500);
          }catch(Exception e){
              e.printStackTrace();
          }
              text.setVisible(true);
      }
  }
  public void actionPerformed(ActionEvent ae){//implements ActionListner 
      setVisible(false);// current frame close
      new Login();// open login page
  }
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
