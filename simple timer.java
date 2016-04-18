import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class Countdown extends JFrame
{
  public Countdown()
  {
    setLocation(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final long twoMinutes = 120000;
    final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("mm : ss");
    final JLabel clock = new JLabel(sdf.format(new Date(twoMinutes)),JLabel.CENTER);
    int x = 0;
    ActionListener al = new ActionListener(){
      long x = twoMinutes - 1000;
      public void actionPerformed(ActionEvent ae){
        clock.setText(sdf.format(new Date(x)));
        x -= 1000;}};
    new javax.swing.Timer(1000, al).start();
    JPanel jp = new JPanel();
    jp.add(clock);
    getContentPane().add(jp);
    pack();
  }
  public static void main(String args[]){new Countdown().setVisible(true);}
  }