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
    // TODO (fix) comply with naming conventions
    private final static int LOWER_WORD = 0;
    
    /**
     * 
     * dictionnary is an array where all the sixLetterWord are stocked
     */
    // TODO (fix) this field should be private and initialized in constructor
      public String dictionnary[];


    /**
     * Possibility of adding a word
     * 
     * @param word
     *            is the word we want to add
     */
    public void addWord(String word)
    {
        this.dictionnary[this.dictionnary.length+1] = word;
 
    }
    
    /**
     * @return a word pick randomly.
     */
    public String getWord()
    {
        int nombreAleatoire =  (int)(Math.random() * ((this.dictionnary.length - LOWER_WORD) ));
        return this.dictionnary[nombreAleatoire];
    }

    /**
     * This is the number of 
     */
    public Dictionnary()
    {
        {
            String temp[] = {"decors","glaces","vision","auteur","taille","lignes","nouees","lucide","peines","couter","accent","vaches","trente","sainte","poutre","police","saumon","minois","etroit","minees","joules","gaffes","equipe","eviter","prison","etoile","hockey","repris","migale","aimant","pierre","ardeur","alcool","nombre","confus","auteur","postes","repris","eclair","organe","ouvert","tester","pentes","tentes","traite","cartes","doutes","pistes","piston","carton","routes","calcul","tartes","mordue","cousin","freres","plaire","traces","courte","ecoles","dettes","crimes","vagues","cycles","tables","suites"};
            this.dictionnary = temp;
        }
    }

    
}
