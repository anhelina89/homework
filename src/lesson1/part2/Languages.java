package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Languages {
    public static void main(String[] args) {
        Languages lng = new Languages();
        lng.checkIsNotExtinct(100);//default value
        lng.checkSpellingAbility();
        lng.getUsedInTheWorld();
        lng.estimateHardnessToLearn();
        lng.estimateGrammar();
    }


    private int averegeNumofWords;
    private double usedInTheWorld; //how many people are using it (xx%)
    private boolean difficultyToLearn;
    private String difficultyByGrammar;
    private boolean spelling; // is it possible to spell
    private boolean allive;
    private String type; //a sign language or regular
    private int amountOfSinonims;
    private int numOfLetters;

    //methods started
    public void countWord() {
        System.out.println("Count/check/find in the Internet how many words is in the particular language as average number");
        getAveregeNumofWords();
    }

    public void checkUsageInWorld() {
        System.out.println("Check how many words is enough for ordinary well-educated persone");
        getUsedInTheWorld();
    }

    public void estimateHardnessToLearn() {
        System.out.println("Estimate how is it difficult to learn this particular language. Compare with Engkish");
        getDifficultyByGrammar();
    }

    public void estimateGrammar() {
        System.out.println("Estimate how is it difficult to the grammar of this particular language. Compare with Engkish");
        getDifficultyByGrammar();
    }

    public void checkSpellingAbility() {
        System.out.println("Is it possible to spell all words like in English");
        isSpelling();
    }

    public void checkIsNotExtinct(int numOfPeople) {
        System.out.println("Check how many people are using this language in the world");
        if (numOfPeople>1000) {
            allive = true;
        }    else{
            System.out.println("language dies out");

            }
        }


    public void countSinonims() {
        System.out.println("collect the words with the same/similar meanings and count the average num");
    }


    public void findFairyTailsOnLanguage() {
        System.out.println("Check that there are a lot of old and new fairy tails that were written on this language");
    }

    public void checkSchoolsTeaching() {
        System.out.println("Check the number of schools that use this language as native");
    }


    // methods finished

    //getters started

    public int getNumOfLetters() {
        return numOfLetters;
    }

    public int getAveregeNumofWords() {
        return averegeNumofWords;
    }

    public double getUsedInTheWorld() {
        return usedInTheWorld;
    }

    public boolean isDifficultyToLearn() {
        return difficultyToLearn;
    }

    public String getDifficultyByGrammar() {
        return difficultyByGrammar;
    }

    public boolean isSpelling() {
        return spelling;
    }

    public boolean isAllive() {
        return allive;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfSinonims() {
        return amountOfSinonims;
    }
    //getters finished

    //setter started
    public void setNumOfLetters(int numOfLetters) {
        this.numOfLetters = numOfLetters;
    }

    public void setAveregeNumofWords(int averegeNumofWords) {
        this.averegeNumofWords = averegeNumofWords;
    }

    public void setUsedInTheWorld(double usedInTheWorld) {
        this.usedInTheWorld = usedInTheWorld;
    }

    public void setDifficultyToLearn(boolean difficultyToLearn) {
        this.difficultyToLearn = difficultyToLearn;
    }

    public void setDifficultyByGrammar(String difficultyByGrammar) {
        this.difficultyByGrammar = difficultyByGrammar;
    }

    public void setSpelling(boolean spelling) {
        this.spelling = spelling;
    }

    public void setAllive(boolean allive) {
        this.allive = allive;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmountOfSinonims(int amountOfSinonims) {
        this.amountOfSinonims = amountOfSinonims;
    }

    //setter finished


}
