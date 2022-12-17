/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Tutor;
import dao.Dao;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Usuario;
import util.JsfUtil;

@Named
@ViewScoped
public class GerenciarTutorControle implements Serializable {
     private Tutor tutor;
     private Dao dao;
     private List<Usuario> lista;
     
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    @PostConstruct
    public void iniciar() {
        tutor = new Tutor();
        dao = new Dao(Usuario.class);    
    }
    
     public String salvar() {
        dao.inserir(tutor);
        tutor = new Tutor(); // limpa os campos 
        JsfUtil.mostrarSucesso("Usuário cadastrado");
        lista = dao.listarTodos();//lista copiada de usuario
        // atualiza tabela 
        return null;
    }

     
}
