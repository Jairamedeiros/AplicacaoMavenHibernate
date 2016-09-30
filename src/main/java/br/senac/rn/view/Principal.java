
package br.senac.rn.view;

import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Sexo;


public class Principal {
    private static Object dao;
    public static void main(String[] args) {
    
        
       Cliente cliente = new Cliente();
       
       cliente.setNome("José");
       cliente.setCpf("12312312300");
       cliente.setSexo(new SexoDAO().selectById(1));
       
        ClienteDAO dao = new ClienteDAO();
        
        dao.insert(cliente);
        
        
        //for (Cliente cliente : dao.selectAll());
        
        
        
        System.exit(0);
            
            
        }
        
    }

