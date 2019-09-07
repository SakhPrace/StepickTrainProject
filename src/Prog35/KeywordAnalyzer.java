package Prog35;

abstract class KeywordAnalyzer implements TextAnalyzer{

    protected String[] keywords;

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String str){
        for (String word: getKeywords()) {
            if (str.contains(word)){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
