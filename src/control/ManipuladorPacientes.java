/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.ErroCadastroException;
import model.Paciente;
import DAO.PacienteDAO;
import java.util.ArrayList;


public class ManipuladorPacientes {
    private final ArrayList<Paciente> listaPacientes;
    private final PacienteDAO pacienteDao = new PacienteDAO();
   
    public ManipuladorPacientes() 
    {
        
        listaPacientes = pacienteDao.buscarPaciente();
        
    }
     
     

    
    public ArrayList<Paciente> getListaPacientes() 
    {
        if (listaPacientes.isEmpty()) {
            return null;
        } else {
            
            return listaPacientes;
        }
    }

    public void cadastra(Paciente paciente) throws ErroCadastroException 
    {
        for (Paciente pacienteNaLista :listaPacientes){ 
            if (pacienteNaLista.getNome().equals(paciente.getNome())) 
            {
                throw new ErroCadastroException("Já existe um paciente com o "
                        + "mesmo nome cadastrado no sistema.");
            }else if (pacienteNaLista.getCpf()== (paciente.getCpf())) {
                throw new ErroCadastroException("Já existe um paciente com o "
                        + "mesmo CPF cadastrado no sistema.");
            }else if (pacienteNaLista.getTelefone()==(paciente.getTelefone())) {
                throw new ErroCadastroException("Já existe um paciente com o "
                        + "mesmo telefone cadastrado no sistema.");
                
                
            }
        }
         pacienteDao.inserirPaciente(paciente);
}

    
    public void edita(int cpf, Paciente paciente) throws ErroCadastroException {
    	
        
        if (listaPacientes.isEmpty()) {
            throw new ErroCadastroException("Não há pacientes cadastrados no "
                    + "sistema.");
        } else {
        	
            for (Paciente pacienteNaLista : listaPacientes) {
                    if (pacienteNaLista.getNome().equals(paciente.getNome())) {
                        throw new ErroCadastroException("Já existe um paciente "
                                + "com o mesmo nome cadastrado no sistema.");
                    } else if (pacienteNaLista.getCpf()==(paciente.getCpf())) {
                        throw new ErroCadastroException("Já existe um paciente "
                                + "com o mesmo CPF cadastrado no sistema.");
                    } else if (pacienteNaLista.getTelefone()==(paciente.getTelefone())) {
                        throw new ErroCadastroException("Já existe um paciente "
                                + "com o mesmo telefone cadastrado no sistema.");
                    } 
                }
            
            pacienteDao.editarPacientePeloCpf(paciente, cpf);
        }
    }
    
    public void remove(int cpf, Paciente paciente) throws ErroCadastroException {
        boolean pacienteExisteNaLista = false;
        
        if (listaPacientes.isEmpty()) {
            throw new ErroCadastroException("Não há pacientes cadastrados no "
                    + "sistema.");
        } else {
        	
            for (Paciente pacienteNaLista : listaPacientes) {
                if (pacienteNaLista.getCpf() == paciente.getCpf()) {
                    pacienteDao.deleteUsuarioPeloCpf(paciente);
                    pacienteExisteNaLista = true;
                }
            }
            if (!pacienteExisteNaLista) {
                throw new ErroCadastroException("Este paciente não está "
                        + "cadastrado no sistema.");
            }
        }
    }
    
    
    public Paciente buscaPorCpf(int cpf) {
    	
        if (listaPacientes.isEmpty()) {
            
            return null;
        } else {
            for (Paciente pacienteNaLista : listaPacientes) {
                
                if (pacienteNaLista.getCpf() == cpf) {
                    return pacienteNaLista;         
                }
            }
            
            return null; 
        }
    }
}
