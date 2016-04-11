 public void actionPerformed(ActionEvent ae){
 for(int turns =0; turns<9; turns++){ 
      for(int j=0;j<2;j++){
      JButton source = (JButton)ae.getSource(); 

      int i=0;
      while(source != doors[i])
         i++; 
         
      sources[j] = i;
      doors[i].setIcon(icons.getImage(i));
      doors[i].removeActionListener(this);
      
      }//for loop to get two buttons
      //I think this is where I'd send in the array of two ints to takeTurns 
      
      

     }//for loop that keeps the game going
 }//action performed