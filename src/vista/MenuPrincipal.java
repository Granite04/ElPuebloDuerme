package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Control.funciones.*;
import modelo.Variables;

public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel principal;
    private JLabel lblWest;
   

    @SuppressWarnings("serial")
    public MenuPrincipal() {
 
        setTitle(Variables.titulo);
        setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource(Variables.logo)));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(Variables.cordX, Variables.cordY, Variables.resolucionX, Variables.resolucionY);

        // Desactivar la capacidad de cambiar el tamaño de la ventana
        setResizable(false);

        principal = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon background = new ImageIcon(MenuPrincipal.class.getResource("/modelo/img/pantallas/paginaPrincipal(1200x750).jpg"));
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        principal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(principal);
        principal.setLayout(new BorderLayout(0, 0));

        JLabel lblTitulo = new JLabel("Pueblo Duerme");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setFont(new Font("Ink Free", Font.BOLD, 40));
        principal.add(lblTitulo, BorderLayout.NORTH);

        JPanel Menu = new JPanel();
        principal.add(Menu, BorderLayout.SOUTH);
        Menu.setLayout(new BorderLayout(0, 0));
        Menu.setOpaque(false); // Hace que el panel sea transparente

        JLabel lblSouth = new JLabel(" ");
        Menu.add(lblSouth, BorderLayout.SOUTH);

        JLabel lblEast = new JLabel("                                                                                 ");
        Menu.add(lblEast, BorderLayout.EAST);

        lblWest = new JLabel("                                                                                ");
        lblWest.setOpaque(false); // Hace que el label sea transparente
        Menu.add(lblWest, BorderLayout.WEST);

        JPanel panel = new JPanel();
        Menu.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(0, 1, 0, 10)); // Ajusta el último parámetro para cambiar la separación entre los componentes
        panel.setOpaque(false); // Hace que el panel sea transparente

        JButton btnPlay = new JButton("Play");
        btnPlay.setPreferredSize(new Dimension(150, 40)); // Ajusta el tamaño del botón
        panel.add(btnPlay);

        JButton btnOptions = new JButton("Options");
        btnOptions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FuncionesPantallas.cordenadas(getBounds());
            	
            	FuncionesPantallas.abrirOptions();
            	dispose();
            }
        });
        btnOptions.setPreferredSize(new Dimension(150, 40)); // Ajusta el tamaño del botón
        panel.add(btnOptions);

        JButton bntExit = new JButton("Exit");
        bntExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bntExit.setPreferredSize(new Dimension(150, 40)); // Ajusta el tamaño del botón
        panel.add(bntExit);
    }
}
