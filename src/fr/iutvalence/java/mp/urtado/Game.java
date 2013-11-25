package fr.iutvalence.java.mp.urtado;

/**
 * @urtadob The class that show the process of a game
 */

public class Game
{
    
    /**
     * pointEarned is the number of point a word is worth
     */
    private final static int POINT_EARNED = 10;

    /**
     * WINNING_SCORE is the score that the player have to reach to win the game
     */
    private final static int WINNING_SCORE = 60;

    /**
     * NORMAL_WORD_LENGTH is the length an answer give by the player should be
     */
    private final static int NORMAL_WORD_LENGTH = 6;

    /**
     * Constants of the number of try.
     */
    private final static int NUMBER_TRY_START = 6;

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
    private String word;

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
        this.numberOfTriesLeft = NUMBER_TRY_START;
    }

    /**
     * Start a new try and if the value of try is above 6 then start a new word
     */
    private void newTry()
    {
        this.player.showWord(compareWord(this.player.getWord()));
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
    private Result compareWord(String res)
    {
        int[] placement = new int[6];
        char[] resArray = res.toCharArray();
        char[] wordArray = this.word.toCharArray();
        int i = 0;
        int j = 0;
        int k = 0;
        Result arrayPlacement;

        // test if the length of the word is correct
        if (res.length() != NORMAL_WORD_LENGTH)
        {
            return null;
        }

        // If the word isn't the same, we look character by character to fill
        // the placement array, and then return it.
        else
        {
            boolean masque[]={true,true,true,true,true,true};
            for (i = 0; i < NORMAL_WORD_LENGTH; i++)
            {
                 for (j = 0; j < NORMAL_WORD_LENGTH; j++)
                {
                    if (resArray[i] == wordArray[j] && i == j && masque[i]== true)
                    {
                        placement[i] = Result.GOOD_LETTER;
                        masque[i] = false;
                    }   
                    if (resArray[i] != wordArray[j] && i!= j && masque[i] == true)
                    {
                        placement[i] = Result.WRONG_LETTER;
                        //masque[i] = false;                             
                    }
                }
                
                for (j=0; j< NORMAL_WORD_LENGTH;j++)
                {
                    if (resArray[i] == wordArray[j] && i != j && masque[i] == true)
                    {
                        placement[i] = Result.MISPLACED_LETTER;
                        masque[i]=false;
                    }
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
        while (this.finalScore != WINNING_SCORE)
        {
            this.word =dico.getWord();
            this.wordsAlreadyPlayed = this.wordsAlreadyPlayed + 1;
            this.numberOfTriesLeft = NUMBER_TRY_START;
            while (this.numberOfTriesLeft > 0)
            {
                char[] wordArray = this.word.toCharArray();
                System.out.println("Saissez votre proposition de mot de six lettres");
                System.out.println("CHEATCODE :"+ this.word);
                String w = this.player.getWord();
                Result r = compareWord(w);
                this.player.showWord(r);
                this.numberOfTriesLeft = this.numberOfTriesLeft - 1;
                if (r.goodWord() == true)
                    {
                    this.finalScore = this.finalScore + POINT_EARNED;
                    this.numberOfTriesLeft = 0;
                    }
                
                
            }
        }
        System.out.println("Bravo vous avez réussi en " + this.wordsAlreadyPlayed + "mots!");
    }

}
