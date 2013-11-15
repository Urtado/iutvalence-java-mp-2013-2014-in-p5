package fr.iutvalence.java.mp.urtado;

/**
 * @urtadob The class that show the process of a game
 */

// TODO (fix) this class should only have one public method called "play"
public class Game
{
    // TODO (think about it) you have to distinguish local variables from
    // fields.
    // some of the following declarations are much more local variable than part
    // of game state
    /**
     * pointEarned is the number of point a word is worth
     */
    // TODO (fix) comply with naming conventions
    private final static int pointEarned = 10;

    /**
     * winningScore is the score that the player have to reach to win the game
     */
    // TODO (fix) comply with naming conventions
    private final static int winningScore = 60;

    /**
     * normalWordLength is the length an answer give by the player should be
     */
    // TODO (fix) comply with naming conventions
    private final static int normalWordLength = 6;

    /**
     * Constants of the number of try.
     */
    // TODO (fix) comply with naming conventions
    private final static int numberTryStart = 6;

    /**
     * number of tries left
     */
    private int numberOfTriesLeft;

    // TODO (fix) this field suggest that you have only one player
    /**
     * player
     */
    private Player player;

    // TODO (fix) this field suggest that you have one or more than one player
    /**
     * number of player in the game (1 or 2)
     */
    private int playerNumber;

    /**
     * word that the player have to find
     */
    private Word word;

    /**
     * the number of words already played
     */
    private int wordsAlreadyPlayed;

    /**
     * score at the end of the game
     */
    public int finalScore;

    /**
     * Game constructor with the player in parameter
     * 
     * @param player
     *            is player of the game
     */

    public Game(Player player)
    {
        this.finalScore = 0;
        this.wordsAlreadyPlayed = 0;
        this.playerNumber = 1;
        this.player = player;
        this.numberOfTriesLeft = numberTryStart;
    }

    /**
     * Start a new try and if the value of try is above 6 then start a new word
     */
    private void newTry()
    {
        this.player.showWord(compareWord(this.player.getWord(), this.word.sixLettersWord));
        this.numberOfTriesLeft = this.numberOfTriesLeft - 1;

    }

    /**
     * compare the answer with the word to find.
     * 
     * @param res
     *            the result of the function getWord
     * @param word
     *            the word the player have to find
     * @return null says if the result is correct or not
     */
    // TODO (fix) simplify this method, it is not really readable
    private Result compareWord(String res, String word)
    {
        int[] placement = new int[5];
        char[] resArray = res.toLowerCase().toCharArray();
        char[] wordArray = word.toLowerCase().toCharArray();
        int i = 0;
        int j = 0;
        Result arrayPlacement;

        // test if the length of the word is correct
        if (res.length() != normalWordLength)
        {
            return null;
        }

        // TODO (fix) simplify
        else

            // If the length is correct, we look if the word is the same as the
            // proposition
            while (resArray[i] == wordArray[j] && i != 5)
            {
                i++;
                j++;
            }

        // If the word is the same, we update the final score, and put the
        // number of try at 0, and return the result
        if (i == 5)
        {
            this.finalScore = this.finalScore + pointEarned;
            for (i = 0; i < 5; i++)
                placement[i] = Result.GOOD_LETTER;
            arrayPlacement = new Result(res, placement);
            this.numberOfTriesLeft = 0;
            return arrayPlacement;
        }

        // If the word isn't the same, we look character by character to fill
        // the placement array, and then return it.
        else
        {
            for (i = 0; i < 5; i++)
            {
                for (j = 0; j < 5; j++)
                {
                    if (resArray[j] != wordArray[i])
                        placement[i] = Result.WRONG_LETTER;
                    if (resArray[j] == wordArray[i] && i == j)
                        placement[i] = Result.GOOD_LETTER;
                    if (resArray[j] == wordArray[i] && i != j)
                        placement[i] = Result.MISPLACED_LETTER;
                }
            }

            arrayPlacement = new Result(res, placement);
            return arrayPlacement;
        }
    }

    /**
     * Algorithm of the game
     */
    public void play()
    {
        Dictionnary dico = null;
        dico = new Dictionnary();
        while (this.finalScore != winningScore)
        {
            this.word = new Word(dico.getWord());
            this.wordsAlreadyPlayed = this.wordsAlreadyPlayed + 1;
            this.numberOfTriesLeft = numberTryStart;
            while (this.numberOfTriesLeft > 0)
                newTry();
        }
        System.out.println("Bravo vous avez réussi en " + this.wordsAlreadyPlayed + "mots!");
    }

}
