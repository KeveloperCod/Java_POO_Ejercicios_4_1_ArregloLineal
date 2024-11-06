package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_05.ArreglosEdades;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;
	private JButton btnListar;
	private JButton btnGenerar;
	private JButton btnReportar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 417, 366);
		contentPane.add(scrollPane);
		
		txtReporte = new JTextArea();
		scrollPane.setViewportView(txtReporte);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(10, 36, 89, 23);
		contentPane.add(btnListar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(338, 36, 89, 23);
		contentPane.add(btnGenerar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(168, 36, 89, 23);
		contentPane.add(btnReportar);
	}
	
	ArreglosEdades ae = new ArreglosEdades();

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtReporte.setText("");
		for (int i = 0; i < ae.tamanio(); i++) {
		imprimir("[" + i + "]" + " :  " + ae.obtener(i));
		}
		
	}
	
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		imprimr();
		imprimir("La edad mayor es  :  "  + ae.edadMayor());
		imprimir("La edad menor es  :  "  + ae.edadMenor());
		imprimir("La edad promedio es  :  " + ae.edadPromedio());
		imprimir("Primera edad adolescente entre 12 a 20   :   " +ae.posPrimeraEdadAdolescente());
		imprimir("La cantidad de mayores de edad es  :  "  + ae.mayorEdad());
		imprimir("La cantidad de menores de edad es  :  "  + ae.menorEdad());
		imprimir("La suma de todas las edades son   :  "  + ae.sumaEdades());

		
	}
	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
	}
	
	void imprimr(){
		imprimir("");
	}
	
	void imprimir (String s){
		txtReporte.append(s +"\n");
	}
}
