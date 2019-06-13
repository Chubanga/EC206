
package main;

import view.TelaLogin;
import view.PrimeiraTelaLogin;
import DAO.LoginDAO;
import java.util.ArrayList;
import model.Login;
import control.ManipuladorLogin;
    
public class Main {
    
    public static void main(String[] args) {
        final ArrayList<Login> listaLogin;
        final LoginDAO loginDao = new LoginDAO();
        listaLogin = loginDao.buscarLogin();
        if(listaLogin.isEmpty()){
            PrimeiraTelaLogin Tlogin = new PrimeiraTelaLogin();
                    Tlogin.setLocationRelativeTo(null);
                    Tlogin.setVisible(true);
        }else{
            TelaLogin login = new TelaLogin();
                    login.setLocationRelativeTo(null);
                    login.setVisible(true);
        }
   
    }
        
        
    
}

 
