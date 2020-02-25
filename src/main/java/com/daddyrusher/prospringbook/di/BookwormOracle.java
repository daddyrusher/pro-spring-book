package com.daddyrusher.prospringbook.di;

public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String definingMeaningOfLife() {
        return "Encyclopedia are a waste of money - go see the world instead";
    }
}
