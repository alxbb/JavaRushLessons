package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alex on 03.01.2017.
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth() { return 102; }
    String getDescription(){
        String sout = super.getDescription();
        sout += " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return sout;
    }
}
