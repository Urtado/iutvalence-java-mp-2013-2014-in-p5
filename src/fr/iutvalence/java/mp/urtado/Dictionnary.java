package fr.iutvalence.java.mp.urtado;

/**
 * Dictionnary is the place where all the sixLetterWord are
 * 
 * @urtadob
 * 
 */
public class Dictionnary
{
    /**
     * 
     * dictionnary is an array where all the sixLetterWord are stocked
     */
    public String[] dictionnary;
    /**
     * numberWord is the counter of the number of word in the dictionnary
     */
    public int numberWord;

    /**
     * Possibility of adding a word
     * 
     * @param word
     *            is the word we want to add
     */
    public void addWord(String word)
    {
        this.dictionnary[this.numberWord] = word;
        this.numberWord = this.numberWord + 1;
    }

    /**
     * Possibility of deleting a word
     */
    public void deleteWord()
    {

    }

    /**
     * 
     */
    public Dictionnary()
    {
        this.numberWord = 0;
    }

}
