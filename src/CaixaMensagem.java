
import javax.swing.JOptionPane;



public class CaixaMensagem {

    public static void main(String[] args) {

        //showMessage saída de dados
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
        
        //showConfirmDialog
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        
        if (resposta == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "Saindo do sistema.");
            
        }else{
            JOptionPane.showMessageDialog(null, "Permanecendo no sistema.");
        }
        
        //showImputDialog
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Nome do usuário: "+nome);
        
        //showOptionDialog
        String[] opcoes = {"Sim", "Não"};
        
        int escolha = JOptionPane.showOptionDialog(
        null,                                       //Sempre null
        "Continuar?",                               //Mensagem para o usuario
        "Escolha opções",                           //Titulo da caixa
        JOptionPane.DEFAULT_OPTION,                 //Botões desabilitados
        JOptionPane.QUESTION_MESSAGE,               //Tipo de icone
        null,                                       //Sempre nulo
        opcoes,                                     //Vetor
        opcoes[0]);                                 //Início do Vetor
        
        //showImputDialog List-object
        Object[] itens = {"Teclado", "Mouse", "Monitor"};
        
        Object opcaoEscolhida = JOptionPane.showInputDialog(
                null,
                "Escolha um item: ",
                "Lista de opções",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                itens,
                itens[0]);
        
    }
}
