/**
 * 
 */
package fr.iutvalence.java.mp.urtado;

/**
 * @author urtadob
 *
 */
public class SystemOutput
{
    /**
     * @param word is the word the player has to find.
     */
    public void cheatcode(String word)
    {
      System.out.println("CHEATCODE :" + word);
    }
    
    /**
     * ask the player to write a proposition.
     */
    public void enterProposition()
    {
      System.out.println("Veuillez entrer une proposition!");
    }
    
    /**
     * Says to the player he have successfully find the word
     */
    public void wordFind()
    {
        System.out.println("Bravo, vous avez trouver le bon mot!");
    }
   
    /**
     * Tell the player he haven't find the word in the number of try given to him
     */
    public void wordNotFind()
    {
        System.out.println("Dommage, vous n'avez pas trouver le bon mot!");
    }
    
    /**
     * tell the player that his proposition hasn't the right number of letter
     */
    public void wrongSize()
    {
        System.out.println("Mauvais nombre de lettres");
    }
    
    /**
     * @param word the word he proposed
     * show the result of the comparison to the player
     */
    public void showWord(Result word)
    {
        String NewLigne = System.getProperty("line.separator");
        System.out.println("Proposition:" + word.getWord() + NewLigne + "Resultat:" + word.toString()
                + NewLigne + "Légende : 0 = Lettre pas présente, 1 = Lettre bien placé, 2 = Lettre mal placé");

    }
    
    /**
     * @param numberOfWord is the number of word he played
     * print to the player that he win
     */
    public void endGame(int numberOfWord)
    {
        System.out.println("Vous avez réussi en" + numberOfWord + "mots!");
    }
    /**
     * Tell the player he had to find a new word
     * @param numberOfWord number of the chance the player still have
     */
    public void getNewWord(int numberOfWord)
    {
        System.out.println("Nouveau mot a trouvé! il vous en reste " + numberOfWord + " chances");
    }
    /**
     * Say to the player the base of the game.
     */
    public void newGameStatement()
    {
        System.out.println("Vous avez 10 mots, pour gagner, vous devez en trouver 6 parmis ces dix.");
    }

    /**
     * Constructor of the class
     */
    public SystemOutput()
    {
        
    }
}
