import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  


abstract class GameModelOne{

   abstract void takeTurn(int t);  
   abstract boolean gameOverStatus(boolean gos);
   abstract ImageIcon get(int i);
   abstract int getRows();
   abstract int getCols(); 
   abstract void display(); 
   abstract String reportWinner(); 
   /*abstract boolean CompareImages(int sources[]);  */
   
}// class