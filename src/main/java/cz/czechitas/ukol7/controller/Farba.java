package cz.czechitas.ukol7.controller;

public enum Farba {

    Biela("biela"),
    Zlta("zlta"),
    Cervena("cervena"),
    Fialova("fialova"),
    Modra("modra"),
    Cierna("cierna");

    private final String text;

    Farba(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
