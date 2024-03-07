package vista;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.funciones.*;
import modelo.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Options extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Options;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("rawtypes")
	public Options() {
		@SuppressWarnings("unused")
		String Item;
		
		setTitle(Variables.titulo);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Options.class.getResource(Variables.logo)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(Variables.cordX, Variables.cordY, Variables.resolucionX, Variables.resolucionY);
		Options = new JPanel();
		Options.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Options);
		Options.setLayout(new BorderLayout(0, 0));
		
		 setResizable(false);
		
		
		JLabel lblTitulo = new JLabel("Options");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Options.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel Margenes = new JPanel();
		Options.add(Margenes, BorderLayout.CENTER);
		Margenes.setLayout(new BorderLayout(0, 0));
		
		JPanel Resolucion = new JPanel();
		Margenes.add(Resolucion, BorderLayout.WEST);
		Resolucion.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel ElejirResolucion = new JPanel();
		Resolucion.add(ElejirResolucion);
		
		JLabel lblResolucion = new JLabel("Resolution:");
		ElejirResolucion.add(lblResolucion);
		
		@SuppressWarnings("unchecked")
		JComboBox comboBoxResolucion = new JComboBox(Variables.resolucionOpcion);
		ElejirResolucion.add(comboBoxResolucion);
		comboBoxResolucion.setPreferredSize(new Dimension(100, 30));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		Resolucion.add(chckbxNewCheckBox_4);
		
		JPanel panel = new JPanel();
		Margenes.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indiceSeleccionado = comboBoxResolucion.getSelectedIndex();
                Variables.indice = indiceSeleccionado;
				FuncionesOptions.Resolucion();
				
				FuncionesPantallas.cordenadas(getBounds());
				
				FuncionesPantallas.abrirMenuPrincipal();
				dispose();
			}
		});
		panel.add(btnApply);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncionesPantallas.cordenadas(getBounds());
				
				FuncionesPantallas.abrirMenuPrincipal();
				dispose();
			}
		});
		panel.add(btnCancel);
	}
}

