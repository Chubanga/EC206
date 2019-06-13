
package control;

import DAO.LoginDAO;

import java.util.ArrayList;
import model.Login;
import exception.ErroCadastroException;

public class ManipuladorLogin {
    private final LoginDAO loginDao = new LoginDAO();
    private final ArrayList<Login> listaLogin;
    
    public ManipuladorLogin() {
        listaLogin = loginDao.buscarLogin();
 
    }
    
    public ArrayList<Login> getListaClientes() {
        if (listaLogin.isEmpty()) {
            return null;
        } else {
            return listaLogin;
        }
    }
    public void cadastra(Login login) throws ErroCadastroException {
      
        loginDao.inserirLogin(login);
    }
    
    public Login buscaPorSenha(int senha) {
        if (listaLogin.isEmpty()) {
            return null;
        } else {
            for (Login loginNaLista : listaLogin) {
                if (loginNaLista.getSenha() == senha) {
                    return loginNaLista; 
                }
            }
            return null; 
        }
    }
    

    
}
