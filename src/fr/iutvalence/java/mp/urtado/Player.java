package fr.iutvalence.java.mp.urtado;

/** Joueur
 * @urtadob
 * Défini par un pseudo
 * Défini par un numéro de joueur
 *
 */

public class Player 
{

    /**
     * score of the player
     */
  
    private int playerScore;

    /**
     * pseudo is the pseudo of the player
     */
  
    private String pseudo;
    
    /**
     * numberPlayer is an integer that shows the number  of the player
     */

    private int numberPlayer;
    /**
     * Constructor of player
     */
    
    public Player()
    {
        String p = "Joueur 1";
        this.pseudo = p;
        this.numberPlayer = 1;
        this.playerScore = 0;
    }
     
    /**
     * getWord get the proposition of the player
     * @return Res is the proposition of the player
     */
    public String getWord()
    {
       String res = "";
       return res; 
    }

    
    /**
     * showResult show the proposition after the
     * @param word the result we show to the player
     * 
     */
    public void showWord(Result word)
    {
        
    }
}


    
    
