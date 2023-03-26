package me.alien.computer.emulator;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Arrays;

import static me.alien.computer.emulator.Instructions.*;

public class Main extends JPanel {
    JFrame frame;

    // Registers
    float ARegister = 0x0;
    float BRegister = 0x0;
    float CRegister = 0x0;

    // The instruction counter
    int InstructionCounter = 0x0;

    // Memory
    float[] Memory = new float[128];

    // Instructions List
    Instructions[] Instructions = new Instructions[64];

    // Timer for the display to run at about 30 fps
    Timer t = new Timer(1000/30, (a) -> repaint());

    // Main methods for making the window and handling the window

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        frame = new JFrame("Computer Emulator");

        frame.setSize(400, 600);
        frame.add(this);

        Arrays.fill(Instructions, NOP);

        File program = new File(System.getProperty("user.dir"));
        if(program.exists()){
            try {
                InputStream in = new FileInputStream(program);
                int inData = 0;
                int i = 0;
                while((inData = in.read()) >= 0){
                    Instructions[i] = fromInt(inData);
                    i++;
                }
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Draws the 2 previous and the next 2 and the current instruction
        if(InstructionCounter-2 >= 0) {
            g2d.drawString(InstructionCounter+" : "+Instructions[InstructionCounter].toString(),10,20);
        }
        if(InstructionCounter-1 >= 0) {
            g2d.drawString(InstructionCounter+" : "+Instructions[InstructionCounter].toString(),10,35);
        }
        g2d.drawString(InstructionCounter+" : "+Instructions[InstructionCounter].toString(),10,50);
        if(InstructionCounter+1 <= Instructions.length) {
            g2d.drawString(InstructionCounter+" : "+Instructions[InstructionCounter].toString(),10,20);
        }
        if(InstructionCounter+2 <= Instructions.length) {
            g2d.drawString(InstructionCounter+" : "+Instructions[InstructionCounter].toString(),10,35);
        }
    }
}
