package fr.iutvalence.java.mp.urtado;

import java.io.*;

/**
 *  It's the class of player 
 * 
 * @urtadob
 * 
 */

public class Player
{
    // TODO (fix) write comment
    /**
     * 
     */
    private String pseudo;

    /**
     * numberPlayer is an integer that shows the number of the player
     */
    // TODO (fix) rename field
    private int numberPlayer;

    
    // TODO (fix) rewrite comment
    /**
     * Constructor of player
     */

    public Player()
    {
        // TODO (fix) avoid using temp variable
        String p = "Joueur 1";
        this.pseudo = p;
        this.numberPlayer = 1;       
    }

    /**
     * getWord get the proposition of the player
     * 
     * @return Res is the proposition of the player
     */
    public String getWord()
    {
      
            InputStreamReader isr = null;
            try
            {
                isr = new InputStreamReader(System.in, "US-ASCII");
            }
            catch (UnsupportedEncodingException e)
            {
                return null;
            }
            BufferedReader br = new BufferedReader(isr);

            try
            {
                return br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
                return null;
            }
     }
        
} 

    
 