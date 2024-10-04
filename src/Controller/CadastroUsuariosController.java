package Controller;

import Model.CadastroUsuarioModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroUsuariosController {

    public void criarUsuariosController(String username, String email, String login, String password, String perfil) {

        Boolean sucesso;
        CadastroUsuarioModel novoUsuario = new CadastroUsuarioModel(username,
                email, perfil, login, password);
        sucesso = novoUsuario.enviarDadosDbDAL(novoUsuario);

        if (sucesso) {
            String mensagem = "Registro realizado com sucesso!";
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            String mensagem = "Falha ao realizar o registro no banco de dados!";
            JOptionPane.showMessageDialog(null, mensagem);
        }

    }

    public void ResetarSenhaController(String ID_USER, String password) {
        CadastroUsuarioModel atualizarSenha = new CadastroUsuarioModel(ID_USER, null, null, null, password, null);
        atualizarSenha.ResetarSenhaModel(atualizarSenha);
    }

    public ArrayList<CadastroUsuarioModel> listarUsuarios() {
        CadastroUsuarioModel listaUsuarios = new CadastroUsuarioModel();
        return listaUsuarios.listarDadosBanco();
    }

    public ArrayList<CadastroUsuarioModel> filtrarUsuarios(String nome) {
        CadastroUsuarioModel listaUsuarios = new CadastroUsuarioModel();
        return listaUsuarios.filtrarDadosBanco(nome);
    }

    // Método que envia a informação do id_user para o model
    public void deletarUsuariosController(String id_user) {
        CadastroUsuarioModel op = new CadastroUsuarioModel();
        op.excluirRegistroBDModel(id_user);
    }

    public void atualizarUsuariosController(String id_user, String usename, String email, String login, String perfil) {
        CadastroUsuarioModel usuarioAtualizado = new CadastroUsuarioModel(id_user, usename, email, login, null, perfil);
        usuarioAtualizado.atualizarRegistroBDModel(usuarioAtualizado);

    }
    
    
    
    public ArrayList<CadastroUsuarioModel> recuperarDadosUsuarioController(String id_user) {
        CadastroUsuarioModel listaUsuarios = new CadastroUsuarioModel();
        return listaUsuarios.recuperarDadosUsuarioModel(id_user);
    }

}
