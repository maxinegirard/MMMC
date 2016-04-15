import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  


abstract class GameModel{

   abstract int takeTurn(int success, boolean gos);  
   abstract boolean gameOverStatus(int success, boolean gos);
   abstract ImageIcon get(int i);
   abstract int getRows();
   abstract int getCols(); 
   abstract void display(); 
   abstract boolean reportWinner(boolean gos, boolean winner); 
   abstract boolean CompareImages(int sources[]);  
   
}// class