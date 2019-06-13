
package control;

import exception.ErroCadastroException;
import model.Medico;
import DAO.MedicoDAO;
import java.util.ArrayList;


public class ManipuladorMedicos {
    
    private final ArrayList<Medico> listaMedicos;
    private final MedicoDAO medicoDao = new MedicoDAO();

    public ManipuladorMedicos() {
        listaMedicos = medicoDao.buscarMedico();
    }

   
    public ArrayList<Medico> getListaMedicos() {
        if (listaMedicos.isEmpty()) {
            return null;
        } else {
            return listaMedicos;
        }
    }

    public void cadastra(Medico medico) throws ErroCadastroException {
        for (Medico medicoNaLista : listaMedicos) {
            if (medicoNaLista.getNome().equals(medico.getNome())) {
                throw new ErroCadastroException("Já existe um medico com o "
                        + "mesmo nome cadastrado no sistema.");
            } else if (medicoNaLista.getCrm() == (medico.getCrm())) {
                throw new ErroCadastroException("Já existe um medico com o "
                        + "mesmo CRM cadastrado no sistema.");
            } else if (medicoNaLista.getTelefone()==(medico.getTelefone())) {
                throw new ErroCadastroException("Já existe um medico com o "
                        + "mesmo telefone cadastrado no sistema.");
            }
        }
        medicoDao.inserirMedico(medico);
    }

    public void edita(int crm, Medico medico) throws ErroCadastroException {
       
        if (listaMedicos.isEmpty()) {
            throw new ErroCadastroException("Não há medicos cadastrados no "
                    + "sistema.");
        } else {
            for (Medico medicoNaLista : listaMedicos) {
                    if (medicoNaLista.getNome().equals(medico.getNome())) {
                        throw new ErroCadastroException("Já existe um medico "
                                + "com o mesmo nome cadastrado no sistema.");
                    } else if (medicoNaLista.getCrm()==(medico.getCrm())) {
                        throw new ErroCadastroException("Já existe um medico "
                                + "com o mesmo CRM cadastrado no sistema.");
                    } else if (medicoNaLista.getTelefone()==(medico.getTelefone())) {
                        throw new ErroCadastroException("Já existe um medico "
                                + "com o mesmo telefone cadastrado no sistema.");
                    }
                }

            medicoDao.editarMedicoPeloCrm (crm,medico);
        }
    }
    public void remove(int crm, Medico medico) throws ErroCadastroException {
        
        boolean medicoExisteNaLista = false;
        if (listaMedicos.isEmpty()) {
            throw new ErroCadastroException("Não há medicos cadastrados no "
                    + "sistema.");
        } else {
            for (Medico medicoNaLista : listaMedicos) {
                if (medicoNaLista.getCrm() == medico.getCrm()) {
                    medicoDao.deleteMedicoPeloCrm(crm);
                    medicoExisteNaLista = true;
                }
            }
            if (!medicoExisteNaLista) {
                throw new ErroCadastroException("Este medico não está "
                        + "cadastrado no sistema.");
            }
        }
    }
    
    public Medico buscaPorCrm(int crm) {
        if (listaMedicos.isEmpty()) {
            return null;
        } else {
            for (Medico medicoNaLista : listaMedicos) {
                if (medicoNaLista.getCrm()== (crm)) {
                    return medicoNaLista; 
                }
            }
            return null; 
        }
    }
    public Medico buscaPorNome(String nome) {
        if (listaMedicos.isEmpty()) {
            return null;
        } else {
            for (Medico medicoNaLista : listaMedicos) {
                if (medicoNaLista.getNome().equals(nome)) {
                    return medicoNaLista; 
                }
            }
            return null; 
        }
    }
}
