package controller;

import source.Date;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Date> warDates;

    public Controller() {
        this.warDates = new ArrayList<>();
    }

    public Controller(ArrayList<Date> warDates) {
        this.warDates = warDates;
    }

    public ArrayList<Date> getWarDates() {
        return warDates;
    }

    public void setWarDates(ArrayList<Date> warDates) {
        this.warDates = warDates;
    }
}
