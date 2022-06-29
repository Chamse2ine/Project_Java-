package projet.java.fr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiSwing extends JPanel {

	final private JFrame fenetrePrincipale;
	final private JLabel nomTxt = new JLabel("Nom : ");
	{
		nomTxt.setHorizontalAlignment(JLabel.RIGHT);
	}
	
	JTextField nom = new JTextField(25);
	JTextField nom1 = new JTextField(25);
	JTextField nom2 = new JTextField(25);
	JLabel aff = new JLabel(" "); 
	
	final private JLabel txtval1 = new JLabel("Valeur de l'indice (K)");
	final private JLabel txtval2 = new JLabel("Valeur de alpha (A)");
	final private JLabel txtval3 = new JLabel("Valeur de epsilon (E)");
	
	final private JButton bCreuse = new JButton("Creuse (C)");
	final private JButton bPleine = new JButton("Pleine (P)");
	final private JButton bC = new JButton("+");
	final private JButton bQ = new JButton("+");
	final private JButton bD = new JButton("+");

	public GuiSwing(JFrame fenetre) {
		super();
		this.fenetrePrincipale = fenetre;
		this.setLayout(new BorderLayout());

		JPanel boutonsText = new JPanel(new FlowLayout());
		this.add(boutonsText, BorderLayout.NORTH);
		boutonsText.add(bCreuse);
		boutonsText.add(bPleine);
		
		JPanel centre = new JPanel(new GridLayout(3, 3));
		this.add(centre, BorderLayout.CENTER);
		centre.add(txtval1);
		centre.add(nom);
		centre.add(bC);
		centre.add(txtval2);
		centre.add(nom1);
		centre.add(bD);
		centre.add(txtval3);	
		centre.add(nom2);
		centre.add(bQ);
		
		
		

		JPanel bas = new JPanel( new GridLayout(1, 1));
		this.add(bas, BorderLayout.SOUTH);
		bas.add(aff);
		this.bQ.addActionListener(new ActionAdd1());
		this.bC.addActionListener(new ActionAdd2());
		this.bD.addActionListener(new ActionAdd3());
		this.bCreuse.addActionListener(new ActionAdd4());
		this.bPleine.addActionListener(new ActionAdd5());
	}

	
	public class ActionAdd1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			aff.setText(aff.getText()+" "+ nom.getText()+" -K");
		}
	}
	public class ActionAdd2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			aff.setText(aff.getText()+" "+ nom1.getText()+" -A");
		}
	}
	public class ActionAdd3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			aff.setText(aff.getText() +" "+ nom2.getText()+" -E ");
		}
	}
	public class ActionAdd4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			aff.setText(aff.getText() +" "+ "-C");
		}
	}
	public class ActionAdd5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			aff.setText(aff.getText() +" "+ "-P");
		}
	}
	public static JFrame newJFrame(String titre) {
		JFrame fenetre = new JFrame(titre);
		GuiSwing comprendre = new GuiSwing(fenetre);
		fenetre.getContentPane().add(comprendre);
		fenetre.pack();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return fenetre;
	}


	public static void exemple1() {
		JFrame frame1 = newJFrame("IHM pour CLI");
		frame1.setVisible(true);
			}

	public static void main(String[] args) {
		EventQueue.invokeLater(GuiSwing::exemple1);
	}

}