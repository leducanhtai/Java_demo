package MyColorView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MyColorController.MyColorController;
import MyColorModel.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel myCorlorModel;
	private JButton jbutton_text_red;
	private JButton jbutton_text_yellow;
	private JButton jbutton_text_green;
	private JButton jbutton_backGround_red;
	private JButton jbutton_backGround_yellow;
	private JButton jbutton_backGround_green;
	private JLabel jlabel_text;
	
	MyColorController myColorController = new MyColorController(this);
	Font font = new Font("Arial", Font.BOLD, 30);
	Font font_text = new Font("Arial", Font.BOLD, 60);
	
	public MyColorView() {
		this.myCorlorModel = new MyColorModel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("My Color");
		this.setSize(1200, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.jbutton_text_red = new JButton("RED TEXT");
		jbutton_text_red.setFont(font);
		jbutton_text_red.setForeground(Color.RED);
		jbutton_text_red.addActionListener(myColorController);
		
		this.jbutton_text_yellow = new JButton("YELLOW TEXT");
		jbutton_text_yellow.setFont(font);
		jbutton_text_yellow.setForeground(Color.YELLOW);
		jbutton_text_yellow.addActionListener(myColorController);
		
		this.jbutton_text_green = new JButton("GREEN TEXT");
		jbutton_text_green.setFont(font);
		jbutton_text_green.setForeground(Color.GREEN);
		jbutton_text_green.addActionListener(myColorController);
		
		this.jbutton_backGround_red = new JButton("RED BACKGROUND");
		jbutton_backGround_red.setFont(font);
		jbutton_backGround_red.setBackground(Color.RED);
		jbutton_backGround_red.addActionListener(myColorController);
		
		this.jbutton_backGround_yellow = new JButton("YELLOW BACKGROUND");
		jbutton_backGround_yellow.setFont(font);
		jbutton_backGround_yellow.setBackground(Color.YELLOW);
		jbutton_backGround_yellow.addActionListener(myColorController);
		
		this.jbutton_backGround_green = new JButton("GREEN BACKGROUND");
		jbutton_backGround_green.setFont(font);
		jbutton_backGround_green.setBackground(Color.GREEN);
		jbutton_backGround_green.addActionListener(myColorController);
		
		this.jlabel_text = new JLabel("TEXT.........");
		jlabel_text.setFont(font_text);
		
		JPanel jpanel_text = new JPanel();
		jpanel_text.setLayout(new BorderLayout());
		jpanel_text.add(jlabel_text, BorderLayout.CENTER);
		
		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(2, 3));
		jpanel_button.add(jbutton_text_red);
		jpanel_button.add(jbutton_text_yellow);
		jpanel_button.add(jbutton_text_green);
		jpanel_button.add(jbutton_backGround_red);
		jpanel_button.add(jbutton_backGround_yellow);
		jpanel_button.add(jbutton_backGround_green);
		
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_text, BorderLayout.NORTH);
		this.add(jpanel_button, BorderLayout.CENTER);
	}
	public void changeTextColor(Color color) {
		this.jlabel_text.setForeground(color);
	}
	public void changeBackGroundColor(Color color) {
		this.jlabel_text.setBackground(color);
		this.jlabel_text.setOpaque(true);
	}


}
