package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ClearScreenExample2 {

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

}
