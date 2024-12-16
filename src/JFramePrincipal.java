import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class JFramePrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txfResultado;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnCf,btnSumar,btnRestar,btnMultiplicar,btnDividir,btnBorrar, btnIgual;
	private int num1 = 0, num2 = 0;
	private int resultado = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePrincipal frame = new JFramePrincipal();
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
	public JFramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 587);
		setLocationRelativeTo(null);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn7.setBounds(10, 86, 100, 100);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn8.setBounds(120, 86, 100, 100);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn9.setBounds(232, 86, 100, 100);
		contentPane.add(btn9);
		
		btnMultiplicar = new JButton("X");
		btnMultiplicar.addActionListener(this);
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnMultiplicar.setBounds(342, 86, 100, 100);
		contentPane.add(btnMultiplicar);
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn4.setBounds(10, 197, 100, 100);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn5.setBounds(120, 197, 100, 100);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn6.setBounds(232, 197, 100, 100);
		contentPane.add(btn6);
		
		btnRestar = new JButton("-");
		btnRestar.addActionListener(this);
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnRestar.setBounds(342, 197, 100, 100);
		contentPane.add(btnRestar);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn1.setBounds(10, 308, 100, 100);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn2.setBounds(120, 308, 100, 100);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn3.setBounds(232, 308, 100, 100);
		contentPane.add(btn3);
		
		btnSumar = new JButton("+");
		btnSumar.addActionListener(this);
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnSumar.setBounds(342, 308, 100, 100);
		contentPane.add(btnSumar);
		
		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btn0.setBounds(10, 419, 100, 100);
		contentPane.add(btn0);
		
		btnBorrar = new JButton("<-");
		btnBorrar.addActionListener(this);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBorrar.setBounds(120, 419, 100, 100);
		contentPane.add(btnBorrar);
		
		btnCf = new JButton("CF");
		btnCf.addActionListener(this);
		btnCf.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnCf.setBounds(232, 419, 100, 100);
		contentPane.add(btnCf);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(this);
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnIgual.setBounds(342, 419, 100, 100);
		contentPane.add(btnIgual);
		
		txfResultado = new JTextField();
		txfResultado.setFont(new Font("Tahoma", Font.PLAIN, 36));
		txfResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txfResultado.setBounds(10, 11, 432, 64);
		contentPane.add(txfResultado);
		txfResultado.setColumns(10);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			txfResultado.setText(txfResultado.getText()+"1");
		}else if(e.getSource() == btn2) {
			txfResultado.setText(txfResultado.getText()+"2");
		}else if(e.getSource() == btn3) {
			txfResultado.setText(txfResultado.getText()+"3");
		}else if(e.getSource() == btn4) {
			txfResultado.setText(txfResultado.getText()+"4");
		}else if(e.getSource() == btn5) {
			txfResultado.setText(txfResultado.getText()+"5");
		}else if(e.getSource() == btn6) {
			txfResultado.setText(txfResultado.getText()+"6");
		}else if(e.getSource() == btn7) {
			txfResultado.setText(txfResultado.getText()+"7");
		}else if(e.getSource() == btn8) {
			txfResultado.setText(txfResultado.getText()+"8");
		}else if(e.getSource() == btn9) {
			txfResultado.setText(txfResultado.getText()+"9");
		}else if(e.getSource() == btn0) {
			txfResultado.setText(txfResultado.getText()+"0");
		}else if(e.getSource() == btnCf) { 
			txfResultado.setText("");
			resultado = 0;
			num1 = 0;
			num2 = 0;
		}else if(e.getSource() == btnBorrar) {
			txfResultado.setText(txfResultado.getText().substring(0, txfResultado.getText().length()-1));
		}else if(e.getSource() == btnSumar) {
			actualizarResultado(Integer.parseInt(txfResultado.getText()), "+");
			txfResultado.setText("");
		}else if(e.getSource() == btnRestar) {
			txfResultado.setText("");
		}else if(e.getSource() == btnMultiplicar) {
			txfResultado.setText("");
		}else if(e.getSource() == btnDividir) {
			txfResultado.setText("");
		}else if(e.getSource() == btnDividir) {
			txfResultado.setText("");
		}else if(e.getSource() == btnIgual) {
			num2 = Integer.parseInt(txfResultado.getText());

			txfResultado.setText(String.valueOf(resultado));
		}
		
		
	}
	
	public void actualizarResultado(int numeroActualizar, String operador) {
		switch (operador) {
		case "+": 
			resultado = resultado + numeroActualizar;
			break;
		case "=":
			break;
		default:
			break;

	
		}
	}
}
