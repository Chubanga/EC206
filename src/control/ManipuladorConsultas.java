/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.ErroCadastroException;
import model.Consulta;
import DAO.ConsultaDAO;
import java.util.ArrayList;


public class ManipuladorConsultas {

    private final ConsultaDAO consultaDao = new ConsultaDAO();
    private final ArrayList<Consulta> listaConsultas;

    public ManipuladorConsultas() {
        listaConsultas = consultaDao.buscarConsulta();
    }
    public ArrayList<Consulta> getListaConsultas() {
        if (listaConsultas.isEmpty()) {
            return null;
        } else {
            return listaConsultas;
        }
    }
    public void cadastra(Consulta consulta) throws ErroCadastroException {
        for (Consulta consultaNaLista : listaConsultas) {
            if (consultaNaLista.getHorario() == (consulta.getHorario())) {
                throw new ErroCadastroException("Já existe uma consulta "
                        + "no horário informado.");
            } 
        }
        
        consultaDao.inserirConsulta(consulta);
    }

    public void edita(int cpf, Consulta consulta) throws ErroCadastroException {
        
        if (listaConsultas.isEmpty()) {
            throw new ErroCadastroException("Não há consultas cadastrados no "
                    + "sistema.");
        } else {
            for (Consulta consultaNaLista : listaConsultas) {
                    if (consultaNaLista.getHorario()== (consulta.getHorario())) {
                        throw new ErroCadastroException("Já existe uma consulta "
                                + "no horário informado.");
                    }
                    
            }
            
            consultaDao.editarConsultaPeloCpf(cpf,consulta );
        }
    }
    public void remove(int cpf,Consulta consulta) throws ErroCadastroException {
    
        boolean consultaExisteNaLista = false;
        if (listaConsultas.isEmpty()) {
            throw new ErroCadastroException("Não há consultas cadastrados no "
                    + "sistema.");
        } else {
            for (Consulta consultaNaLista : listaConsultas) {
                if (consultaNaLista.getCpf() == consulta.getCpf()) {
                    consultaDao.deleteConsultaPeloCpf(cpf);
                    consultaExisteNaLista = true;
                }
            }
            if (!consultaExisteNaLista) {
                throw new ErroCadastroException("Esta consulta não está "
                        + "cadastrada no sistema.");
            }
        }
    }
    
  
    public Consulta buscaPorCpf(int cpf) {
        if (listaConsultas.isEmpty()) {
            return null;
        } else {
            for (Consulta consultaNaLista : listaConsultas) {
                if (consultaNaLista.getCpf() == (cpf)) {
                    return consultaNaLista; 
                }
            }
            return null;
        }
    }
}
