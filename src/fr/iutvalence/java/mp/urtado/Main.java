package fr.iutvalence.java.mp.urtado;

/**
 * @author urtadob
 * class that run the game.
 */
public class Main
{
    /**
     * @param args
     * methods that call the game algorithm in the class game.
     */  
    public static void main(String[] args)
    {
        new Game(new Player()).play();
    }

}
