import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;
//import java.util.ArrayList<E>; 

class MatchImages extends GameModel{

   private ImageIcon [] images = new ImageIcon[16];
   boolean match = false;
   boolean gos = false;
   boolean winner = false;
   final int SIZE = 16; 
  
   
   MatchImages(){
      //not random, to test
      
      
      /*commented out to debug, not random
      ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>(Arrays.asList(images));
      Collections.shuffle(imageList);
      // put images back in the plain [] array
      for( int i=0;i<imageList.size();i++)
         images[i] = imageList.get(i);
      commented out to debug*/
      
      images[0] = new ImageIcon("michelle1.jpg"); 
      images[1] = new ImageIcon("michelle2.jpg");
      images[2] = new ImageIcon("chyenne1.jpg");
      images[3] = new ImageIcon("c.jpg");
      images[4] = new ImageIcon("marilyn1.jpg");
      images[5] = new ImageIcon("marilyn2.jpg");
      images[6] = new ImageIcon("maxine1.jpg");
      images[7] = new ImageIcon("maxine2.png");
      images[8] = new ImageIcon("michelle1.jpg"); 
      images[9] = new ImageIcon("michelle2.jpg");
      images[10] = new ImageIcon("chyenne1.jpg");
      images[11] = new ImageIcon("c.jpg");
      images[12] = new ImageIcon("marilyn1.jpg");
      images[13] = new ImageIcon("marilyn2.jpg");
      images[14] = new ImageIcon("maxine1.jpg");
      images[15] = new ImageIcon("maxine2.png");
      
     
   }//MatchImages Constructor
   
   int getRows(){
      return(4);
      }
   int getCols(){
      return(4);
      }
   
   
      
      public ImageIcon get(int i){ 
        return(images[i]); 
      }  //not sure why we need this one....?   
      
   public boolean gameOverStatus(int success, boolean gos){
      if (success == 4){
      gos = true;
      return(gos);
      }
      else
      return (gos);
      }//gameOverStatus
      
   void display(){};    
   
   public boolean reportWinner(boolean gos, boolean winner){ 
      if( gos == true){
      winner = true;
      return(winner);
      }
      else
      return(winner);
      }//reportWinner  
   
   int getSize(){
      return(SIZE);
   }// getSize
   
   public ImageIcon getImage(int i){
      if(i>=0 && i<SIZE)
         return(images[i]); 
      else
         return(images[0]); 
         }//ImageIcon
         
    public double clicks(double count){
    count++;
    return(count);
    }
         
    public boolean takeTurn (int[] sources){
    String imageName1 = images[sources[0]].toString();
    String imageName2 = images[sources[1]].toString();
      if (imageName1 ==imageName2){
      match = true;
      return(match);
      }
      else{
      match = false;
      return(match);
      }}
      
}//class