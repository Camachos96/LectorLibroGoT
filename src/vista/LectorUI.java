package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

public class LectorUI extends JFrame {

	private JPanel contentPane;
	protected JButton BtnRetroceder;
	protected JButton Marcador;
	protected JButton btnIrAlMarcapginas;
	protected JButton BtnAvanzar;
	protected JLabel lblPagina;
	protected JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public LectorUI() {
		setTitle("Lector V1");
		setMaximumSize(new Dimension(32767, 32767));
		setMinimumSize(new Dimension(10, 10));
		setPreferredSize(new Dimension(10, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 371, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(245, 245, 245));
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(textArea, BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		BtnRetroceder = new JButton("<<");
		panel.add(BtnRetroceder);
		
		Marcador = new JButton("Marca");
		panel.add(Marcador);
		
		btnIrAlMarcapginas = new JButton("Ir al marcador");
		panel.add(btnIrAlMarcapginas);
		
		BtnAvanzar = new JButton(">>");
		panel.add(BtnAvanzar);
		
		lblPagina = new JLabel("");
		panel.add(lblPagina);
		
	}


}
