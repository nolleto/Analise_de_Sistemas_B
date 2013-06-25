import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Layout extends JFrame {
		JLabel label = new JLabel("Emitir salário", JLabel.CENTER);
		JButton button1 = new JButton("Gerente");
		JButton button2 = new JButton("Estagiario");
		
		Funcionario gerente = new Funcionario() {
			
			@Override
			float salario() {
				return 2000;
			}
			
			@Override
			String nome() {
				return "Gerente";
			}
		};
		
		Funcionario estagiario = new Funcionario() {
			
			@Override
			float salario() {
				return 600;
			}
			
			@Override
			String nome() {
				return "Estagiário";
			}
		};
		
		public Layout(){
			
			button1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarMensagem(gerente.emitirSalario());
				}
			});
			
			button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarMensagem(estagiario.emitirSalario());
				}
			});
			
			Container pane = this.getContentPane(); //captura o painel do JFrame
			pane.setName("Emitir salario");
			pane.setLayout(new FlowLayout(FlowLayout.CENTER)); //define o layout
			
			pane.add(label);
			pane.add(button1);
			pane.add(button2);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(300, 150);
			this.setVisible(true);
		}
	
	public static void main(String[] args){
		Layout janela = new Layout();
		
	}
	
	public void mostrarMensagem(String msg) {
		JOptionPane pane2 = new JOptionPane();
		pane2.showMessageDialog(this, msg);
		
	}
}