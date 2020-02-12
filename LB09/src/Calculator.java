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
import java.awt.*;
import java.awt.event.*;
public class Calculator extends BasicCalculator
{
	
	//Attributes
	protected JButton pow, sqr, pct, log;
	
	//Constructors
	public Calculator()
	{
		super();
	}
	
	//Methods
	public void createUserInterface()
	{
		super.createUserInterface();
		
		pow = new JButton("pow");
		sqr = new JButton("sqr");
		pct = new JButton("pct");
		log = new JButton("log");
		
		p.add(pow);
		p.add(sqr);
		p.add(pct);
		p.add(log);
		
		pow.addActionListener(this);
		sqr.addActionListener(this);
		pct.addActionListener(this);
		log.addActionListener(this);
		
		//set yellow for input mode (elsewhere set green for output mode)
		show.setBackground(Color.yellow);
		
		//another one for equal button
		clr.setBackground(Color.red);
		
		//Choose one color for number keys including dot button
		b0.setBackground(Color.yellow);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.yellow);
		b5.setBackground(Color.yellow);
		b6.setBackground(Color.yellow);
		b7.setBackground(Color.yellow);
		b8.setBackground(Color.yellow);
		b9.setBackground(Color.yellow);
		bd.setBackground(Color.yellow);
		
		//Choose one color for binary operator
		add.setBackground(Color.cyan);
		sub.setBackground(Color.cyan);
		mul.setBackground(Color.cyan);
		div.setBackground(Color.cyan);
		mod.setBackground(Color.cyan);
		pow.setBackground(Color.cyan);
		
		//Choose one color for unary operator
		sqr.setBackground(Color.orange);
		pct.setBackground(Color.orange);
		log.setBackground(Color.orange);
		
		//Choose one color for equal
		com.setBackground(Color.WHITE);
		
		//For textfield, adjust text to right alighnment
		show.setHorizontalAlignment(show.RIGHT);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		show.setBackground(Color.yellow);
		super.actionPerformed(e);
		if (e.getSource() == pow)
		{
			operand1 = Double.parseDouble(show.getText());
			operator = '^';
			show.setText("");
		}
		
		if (e.getSource() == sqr)
		{
			operand1 = Double.parseDouble(show.getText());
			show.setBackground(Color.green);
			show.setText(Double.toString(Math.sqrt(operand1)));
		}
		
		if (e.getSource() == pct)
		{
			operand1 = Double.parseDouble(show.getText());
			show.setBackground(Color.green);
			show.setText(Double.toString(operand1*100));
		}
		if (e.getSource() == log)
		{
			operand1 = Double.parseDouble(show.getText());
			show.setBackground(Color.green);
			show.setText(Double.toString(Math.log(operand1)));
		}
	}
	
	public void calculate()
	{
		show.setBackground(Color.green);
		super.calculate();
		if (operator == '^')
		{
			show.setText(Double.toString(Math.pow(operand1, operand2)));
		}
	}
	
}