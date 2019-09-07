package four;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords = {":(", "=(", ":|"};

    protected String[] getKeywords(){
        return keywords;
    }

    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }

}
