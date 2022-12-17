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
import modelo.Animal;
import modelo.Consulta;
import modelo.Usuario;
import util.JsfUtil;

@Named
@ViewScoped
public class GerenciarConsultaControle implements Serializable {
     private Consulta consulta;
     private Dao<Animal> dao;
     private Dao<Consulta> daoConsulta;
     private List<Animal> lista;
     //private Boolean pagar  = true;
     
    @PostConstruct
    public void iniciar() {
        consulta = new Consulta();
        dao = new Dao(Animal.class);
        daoConsulta = new Dao(Consulta.class);
        lista  = dao.listarTodos();   
    }

    public List<Animal> getLista() {
        return lista;
    }

    public void setLista(List<Animal> lista) {
        this.lista = lista;
    }
     
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    
  
     public String salvar() {
        consulta.setPago(true);
        daoConsulta.inserir(consulta);
        consulta = new Consulta(); // limpa os campos 
        JsfUtil.mostrarSucesso("Usuário cadastrado");
        lista = dao.listarTodos();//lista copiada de usuario
        // atualiza tabela 
        return null;
    }

     
}
