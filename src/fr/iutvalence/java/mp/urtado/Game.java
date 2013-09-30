package fr.iutvalence.java.mp.urtado;


/** 
 *@urtadob
 *  
 */

public class Game
{
    /**
     * playerNumber is the number of player in the game (1 or 2)
     */
    public int playerNumber;
    /**
     * Word is word that the player have to found
     */
    public String word;
    /**
     * Turn is the number who represent the number of word already played
     */
    public int turn;
    /**
     * FinalScore is the score at the end of the game
     */
    public int finalScore ;
    
    /**
     * Action of starting the game
     */
    public void startGame()
    {
        //new Player(this.pseudo, this.playerNumber);
    }
    
    /**
     * Action of ending the game
     */
    public void endGame()
    {
       
    }
    
    /**
     * Start a new turn and if the value of turn is equal at 8 then finish the game 
     */
    public void newTurn()
    {
     if (this.turn >= 8)
         endGame();
     else    
         new Word();
         this.turn = this.turn +1;
    }
   
    /**
     * Game constructor with the number of player in parameter
     * @param i is the entry of the number of player 
     */    
    public Game(int i)
    {    
    this.finalScore = 0;
    this.turn = 0;
    this.playerNumber = i;
    }
   
}
