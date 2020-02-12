/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

import java.awt.event.*;
import javax.swing.*;
public class BasicCalculator implements ActionListener
{
	//Attributes
	protected double operand1, operand2;
	protected char operator;
	protected JTextField show;
	protected JFrame w;
	protected JPanel p;
	protected JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bd;
	protected JButton add, sub, mul, div, mod, com, clr;
	
	//Constructors
	public BasicCalculator()
	{
		clean();
	}
	
	//Methods
	public void createUserInterface()
	{
		w = new JFrame("Tyler Nelson's Calculator");
		p = new JPanel();
		show = new JTextField(20);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bd = new JButton(".");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		mod = new JButton("%");
		com = new JButton("=");
		clr = new JButton("C");
		p.add(show);
		p.add(clr);
		p.add(b1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(bd);
		p.add(com);
		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(mod);
		w.getContentPane().add(p);
		w.setSize(400, 400);
		w.setVisible(true);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bd.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		com.addActionListener(this);
		clr.addActionListener(this);
	}
	public void clean()
	{
		operand1 = 0;
		operand2 = 0;
		operator = ' ';
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b0)
		{
			show.setText(show.getText() + "0");
		}
		if (e.getSource() == b1)
		{
			show.setText(show.getText() + "1");
		}
		if (e.getSource() == b2)
		{
			show.setText(show.getText() + "2");
		}
		if (e.getSource() == b3)
		{
			show.setText(show.getText() + "3");
		}
		if (e.getSource() == b4)
		{
			show.setText(show.getText() + "4");
		}
		if (e.getSource() == b5)
		{
			show.setText(show.getText() + "5");
		}
		if (e.getSource() == b6)
		{
			show.setText(show.getText() + "6");
		}
		if (e.getSource() == b7)
		{
			show.setText(show.getText() + "7");
		}
		if (e.getSource() == b8)
		{
			show.setText(show.getText() + "8");
		}
		if (e.getSource() == b9)
		{
			show.setText(show.getText() + "9");
		}
		if (e.getSource() == bd)
		{
			show.setText(show.getText() + ".");
		}
		if (e.getSource() == clr)
		{
			show.setText("");
			clean();
		}
		if (e.getSource() == add)
		{
			operand1 = Double.parseDouble(show.getText());
			operator = '+';
			show.setText("");
		}
		if (e.getSource() == sub)
		{
			if (show.getText().equals(""))
			{
				show.setText("-");
			}
			else
			{
				operand1 = Double.parseDouble(show.getText());
				operator = '-';
				show.setText("");
			}
		}
		if (e.getSource() == mul)
		{
			operand1 = Double.parseDouble(show.getText());
			operator = '*';
			show.setText("");
		}
		if (e.getSource() == div)
		{
			operand1 = Double.parseDouble(show.getText());
			operator = '/';
			show.setText("");
		}
		if (e.getSource() == mod)
		{
			operand1 = Double.parseDouble(show.getText());
			operator = '%';
			show.setText("");
		}
		if (e.getSource() == com)
		{
			operand2 = Double.parseDouble(show.getText());
			calculate();
		}
	}
	public void calculate()
	{
		switch(operator)
		{
			case '+': show.setText(Double.toString(operand1 + operand2)); break;
			case '-': show.setText(Double.toString(operand1 - operand2)); break;
			case '*': show.setText(Double.toString(operand1 * operand2)); break;
			case '/': show.setText(Double.toString(operand1 / operand2)); break;
			case '%': show.setText(Double.toString(operand1 % operand2)); break;
		}
	}
}