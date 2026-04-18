
import javax.swing.JOptionPane;

//Crie um programa em Java utilizando a classe JOptionPane que faça o seguinte: 
//
//Encaminhe somente o link do GitHub!
//
//Solicite ao usuário que informe: 
//Login 
//Senha 
//O sistema deve verificar: 
//Login correto: admin 
//Senha correta: 1313 
//Se o login e a senha estiverem corretos: 
//Mostrar a mensagem: "Login realizado com sucesso!" 
//Caso contrário: 
//Mostrar a mensagem: "Login ou senha inválidos." 
//Utilize apenas caixas de diálogo (JOptionPane), não utilize System.out.println.

public class AtividadeMensagem {

    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "Bem vindo ao Doors ");
        
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Nome do usuário: "+nome);
        
        
    }
}
