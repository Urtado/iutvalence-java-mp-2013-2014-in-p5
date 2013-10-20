package fr.iutvalence.java.mp.urtado;

// TODO (fix) finish writing comment
/**
 * @urtadob
 * 
 */

// TODO (fix) this class should only have one public method called "play"
public class Game
{
    // TODO (fix) field should be declared as private
    /**
     * tryNumber is the number of try left
     */
    public int tryNumber;

    // TODO (fix) field should be declared as private
    /**
     * player is the pseudo of the player
     */
    public Player player;

    // TODO (fix) field should be declared as private
    /**
     * playerNumber is the number of player in the game (1 or 2)
     */
    public int playerNumber;

    // TODO (fix) field should be declared as private
    /**
     * Word is word that the player have to found
     */
    public String word;

    // TODO (fix) field should be declared as private
    /**
     * Turn is the number who represent the number of word already played
     */
    public int turn;

    // TODO (fix) field should be declared as private
    /**
     * FinalScore is the score at the end of the game
     */
    public int finalScore;

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
        // TODO (fix) declare hard-coded values as constants
        this.tryNumber = 6;

        // TODO (fix) declare hard-coded values as constants
        if (this.finalScore == 60)
            endGame();
        else
            // TODO (fix) creating a new object, without using it nor storing its reference to a 
            // variable is useless
            new Word();
    }

    /**
     * Start a new try and if the value of try is above 6 then start a new word
     */
    private void newTry()
    {
        Player.getWord();
        compareWord(Player.getWord(), word);
        Player.showWord();
        this.tryNumber = this.tryNumber - 1;

    }

    /**
     * compare the answer with the word to find.
     * 
     * @param res
     *            the result of the function getWord
     * @param word
     *            the word the player have to find
     */
    public Result compareWord(String res, String word)
    {
        int[] placement = new int[5];
        char[] resArray  = res.toLowerCase().toCharArray();
        char[] wordArray = word.toLowerCase().toCharArray();
        int i;
        int j;
        Result arrayPlacement;
        if(res.length() != 6)
            this.tryNumber = this.tryNumber -1;
            return null;
        else 
            {
        for(i=0; i < 6; i++)
        {
            for(j=0; j<6; j++)
            {
                if(resArray[j] != wordArray[i])
                    placement[i] = Result.WRONG_LETTER;
                if(resArray[j] == wordArray[i] && i == j)
                    placement[i] = Result.GOOD_LETTER;
                if(resArray[j] == wordArray[i] && i != j)
                    placement[i] = Result.WRONG_PLACE_LETTER;                 
            }
        }

        arrayPlacement = new Result(res, placement);
        return arrayPlacement;
         }
    }

    
    // TODO (fix) declare constructors after fields and before other methods
    /**
     * Game constructor with the player in parameter
     * 
     * @param player2
     *            is player of the game
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
