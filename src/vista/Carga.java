package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Variables;

public class Carga extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Carga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(Variables.cordX, Variables.cordY, Variables.resolucionX, Variables.resolucionY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
