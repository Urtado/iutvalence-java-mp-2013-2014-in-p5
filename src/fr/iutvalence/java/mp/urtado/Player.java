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
     * numberPlayer is an int that shows the number  of the player
     */
    public int numberPlayer;
    /**
     * Constructor of player
     * @param p String for the pseudo of the player
     * @param i int that shows the number of the player
     */
    
    public Player(String p, int i)
    {
        this.pseudo = p;
        this.numberPlayer = i;
        this.playerScore = 0;
    }
}

    
