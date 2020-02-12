/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class BetterCalculator extends Calculator
{
	//Attributes
	protected JButton undo;
	protected ArrayList<Status> states;
	
	//Constructors
	public BetterCalculator()
	{
		clean();
		states = new ArrayList<Status>();
	}
	
	//Methods
	public void createUserInterface()
	{
		super.createUserInterface();
		undo = new JButton("Undo");
		p.add(undo);
		undo.addActionListener(this);
		undo.setBackground(Color.MAGENTA);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == undo)
		{
			Status s;
			s = states.get(states.size() - 1);

			operand1 = s.geto1();
			operand2 = s.geto2();
			operator = s.geto();
			show.setBackground(s.getc());
			show.setText(s.gett());

			states.remove(states.size() - 1);
			
		}
		else
		{
			Status s;
			s = new Status(operand1, operand2, operator, show.getBackground(), show.getText());
			states.add(s);
			super.actionPerformed(e);
		}
	}
}