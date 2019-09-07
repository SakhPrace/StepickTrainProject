package Prog35;

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    protected String[] getKeywords(){
        return keywords;
    }

    protected Label getLabel(){
        return Label.SPAM;
    }

    public SpamAnalyzer(String[] keys){
        keywords = keys;
    }

}
