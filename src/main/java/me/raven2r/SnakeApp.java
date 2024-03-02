package me.raven2r;

import javax.swing.*;

public class SwingSnake {
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        var frame = new JFrame("Swing Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}