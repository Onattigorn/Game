import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContentScreen implements ActionListener
{
	
	JPanel titlePanel, healthPanel, buttonPanel;
    JLabel blueLabel, redLabel, blueHealth, redHealth;
    JButton pAttackButton, mAttackButton, runButton;
	
	public JPanel createContentScreen(GoodHero one, EnemyHero two)
	{
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(250, 30);
        totalGUI.add(titlePanel);

        JLabel blueLabel = new JLabel(one.getName());
        blueLabel.setLocation(0, 0);
        blueLabel.setSize(100, 30);
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        JLabel redLabel = new JLabel(two.getName());
        redLabel.setLocation(120, 0);
        redLabel.setSize(100, 30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        JPanel healthPanel = new JPanel();
        healthPanel.setLayout(null);
        healthPanel.setLocation(10, 40);
        healthPanel.setSize(250, 30);
        totalGUI.add(healthPanel);

        JLabel blueHealth = new JLabel(" " + one.getHealth());
        blueHealth.setLocation(0, 0);
        blueHealth.setSize(100, 30);
        blueHealth.setHorizontalAlignment(0);
        healthPanel.add(blueHealth);

        JLabel redHealth = new JLabel(" " + two.getHealth());
        redHealth.setLocation(120, 0);
        redHealth.setSize(100, 30);
        redHealth.setHorizontalAlignment(0);
        healthPanel.add(redHealth);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);

        JButton pAttackButton = new JButton("Physical Attack");
        pAttackButton.setLocation(0, 0);
        pAttackButton.setSize(100, 30);
        pAttackButton.addActionListener(this);
        buttonPanel.add(pAttackButton);

        JButton mAttackButton = new JButton("Magic Attack");
        mAttackButton.setLocation(120, 0);
        mAttackButton.setSize(100, 30);
        mAttackButton.addActionListener(this);
        buttonPanel.add(mAttackButton);

        JButton runButton = new JButton("Run");
        runButton.setLocation(0, 40);
        runButton.setSize(220, 30);
        runButton.addActionListener(this);
        buttonPanel.add(runButton); 
        
        totalGUI.setOpaque(true);
        return totalGUI;
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
        if(e.getSource() == pAttackButton)
        {
            
        }
        else if(e.getSource() == mAttackButton)
        {
            
        }
        else if(e.getSource() == runButton)
        {
        	
        }
    }
	
	static void createAndShowGUI(GoodHero one, EnemyHero two) 
	{
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Combat!");

        ContentScreen GameGui = new ContentScreen();
        frame.setContentPane(GameGui.createContentScreen(one, two));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 190);
        frame.setVisible(true);
    }
	
}
