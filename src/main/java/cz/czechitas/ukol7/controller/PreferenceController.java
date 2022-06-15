package cz.czechitas.ukol7.controller;

import com.jgoodies.binding.PresentationModel;
import cz.czechitas.ukol7.formbuilder.ActionBuilder;
import cz.czechitas.ukol7.model.ModelBean;
import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class PreferenceController {
    private final PresentationModel<ModelBean> model;
    private final Action ulozitAction;

    public PreferenceController() {
        model = new PresentationModel<>(new ModelBean());
        ulozitAction = ActionBuilder.create("&Ulozit", this::handleUlozit);
        model.addBeanPropertyChangeListener(this::handlePropertyChange);
        vypocitajStavAkci();
    }

    private void handleUlozit() {
        ModelBean bean = this.model.getBean();
        System.out.println("-- Ukladam data o farbe --");
        System.out.printf("Prezivka: %s", bean.getPrezivka()).println();
        System.out.println("Oblubena farba osoby s prezivkou " + bean.getPrezivka() + " je " + bean.getOblubenaFarba().getText());
    }

    private void handlePropertyChange(PropertyChangeEvent propertyChangeEvent) {
        vypocitajStavAkci();
    }

    public PresentationModel<ModelBean> getModel() {
        return model;
    }

    public Action getUlozitAction() {
        return ulozitAction;
    }

    private void vypocitajStavAkci() {
        ulozitAction.setEnabled(model.getBean().getPrezivka() != null && model.getBean().getOblubenaFarba() != null);
    }
}