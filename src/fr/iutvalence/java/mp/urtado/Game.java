package fr.iutvalence.java.mp.urtado;


/** 
 *@urtadob
 *  
 */

public class Game
{
    /**
     * tryNumber is the number of try left
     */
    public int tryNumber;
    /**
     * player is the pseudo of the player
     */
    public Player player;
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
    private void startGame()
    {

    }
    
    /**
     * Action of ending the game
     */
    private void endGame()
    {
       
    }
    
    /**
     * Start a new turn and if the value of turn is above 8 then finish the game 
     */
    private void newTurn()
    {
     this.tryNumber = 6;
     if (this.finalScore == 60 )
         endGame();
     else    
         new Word();
         
    }
    
    /**
     * Start a new try and if the value of try is above 6 then start a new word
     */
    private void newTry()
    { 
      Player.getWord();
      // compare to the sixLetterWord
      Player.showWord();
      this.tryNumber = this.tryNumber - 1; 
      
    }
   
    /**
     * Game constructor with the player in parameter
     * @param player2 is player of the game
     */    
    public Game(Player player2)
    {
    this.finalScore = 0;
    this.turn = 6;
    this.playerNumber = 1;
    this.player = player2;
    this.tryNumber = 6;
    }

    /**
     * Algorithm of the game
     */
    public void play()
    {
        startGame();
        while (this.finalScore != 60)
            newTurn();
            while (this.tryNumber != 0)
                newTry();
    }
   
}
