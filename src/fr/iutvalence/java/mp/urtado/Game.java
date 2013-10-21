package fr.iutvalence.java.mp.urtado;


/**
 * @urtadob
 * The class that show the process of a game
 */

// TODO (fix) this class should only have one public method called "play"
public class Game
{
    /**
     * tryNumber is the number of try left
     */
    private int tryNumber;


    /**
     * player is the pseudo of the player
     */
    private Player player;

    /**
     * playerNumber is the number of player in the game (1 or 2)
     */
    private int playerNumber;

    /**
     * Word is word that the player have to found
     */
    private Word word;

    /**
     * Turn is the number who represent the number of word already played
     */
    private int turn;

    /**
     * FinalScore is the score at the end of the game
     */
    public int finalScore;
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
     * Start a new try and if the value of try is above 6 then start a new word
     */
    private void newTry()
    {
        this.player.showWord(compareWord(this.player.getWord(), this.word.sixLettersWord));
        this.tryNumber = this.tryNumber - 1;

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
    private Result compareWord(String res, String word)
    {
        int[] placement = new int[5];
        char[] resArray  = res.toLowerCase().toCharArray();
        char[] wordArray = word.toLowerCase().toCharArray();
        int i = 0;
        int j = 0;
        Result arrayPlacement;
        if(res.length() != 6)
            {
            this.tryNumber = this.tryNumber -1;
            return null;
            }
        
        else 
        while(resArray[i] == wordArray[j] && i != 6)
        {
           i++;
           j++;
        }
        if(i == 6)
        {
            this.finalScore = this.finalScore + this.word.score;
            for(i=0; i < 6; i++)
                placement[i] = Result.GOOD_LETTER;
            arrayPlacement = new Result(res, placement);
            this.tryNumber = 0;
            return arrayPlacement;
        }
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

   


    /**
     * Algorithm of the game
     */
    public void play()
    { 
        while (this.finalScore != 60)
        {
           this.word = new Word();
           this.turn = this.turn -1;
        }
        
        while (this.tryNumber != 0)
            newTry();
        
    }

}
