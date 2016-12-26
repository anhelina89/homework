package homework.lesson1.part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Languages {
    public static void main(String[] args) {
        Languages lng = new Languages();
        lng.setNumOfPeople(3600);
        lng.setAveregeNumofWords(1200000);
        lng.setUsedInTheWorld(12.8);
        lng.setDifficultyByGrammar("Primitive");
        lng.checkIsNotExtinct();
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
    private int numOfPeople;

    //methods started
    public void countWord() {
        System.out.println("Count/check/find in the Internet how many words is in the particular language as average number");
        getAveregeNumofWords();
    }

    public void checkUsageInWorld() {
        System.out.println("This language is used by " + getUsedInTheWorld() +"% of people in the World");

    }

    public void estimateHardnessToLearn() {
        System.out.println("Estimate how is it difficult to learn this particular language. Compare with Engkish");
        System.out.println("Be sure that average Number of words in this language is - " +getAveregeNumofWords());
    }

    public void estimateGrammar() {
        if (getDifficultyByGrammar() == "Middle") {
            System.out.println("The grammar of this language is simple enough");
        } else {
            System.out.println(getDifficultyByGrammar());
        }
    }
    public void checkSpellingAbility() {
        if (isSpelling()==true) {
            System.out.println("Is it possible to spell all words like in English");
        }
        else{
            System.out.println("Is it IMpossible to spell all words like in English");
        }
    }

    public void checkIsNotExtinct() {
        System.out.println("Check how many people are using this language in the world");
        if (getNumOfPeople()>1000) {
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

    public int getNumOfPeople() {
        return numOfPeople;
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
    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
    //setter finished




}
