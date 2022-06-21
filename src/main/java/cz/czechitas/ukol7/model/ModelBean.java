package cz.czechitas.ukol7.model;

import com.jgoodies.binding.beans.ExtendedPropertyChangeSupport;
import com.jgoodies.common.bean.ObservableBean;
import cz.czechitas.ukol7.controller.Farba;

import java.beans.PropertyChangeListener;

public class ModelBean implements ObservableBean {
    private final ExtendedPropertyChangeSupport pcs = new ExtendedPropertyChangeSupport(this);

    private String prezivka;
    private Farba oblubenaFarba;

    public Farba getOblubenaFarba() {
        return oblubenaFarba;
    }

    public void setOblubenaFarba(Farba oblubenaFarba) {
        Farba oldValue = this.oblubenaFarba;
        this.oblubenaFarba = oblubenaFarba;
        pcs.firePropertyChange("farba", oldValue, oblubenaFarba);
    }

    public String getPrezivka() {
        return prezivka;
    }

    public void setPrezivka(String prezivka) {

        if (prezivka.isBlank()) {
            this.prezivka = null;
        }
        String oldVlaue = this.prezivka;
        this.prezivka = prezivka;
        pcs.firePropertyChange("prezivka", oldVlaue, prezivka);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}