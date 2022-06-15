package cz.czechitas.ukol7;

import com.formdev.flatlaf.FlatLightLaf;
import cz.czechitas.ukol7.controller.PreferenceController;
import cz.czechitas.ukol7.view.HlavneOkno;
import javax.swing.*;

public class Aplikace extends JFrame {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new HlavneOkno(new PreferenceController()).start();
    }
}
