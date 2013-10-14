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
    public int playerScore;
    /**
     * pseudo is the pseudo of the player
     */
    public String pseudo;
    
    /**
     * numberPlayer is an integer that shows the number  of the player
     */
    public int numberPlayer;
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
     */
    public void showWord(Result)
    {
     
    }


        
    /**
     * Constructor of player
     */
    public Player()
    {String p = "Joueur 1";
        this.pseudo = p;
        this.numberPlayer = 1;
        this.playerScore = 0;
    }
}

    
