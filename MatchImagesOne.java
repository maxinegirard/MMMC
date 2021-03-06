import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;
//import java.util.ArrayList<E>; 

class MatchImagesOne extends GameModelOne{

   private ImageIcon [] images = new ImageIcon[16];
   boolean match = false;
   boolean gos = false;
   boolean winner = false;
   String status = "";
   int ROWS = 4
   int COLS = 4
   int successes = 0;
   int turn1 = -1;
   final int SIZE = 8; 
   
   MatchImages(){
      //not random, to test
      
      
      /*commented out to debug, not random
      ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>(Arrays.asList(images));
      Collections.shuffle(imageList);
      // put images back in the plain [] array
      for( int i=0;i<imageList.size();i++)
         images[i] = imageList.get(i);
      commented out to debug*/
      
      images[0] = new ImageIcon("michelle1.jpg" , "michelle 1"); 
      images[1] = new ImageIcon("michelle2.jpg" , "michelle 2");
      images[2] = new ImageIcon("chyenne1.jpg" , "chyenne 1");
      images[3] = new ImageIcon("c.jpg" , "c");
      images[4] = new ImageIcon("marilyn1.jpg" , "marilyn 1");
      images[5] = new ImageIcon("marilyn2.jpg", "marilyn 2");
      images[6] = new ImageIcon("maxine1.jpg" , "maxine 1");
      images[7] = new ImageIcon("maxine2.png" , "mainxe 2");
      images[8] = new ImageIcon("michelle1.jpg" ,"michelle 1"); 
      images[9] = new ImageIcon("michelle2.jpg" , "michelle 2");
      images[10] = new ImageIcon("chyenne1.jpg" , "chyenne 1");
      images[11] = new ImageIcon("c.jpg" , "c");
      images[12] = new ImageIcon("marilyn1.jpg" , "marilyn 1");
      images[13] = new ImageIcon("marilyn2.jpg" , "marilyn 2");
      images[14] = new ImageIcon("maxine1.jpg" , "maxine 1");
      images[15] = new ImageIcon("maxine2.png" , "maxine 2");

   }//MatchImages Constructor
   
   int getRows(){
      return(ROWS);
      }
   int getCols(){
      return(COLS);
      }
   int getSize(){
      return(SIZE);
   }// getSize
  
      
  public ImageIcon get(int i){ 
      return(images[i]); 
      }  //not sure why we need this one....?   
      
   public boolean gameOverStatus(boolean gos){
      if(successes == SIZE)   
         return( true);
      else
         return(false); 
   }//end gameOverStatus
   
   public isMatch(boolean match, String status){
       if(match == true){
       status = "it's a match";
       }
       else{
       status = "this is not a match";
       }
       return(status);
       }//end isMatch
      
   void display(){};    
   
   public ImageIcon getImage(int i){
      if(i>=0 && i<SIZE)
         return(images[i]); 
      else
         return(images[0]); 
         }//end ImageIcon
         
    public void takeTurn (int turn){
      if(turn1<0){
         // first choice
         match = false; 
         turn1 = turn;
      }
      else{
         //second choice
         int turn2 = turn;
         String turn1Description = images[turn1].toString();
         String turn2Description = images[turn2].toString(); 
         match = turn1Description.equals(turn2Description);
         if(match) successes +=1; 
         turn1 = -1;   
      }
 
}//takeTurn
}//class
