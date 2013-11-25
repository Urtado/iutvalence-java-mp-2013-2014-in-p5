package fr.iutvalence.java.mp.urtado;

/**
 * @author urtadob The object that the users get after he did a try.
 */
public class Result
{
    /**
     * WRONG_LETTER tells the player if the letter is not in the word
     */
    public static final int WRONG_LETTER = 0;

    /**
     * GOOD_LETTER tells the player if the letter is well-placed in the word
     */
    public static final int GOOD_LETTER = 1;
    
    /**
     * wrongPlaceLetter tells the player if the letter is in the word but a the
     * wrong place
     */
    public static final int MISPLACED_LETTER = 2;
    
    /**
     * word that is sent back to the player
     */
    private final String word;
    
    /**
     * array which tells if the letter are well placed,
     * misplaced, or not in the word
     */
    private final int[] lettersPlacement;

    /**
     * Constructor of result
     * 
     * @param placement
     *            proposition of the player
     * @param word
     *            word
     */
    public Result(String word, int[] placement)
    {
        this.word = word;
        this.lettersPlacement = placement;
    }

    /**
     * getWord allows the see the word
     * 
     * @return the word in the Result
     */
    public String getWord()
    {
        return this.word;
    }

    /**
     * getLettersPlacement allows to see the array
     * 
     * @return the placement of the letters
     */
    public int[] getLettersPlacement()
    {
        return this.lettersPlacement;
    }
    
    /**
     * @param result 
     * @return
     */
    public Boolean goodWord()
    {
        int i = 0;
        while (this.lettersPlacement[i] == GOOD_LETTER && i < 6)
            i++;
        if (i == 5)
            return true;
        else 
            return false;
    }

    public String toString()
    {
        int i;
        String letter = "";
        for (i = 0; i<6; i++)
            letter = letter + "" +this.lettersPlacement[i];
        return letter;

    }
}
