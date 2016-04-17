//import inportant things to make program run
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*; 

public class MemoryGame extends JFrame implements ActionListener{
  //make private variables     
   private final int WINDOW_WIDTH = 500;  // Window width
   private final int WINDOW_HEIGHT = 500; // Window height
   private JButton [] doors  = new JButton[16];//number of buttons
  // private GameModel model= new GameModel();
   private String filler = "   "; 
   private JLabel result;
   private int success = 0;//this will need to be fixed
   private JLabel successesLabel;
   private int [] sources = new int[2];
   private MatchImages icons;
   private boolean endGame = false;
   private boolean match;
   private double count = 0.0;
   
   //private BehindTheDoors pictures = new BehindTheDoors(); //adjust this to fit 
   
   //constructor 
   public MemoryGame(){
      /*****************whole frame set up BorderLayout****************/
      // Set the window title, size and close behaviour
      setTitle("Memory Game");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
   
      //*the exterior JFrame will be in borderlayout 
      setLayout(new BorderLayout());
      JLabel banner = new JLabel("Let's play a Memory Game");
      banner.setFont(new Font("Comic Sans", Font.BOLD, 32));
      //create panels and add color color
      Panel north= new Panel();
      north.setBackground(Color.cyan);
      Panel south= new Panel();
      south.setBackground(Color.cyan);
      Panel east= new Panel();
      east.setBackground(Color.cyan);
      Panel west= new Panel();
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
      east.setLayout(new GridLayout(4,1));
         //add timer components and successes
      JLabel timer=new JLabel( " Timer: ");
      timer.setFont(new Font("Comic Sans", Font.BOLD, 16));
      east.add(timer);
      // add actual timer here
      east.add( new JLabel("                   "));
      JLabel matches=new JLabel( " Matches Made: ");
      matches.setFont(new Font("Comic Sans", Font.BOLD, 16));
      east.add (matches);
      //figure out how to do successes
      east.add( new JLabel("                   "));
     
      icons = new MatchImages();
                 /**********detailed set up of the Panel (GridLayot) for the MemoryGame************/               
      Panel pDoors = new Panel();
      pDoors.setLayout(new GridLayout(4,4)); 
   
     //add all panels to frame
      add(north,BorderLayout.NORTH);
      add(south,BorderLayout.SOUTH);
      add(east,BorderLayout.EAST);
      add(west,BorderLayout.WEST);
      
    /**** make components to put in the Pane, add them to the Panel and then add listener to them*****/   
      /** this would probably be best done in its own method  ***/    
      for(int i=0;i<16;i++){
         String symbol= "\u2605";
         String doorNumber = i+1+""; 
         doors[i] = new JButton(symbol);
         //doors[i] = new JButton(doorNumber);  
         doors[i].setFont(new Font("Comic Sans", Font.BOLD, 32));
         doors[i].addActionListener(this);
         if (i%2==0){
            doors[i].setBackground(Color.lightGray);
         }//close if
         else{
            doors[i].setBackground(Color.white);
         }//else
         pDoors.add(doors[i]);  
      }  //for loop
         //add components of buttons to the center panel 
      add(pDoors,BorderLayout.CENTER); 
      setVisible(true);     
   }//close public MemoryGame
   //create ActionPerformed
   public void actionPerformed(ActionEvent ae) {   
  
      JButton source = (JButton)ae.getSource(); 
     int i=0;
      while( source != doors[i])
         i++; 
     
      if(count%2.0==0){
         sources[0] = i;
         count = icons.clicks(count);
         doors[i].setIcon(icons.getImage(i));
         doors[i].removeActionListener(this);
      }
      else{
         sources[1] = i;
         count = icons.clicks(count);
         doors[i].setIcon(icons.getImage(i));
         doors[i].removeActionListener(this);
 
         match = icons.takeTurn(sources);
         //if
         }
            
            
             if(match == false && count%2.0==0){
            //try{
              // Thread.sleep(2000);
            //}
          //  catch(InterruptedException ie){}
            doors[sources[0]].setIcon(null);
            doors[sources[0]].addActionListener(this);
            doors[sources[1]].setIcon(null);
            doors[sources[1]].addActionListener(this); 
         
         }//if
      
            }
            
            
           
         
         //try{
          //  Thread.sleep(2000);
        // }
        // catch(InterruptedException ie){}
   
      
      
        // endGame = icons.gameOverStatus(success, endGame);
        // if(endGame = true)
           
      
      
      
   }//action performed
//close class MemoryGame

