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
     * is the first word in the array
     */
    private final static int lowerWord = 0;
    /**
     * 
     * dictionnary is an array where all the sixLetterWord are stocked
     */
    public String dictionnary[]={"decors","glaces","vision","auteur","taille","lignes","nouees","lucide","peines","couter","accent","vaches","trente","sainte","poutre","police","saumon","minois","etroit","minees","joules","gaffes","equipe","eviter","prison","etoile","hockey","repris","migale","aimant","pierre","ardeur","alcool","nombre","confus","auteur","postes","repris","eclair","organe","ouvert","tester","pentes","tentes","traite","cartes","doutes","pistes","piston","carton","routes","calcul","tartes","mordue","cousin","freres","plaire","traces","courte","ecoles","dettes","crimes","vagues","cycles","tables","suites"};

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
     * @return a word.
     */
    public String getWord()
    {
        int nombreAleatoire =  (int)(Math.random() * ((this.numberWord - lowerWord) + 1));
        return this.dictionnary[nombreAleatoire];
    }

    /**
     * 
     */
    public Dictionnary()
    {
        this.numberWord = 67;
    }

}
