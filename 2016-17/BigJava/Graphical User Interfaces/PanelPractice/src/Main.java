import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JTextField;

import javax.swing.JButton;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// display will show the numbers
		JTextField display = new JTextField();
		contentPane.add(display, BorderLayout.NORTH);
		
		// calcPanel will hold the calculator buttons
		JPanel calcPanel = new JPanel();
		calcPanel.setBorder(new TitledBorder(new EtchedBorder(), "Buttons"));
		contentPane.add(calcPanel, BorderLayout.CENTER);
		// make grid for all buttons
		calcPanel.setLayout(new GridLayout(4,4));
		
		// create all the buttons to populate the calcPanel
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		
		JButton bEquals = new JButton("=");
		JButton bPlus = new JButton("+");
		JButton bMinus = new JButton("-");
		JButton bTimes = new JButton("•");
		JButton bDivide = new JButton("÷");
		JButton bClear = new JButton("CE");
		
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		
		bPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "+");
			}
		});
		bMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "-");
			}
		});
		bTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "*");
			}
		});
		bDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "/");
			}
		});
		
		bClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		
		
		bEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: do math stuff
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				String infix = display.getText();
				String answer;
				try {
					answer = engine.eval(infix).toString();
				} catch(ScriptException x) {
					answer = "Error";
				}
				display.setText(answer);
			}
		});
		
		calcPanel.add(b7);
		calcPanel.add(b8);
		calcPanel.add(b9);
		calcPanel.add(bPlus);
		calcPanel.add(b4);
		calcPanel.add(b5);
		calcPanel.add(b6);
		calcPanel.add(bMinus);
		calcPanel.add(b1);
		calcPanel.add(b2);
		calcPanel.add(b3);
		calcPanel.add(bTimes);
		calcPanel.add(bClear);
		calcPanel.add(b0);
		calcPanel.add(bEquals);
		calcPanel.add(bDivide);

		
		
	}

}
