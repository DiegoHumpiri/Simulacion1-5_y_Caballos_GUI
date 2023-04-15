package threads.caballos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Hipodromo {

	private JFrame frmCarreraDeCaballos;
	
	/*
	 * Hilos de cada caballo de la carrera
	 */
	JProgressBar progressBarTornado;	
	JProgressBar progressBarPegaso;
	JProgressBar progressBarSocrates;
	JProgressBar progressBarCaliostro;
	JTextArea textArea;
	
	Caballo caballoTornado; 
	Caballo caballoPegasus;
	Caballo caballoSocrates;
	Caballo caballoCaliostro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hipodromo window = new Hipodromo();
					window.frmCarreraDeCaballos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hipodromo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarreraDeCaballos = new JFrame();
		frmCarreraDeCaballos.setTitle("Carrera de Caballos");
		frmCarreraDeCaballos.setBounds(100, 100, 450, 600);
		frmCarreraDeCaballos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Tornado");
		
		JLabel lblNewLabel_1 = new JLabel("Pegasus");
		
		JLabel lblNewLabel_2 = new JLabel("Socrates");
		
		JLabel lblNewLabel_3 = new JLabel("Caliostro");
		
		JProgressBar progressBarTornado = new JProgressBar();
		
		JProgressBar progressBarPegaso = new JProgressBar();
		
		JProgressBar progressBarSocrates = new JProgressBar();
		
		JProgressBar progressBarCaliostro = new JProgressBar();
		

		
		JButton btnNewButton = new JButton("Empezar carrera");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				
				caballoTornado = new Caballo(progressBarTornado, textArea, "Tornado");
				caballoPegasus = new Caballo(progressBarPegaso, textArea, "Pegasus");
				caballoSocrates = new Caballo(progressBarSocrates, textArea, "Socrates");
				caballoCaliostro = new Caballo(progressBarCaliostro, textArea, "Caliostro");
				
				caballoTornado.start();
				caballoPegasus.start();
				caballoSocrates.start();
				caballoCaliostro.start();			
			}
		});
		
		this.progressBarTornado = progressBarTornado;	
		this.progressBarPegaso = progressBarPegaso;
		this.progressBarSocrates = progressBarSocrates;
		this.progressBarCaliostro = progressBarCaliostro;
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_4 = new JLabel("Hecho por: Diego Johann Humpiri Vargas <dhumpiriv@ulasalle.edu.pe>");
		GroupLayout groupLayout = new GroupLayout(frmCarreraDeCaballos.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBarPegaso, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addComponent(progressBarTornado, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addComponent(progressBarSocrates, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addComponent(progressBarCaliostro, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))
						.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(progressBarTornado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(progressBarPegaso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(progressBarSocrates, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(progressBarCaliostro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JTextArea textAreaSalida = new JTextArea();
		this.textArea = textAreaSalida;
		scrollPane.setViewportView(textAreaSalida);
		frmCarreraDeCaballos.getContentPane().setLayout(groupLayout);
	}
}
