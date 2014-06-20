package dhbw.horb.projekte.programmieren.farbenproblem.gui;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Ober {
	public String inputString=null;

	private JFrame frmfarbenproblem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ober window = new Ober();
					window.frmfarbenproblem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ober() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmfarbenproblem = new JFrame();
		frmfarbenproblem.setTitle("4Farben-Problem");
		frmfarbenproblem.setBounds(100, 100, 450, 300);
		frmfarbenproblem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frmfarbenproblem.setJMenuBar(menuBar);

		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);

		JMenuItem mntmNeuesFeld = new JMenuItem("Neues Feld");
		mnDatei.add(mntmNeuesFeld);
		mntmNeuesFeld.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				inputString = JOptionPane.showInputDialog(null, "Feldgröße (Default 4)",
						"Neues Feld", 1);
				
				int[] x={10,200,200,10};
				int[] y={10,10,200,200};
				frmfarbenproblem.getContentPane().add(new MyField(x,y));
				frmfarbenproblem.setVisible(true);
			}
		});

		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnDatei.add(mntmBeenden);
		mntmBeenden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
	}

}

class MyField extends JComponent {
	private int[] x;
	private int[] y;
	private int[] x1;
	private int[] y1;
	public MyField(int[] x,int[] y){
	    this.x = x;
	    this.y = y;
	    this.x1 = x;
	    this.y1 = y;
		
	}
	  public void paint(Graphics g) {
	
	    g.setColor(Color.yellow);
	    g.fillPolygon (x, y, x.length);  

	    g.setColor(Color.black);
	    g.drawPolygon (x1, y1, x1.length); 
	  }
	}
