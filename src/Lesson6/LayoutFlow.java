package Lesson6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutFlow {
    private JFrame frame;

    public static void main(String[] args) {
        LayoutFlow guiLayout = new LayoutFlow ();
        guiLayout.start ();
    }

    //    The first thing we need to do is tell Java that we want to use a layout manager for our window and which manager we want to use.
//    Every GUI Container object contains a setLayout() method to assign a layout manager to the container.
//    Its single argument is the layout manager to assign.
//    We will use contentPane's setLayout() method with a BorderLayout object like this:
    public void start() {
        frame = new JFrame ("Flow Layout");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane ( );
        contentPane.setLayout(new FlowLayout()); //This line has to follow the declaration of contentPane, so we'll add it as the fourth line of our start method.

        contentPane.add (new JButton ("First Button"));
        contentPane.add (new JButton ("Second Button - a long one"));
        contentPane.add (new JButton ("Third Button"));
        contentPane.add (new JButton ("Fourth Button"));

        frame.pack ( );
        frame.setVisible (true);
    }
}