//import inportant things to make program run
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*; 

public class MemoryGame extends JFrame implements ActionListener{
  //make private variables     
   private final int WINDOW_WIDTH = 500;  // Window width
   private final int WINDOW_HEIGHT = 500; // Window height
   private JButton [][] doors  = new JButton[4][4];//number of buttons
  // private GameModel model= new GameModel();
   private String filler = "   "; 
   private JLabel result;//need this??
   private int successes = 0;//this will need to be fixed
   private JLabel successesLabel;//need this??
   private int [] sources= new int [2];//need this??
   //private MatchImages icons= new MatchImages();

   //constructor 
   public MemoryGame(){
      //whole frame set up BorderLayout
      // Set the window title, size and close behaviour
      setTitle("Memory Game");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
   
      //the exterior JFrame will be in borderlayout 
      setLayout(new BorderLayout());
      JLabel banner = new JLabel("Let's play a Memory Game");
      banner.setFont(new Font("Comic Sans", Font.BOLD, 32));
      //create panels and add borders and color 
      JPanel north= new JPanel();
      north.setBorder(BorderFactory.createMatteBorder(3,3,0,3, Color.BLACK));
      north.setBackground(new Color(174, 142, 206));
      JPanel south= new JPanel();
      south.setBorder(BorderFactory.createMatteBorder(0,3,3,3, Color.BLACK));
      south.setBackground(new Color(174, 142, 206));
      JPanel east= new JPanel();
      east.setBorder(BorderFactory.createMatteBorder(0,0,0,3, Color.BLACK));
      east.setBackground(new Color(174, 142, 206));
      JPanel west= new JPanel();
      west.setBorder(BorderFactory.createMatteBorder(0,3,0,0, Color.BLACK));
      west.setBackground(new Color(174, 142, 206));
   
      //add stuff to the panels
      //north panel
      north.add(banner);
      add(north,BorderLayout.NORTH); 
      //west panel
      west.add( new JLabel(filler));
      add(west,BorderLayout.WEST);
      result = new JLabel(filler); 
      //south panel
      south.add(result);
      add(south,BorderLayout.SOUTH);
      //east panel
      east.setLayout(new GridLayout(6,1));
      //player information
      JLabel player=new JLabel(" Player: ");
      player.setFont(new Font("Comic Sans", Font.BOLD, 16));
      east.add(player);
      //add switchplayer kind of thing
      east.add( new JLabel(" 1 "));
      //add timer components and successes
      JLabel timer=new JLabel( " Timer: ");
      timer.setFont(new Font("Comic Sans", Font.BOLD, 16));
      east.add(timer);
      // add actual timer here
      east.add( new JLabel(" 10:56 "));
      JLabel matches=new JLabel( " Matches Made: ");
      matches.setFont(new Font("Comic Sans", Font.BOLD, 16));
      east.add (matches);
      //figure out how to do successes
      east.add( new JLabel("                   "));
     
      //detailed set up of the Panel (GridLayot) for the MemoryGame and add borders             
      JPanel pDoors = new JPanel();
      pDoors.setBorder( BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(3,3,3,3, Color.BLACK), BorderFactory.createRaisedBevelBorder()));
      pDoors.setLayout(new GridLayout(4,4)); 
   
     //add all panels to frame
      add(north,BorderLayout.NORTH);
      add(south,BorderLayout.SOUTH);
      add(east,BorderLayout.EAST);
      add(west,BorderLayout.WEST);
      
      // make components to put in the Pane, add them to the Panel and then add listener to them  
      /** this would probably be best done in its own method  ***/ 
   for(int rows=0; rows<4; rows++){
      for(int cols=0;cols<4;cols++){
         String symbol= "\u2605";
         doors[rows][cols] = new JButton(symbol);  
         doors[rows][cols].setFont(new Font("Comic Sans", Font.BOLD, 40));
         doors[rows][cols].addActionListener(this);
         if (cols%2==0){
            doors[rows][cols].setBackground(new Color(217,215,255));
         }//close if
         else{
            doors[rows][cols].setBackground(new Color(140, 72, 159));
         }//else
         pDoors.add(doors[rows][cols]);  
      }  //inner for loop
      }//outer for loop
         //add components of buttons to the center panel 
      add(pDoors,BorderLayout.CENTER); 
      setVisible(true);     
   }//close public MemoryGame
   //create ActionPerformed
   public void actionPerformed(ActionEvent ae){
      JButton source=(JButton)ae.getSource();}
}//close class MemoryGame