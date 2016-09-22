
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;



import java.awt.*;
import javax.swing.BoxLayout;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.Random;

public class SlotMachineGUI extends JFrame implements ActionListener
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public JPanel textPanel;
    private JLabel slot1;
    private JLabel slot2;
    private JLabel slot3;
    private JLabel snoopSpin;
    private JLabel creditsT;
    private JLabel creditsW;
    private JLabel creditsL;
    private JLabel winLose;
    private JLabel oddsThrow;
    public static int credits = 100;
    public static int creditsWon = 0;
    public static int creditsLost = 0;
    public static int oddsRow = 0;
    public static String addingCredits;
    private JTextField addCfield = new JTextField(10);
    
    private class AddCreditsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f = new JFrame("Add Credits"); 
            f.setSize(300, 100);
            
            JButton save = new JButton("Save");
            
            f.setLayout(new GridBagLayout());
            GridBagConstraints p = new GridBagConstraints();
            
            p.gridx = 0;
            p.gridy = 0;
            f.add(new Label("Credits: "), p);
            
            p.gridx = 1;
            p.gridy = 1;
            f.add(save, p);
            
            save.addActionListener(new SaveCreditsListener( ));
            
            p.gridx = 2;
            p.gridy = 1;
            f.add(new JButton("Cancel"), p);
            
            p.gridx = 1;
            p.gridy = 0;
            f.add(addCfield, p);
            f.setVisible(true);
        }
    } 

    private class AdjustOddsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame OddsF = new JFrame("Adjust Odds");
            OddsF.setSize(500,500);
            OddsF.setLayout(new GridBagLayout());
            GridBagConstraints b = new GridBagConstraints();
            try
            {
                if(oddsRow < 100)
                { 
                    throw new below0Exception();
                }
            }catch(below0Exception ex)
            {
               // oddsThrow.setText("below 100");
            }finally{
                b.gridx = 2;
                b.gridy = 0;
                OddsF.add(new Label("Slot 1"), b);

                b.gridx = 3;
                b.gridy = 0;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 0;
                OddsF.add(new Label("Slot 2"), b);

                b.gridx = 5;
                b.gridy = 0;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 0;
                OddsF.add(new Label("Slot 3"), b);

                b.gridx = 0;
                b.gridy = 2;
                OddsF.add(new Label("Cherry"), b);

                b.gridx = 1;
                b.gridy = 2;
                OddsF.add(new Label(" "), b);

                b.gridx = 2;
                b.gridy = 2;
                OddsF.add(new JTextField(5), b);

                b.gridx = 3;
                b.gridy = 2;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 2;
                OddsF.add(new JTextField(5), b);

                b.gridx = 5;
                b.gridy = 2;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 2;
                OddsF.add(new JTextField(5), b);

                b.gridx = 0;
                b.gridy = 3;
                OddsF.add(new Label(" "), b);

                b.gridx = 0;
                b.gridy = 4;
                OddsF.add(new Label("Bell"), b);

                b.gridx = 1;
                b.gridy = 4;
                OddsF.add(new Label(" "), b);

                b.gridx = 2;
                b.gridy = 4;
                OddsF.add(new JTextField(5), b);

                b.gridx = 3;
                b.gridy = 4;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 4;
                OddsF.add(new JTextField(5), b);

                b.gridx = 5;
                b.gridy = 4;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 4;
                OddsF.add(new JTextField(5), b);

                b.gridx = 0;
                b.gridy = 5;
                OddsF.add(new Label(" "), b);

                b.gridx = 0;
                b.gridy = 6;
                OddsF.add(new Label("Seven"), b);

                b.gridx = 1;
                b.gridy = 6;
                OddsF.add(new Label(" "), b);

                b.gridx = 2;
                b.gridy = 6;
                OddsF.add(new JTextField(5), b);

                b.gridx = 3;
                b.gridy = 6;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 6;
                OddsF.add(new JTextField(5), b);

                b.gridx = 5;
                b.gridy = 6;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 6;
                OddsF.add(new JTextField(5), b);

                b.gridx = 0;
                b.gridy = 7;
                OddsF.add(new Label(" "), b);

                b.gridx = 0;
                b.gridy = 8;
                OddsF.add(new Label("BAR"), b);

                b.gridx = 1;
                b.gridy = 8;
                OddsF.add(new Label(" "), b);

                b.gridx = 2;
                b.gridy = 8;
                OddsF.add(new JTextField(5), b);

                b.gridx = 3;
                b.gridy = 8;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 8;
                OddsF.add(new JTextField(5), b);

                b.gridx = 5;
                b.gridy = 8;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 8;
                OddsF.add(new JTextField(5), b);

                b.gridx = 0;
                b.gridy = 9;
                OddsF.add(new Label(" "), b);

                b.gridx = 0;
                b.gridy = 10;
                OddsF.add(new Label("Gold Nugget"), b);

                b.gridx = 1;
                b.gridy = 10;
                OddsF.add(new Label(" "), b);

                b.gridx = 2;
                b.gridy = 10;
                OddsF.add(new JTextField(5), b);

                b.gridx = 3;
                b.gridy = 10;
                OddsF.add(new Label(" "), b);

                b.gridx = 4;
                b.gridy = 10;
                OddsF.add(new JTextField(5), b);

                b.gridx = 5;
                b.gridy = 10;
                OddsF.add(new Label(" "), b);

                b.gridx = 6;
                b.gridy = 10;
                OddsF.add(new JTextField(5), b);

                b.gridx = 6;
                b.gridy = 11;
                OddsF.add(new Label(" "), b);

                b.fill = GridBagConstraints.HORIZONTAL;
                b.gridx = 6;
                b.gridy = 12;
                OddsF.add(new JButton("Save"), b);

                b.gridx = 7;
                b.gridy = 12;
                OddsF.add(new Label(" "), b);

                b.gridx = 8;
                b.gridy = 12;
                OddsF.add(new JButton("Cancel"), b);

                OddsF.setVisible(true);
            }
        } 
    }

    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            dispose();
        }
    } //End of BlueListener inner class
    
    private class AboutListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Frame AboutF = new JFrame("About");
            AboutF.setSize(300,300);
            AboutF.setLayout(new GridBagLayout());
            GridBagConstraints k = new GridBagConstraints();
            
            k.gridx = 1;
            k.gridy = 0;
            AboutF.add(new Label("KB"), k);
            
            k.gridx = 1;
            k.gridy = 1;
            AboutF.add(new Label("0799314"), k);
            
            k.gridx = 0;
            k.gridy = 2;
            AboutF.add(new Label(" "), k);
            
            k.gridx = 0;
            k.gridy = 3;
            AboutF.add(new Label("Symbol"), k);
            
            k.gridx = 2;
            k.gridy = 3;
            AboutF.add(new Label("Payout"), k);
            
            k.gridx = 0;
            k.gridy = 4;
            AboutF.add(new Label("Cherry"), k);
            
            k.gridx = 2;
            k.gridy = 4;
            AboutF.add(new Label("3 Credits"), k);
            
            k.gridx = 0;
            k.gridy = 5;
            AboutF.add(new Label("Bell"), k);
            
            k.gridx = 2;
            k.gridy = 5;
            AboutF.add(new Label("6 Credits"), k);
            
            k.gridx = 0;
            k.gridy = 6;
            AboutF.add(new Label("Seven"), k);
            
            k.gridx = 2;
            k.gridy = 6;
            AboutF.add(new Label("25 Credits"), k);
            
            k.gridx = 0;
            k.gridy = 7;
            AboutF.add(new Label("BAR"), k);
            
            k.gridx = 2;
            k.gridy = 7;
            AboutF.add(new Label("100 Credits"), k);
            
            k.gridx = 0;
            k.gridy = 8;
            AboutF.add(new Label("Gold Nugget"), k);
            
            k.gridx = 2;
            k.gridy = 8;
            AboutF.add(new Label("1000 Credits"), k);
            
            AboutF.setVisible(true);
        }
    }
    
    private class SaveCreditsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String text = addCfield.getText();
            credits = credits + Integer.parseInt(text);
            creditsT.setText("Total Credits: " +credits);
            
        }
    }

    public static void main(String[] args)
    {
        SlotMachineGUI gui;
        gui = new SlotMachineGUI(credits, addingCredits, creditsWon, creditsLost, oddsRow);
        gui.setVisible(true);
    }

    public SlotMachineGUI(int credits, String addingCredits, int creditsWon, int creditsLost, int oddsRow)
    {
        super("Slot Machine");
        
        ImageIcon cherry = new ImageIcon("cherries.jpg");
        ImageIcon bell = new ImageIcon("bell.jpg");
        ImageIcon seven = new ImageIcon("seven.jpg");
        ImageIcon snoopSwivel = new ImageIcon("snoopSping.gif");
        
        this.credits = credits;
        this.addingCredits = addingCredits;
        this.creditsWon = creditsWon;
        this.creditsLost = creditsLost;
        this.oddsRow = oddsRow;
        
        setSize(WIDTH, HEIGHT);
        
        slot1 = new JLabel("", cherry, JLabel.CENTER);
        slot2 = new JLabel("", bell, JLabel.CENTER);
        slot3 = new JLabel("", seven, JLabel.CENTER);
        snoopSpin = new JLabel("", snoopSwivel, JLabel.CENTER);
        creditsT = new JLabel("Total Credits: " +credits, JLabel.CENTER);
        creditsW = new JLabel("Credits Won: " +creditsWon);
        creditsL = new JLabel("Credits Lost: " +creditsLost);
        winLose = new JLabel("");
        
        JPanel spinPanel = new JPanel();
        spinPanel.setLayout(new GridBagLayout());
        
        setLayout(new GridBagLayout());
        GridBagConstraints m = new GridBagConstraints();
        
        m.gridx = 0;
        m.gridy = 0;
        
        m.gridx = 1;
        m.gridy = 0;
        add(slot1, m);
        
        m.gridx = 1;
        m.gridy = 1;
        add(creditsT, m);
        
        m.gridx = 1;
        m.gridy = 2;
        add(winLose, m);
            
        m.gridx = 2;
        m.gridy = 0;
        add(new Label(""), m);
        
        m.gridx = 3;
        m.gridy = 0;
        add(slot2, m);
        
        m.gridx = 3;
        m.gridy = 2;
        add(snoopSpin, m);
        
        m.gridx = 4;
        m.gridy = 0;
        add(new Label(""), m);
        
        m.gridx = 5;
        m.gridy = 0;
        add(slot3, m);
        
        m.gridx = 5;
        m.gridy = 1;
        add(creditsW, m);
        
        m.gridx = 5;
        m.gridy = 2;
        add(creditsL, m);
        
        m.gridx = 6;
        m.gridy = 0;
        add(new Label(""), m);
        
        // Buttons
        
        JButton spinButton = new JButton("Spin");
        m = new GridBagConstraints();
        final Insets buttonInsets = new Insets(50, 10, 50, 50);
        m.insets = buttonInsets;
        
        m.fill = GridBagConstraints.VERTICAL;
        m.ipady = 120;      //make this component tall
        m.weightx = 0.0;
        m.gridwidth = 7;
        m.gridx = 7;
        m.gridy = 0;
        
        spinPanel.add(spinButton, m);
        spinButton.addActionListener(this);
        add(spinButton, m);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem addCreditsChoice = new JMenuItem("Add Credits");
        addCreditsChoice.addActionListener(new AddCreditsListener( ));
        fileMenu.add(addCreditsChoice);

        JMenuItem adjustOddsChoice = new JMenuItem("Adjust Odds");
        adjustOddsChoice.addActionListener(new AdjustOddsListener( ));
        fileMenu.add(adjustOddsChoice);

        JMenuItem ExitChoice = new JMenuItem("Exit");
        ExitChoice.addActionListener(new ExitListener( ));
        fileMenu.add(ExitChoice);
        
        JMenuItem aboutChoice = new JMenuItem("About");
        aboutChoice.addActionListener(new AboutListener( ));
        helpMenu.add(aboutChoice);

        // Top bar main menu
        JMenuBar bar = new JMenuBar( );
        bar.add(fileMenu);
        bar.add(helpMenu);
        setJMenuBar(bar);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        ImageIcon cherry = new ImageIcon("cherries.jpg");
        ImageIcon bell = new ImageIcon("bell.jpg");
        ImageIcon seven = new ImageIcon("seven.jpg");
        ImageIcon barB = new ImageIcon("BAR.jpg");
        ImageIcon gold = new ImageIcon("gold.jpg");
        //ImageIcon snoopDogg = new ImageIcon("snoop.gif");
       
        //snoop.setIcon(snoopDogg);
        // Symbols
        
        Random rand = new Random();

        int slotSymbol1;
        slotSymbol1 = rand.nextInt(6);
        
        try
        {
            if(credits < 3)
            { 
             throw new below0Exception();
            }else{
                credits = credits - 3;
            }
        }catch(below0Exception ex)
        {
            winLose.setText("Add more Credits");
            
        }finally{

            if(slotSymbol1 == 0)
            {
                slot1.setIcon(cherry);
            }else if(slotSymbol1 == 1)
            {
                slot1.setIcon(bell);
            }else if(slotSymbol1 == 2)
            {
                slot1.setIcon(seven);
            }else if(slotSymbol1 == 3)
            {
                slot1.setIcon(barB);
            }else if(slotSymbol1 == 4)
            {
                slot1.setIcon(gold);
            }

            int slotSymbol2;
            slotSymbol2 = rand.nextInt(6);

            if(slotSymbol2 == 0)
            {
                slot2.setIcon(cherry);
            }else if(slotSymbol2 == 1)
            {
                slot2.setIcon(bell);
            }else if(slotSymbol2 == 2)
            {
                slot2.setIcon(seven);
            }else if(slotSymbol2 == 3)
            {
                slot2.setIcon(barB);
            }else if(slotSymbol2 == 4)
            {
                slot2.setIcon(gold);
            }

            int slotSymbol3;
            slotSymbol3 = rand.nextInt(6);

            if(slotSymbol3 == 0)
            {
                slot3.setIcon(cherry);
            }else if(slotSymbol3 == 1)
            {
                slot3.setIcon(bell);
            }else if(slotSymbol3 == 2)
            {
                slot3.setIcon(seven);
            }else if(slotSymbol3 == 3)
            {
                slot3.setIcon(barB);
            }else if(slotSymbol3 == 4)
            {
                slot3.setIcon(gold);
            }

            if(slotSymbol1 == slotSymbol2 && slotSymbol2 == slotSymbol3 && slotSymbol1 == slotSymbol3)
            {
                if(slotSymbol1 == 0)
                {
                    credits = credits + 3;
                    creditsWon = creditsWon + 3;
                }else if(slotSymbol1 == 1)
                {
                    credits = credits + 6;
                    creditsWon = creditsWon + 6;
                }else if(slotSymbol1 == 2)
                {
                    credits = credits + 25;
                    creditsWon = creditsWon + 25;
                }else if(slotSymbol1 == 3)
                {
                    credits = credits + 100;
                    creditsWon = creditsWon + 100;
                }else if(slotSymbol1 == 4)
                {
                    credits = credits + 1000;
                    creditsWon = creditsWon + 1000;
                }
            }
            
            creditsLost = creditsLost + 3;
            creditsT.setText("Total Credits: " +credits);
            creditsW.setText("Credits Won: " +creditsWon);
            creditsL.setText("Credits Lost: " +creditsLost);
        }
    }
    
    public class below0Exception extends Exception
    {
        public below0Exception()throws below0Exception
        {
            super();
        }
    }
    
    public class oddsException extends Exception
    {
        public oddsException()throws below0Exception
        {
            super();
        }
    }
    
}