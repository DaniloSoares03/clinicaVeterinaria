package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Animal;
import modelo.Tutor;
import util.JsfUtil;

/**
 *
 * @author José
 */
@Named
@ViewScoped
public class GerenciarAnimalControle implements Serializable {
    private Dao<Tutor> daoTutor;
    private Dao<Animal> daoAnimal;
    private List<Tutor> listaTutores;
    private Animal animal; 
    
    @PostConstruct
    public void iniciar() {
        daoTutor = new Dao(Tutor.class);
        daoAnimal = new Dao(Animal.class);
        listaTutores = daoTutor.listarTodos();
        animal = new Animal();
    }
   
    public List<Tutor> getListaTutores() {
        return listaTutores;
    }

    public void setListaTutores(List<Tutor> listaTutores) {
        this.listaTutores = listaTutores;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
     
     public String salvar() {
        daoAnimal.inserir(animal);
        animal = new Animal(); // limpa os campos 
        JsfUtil.mostrarSucesso("Animal cadastrado");
        //lista = dao.listarTodos();//lista copiada de usuario
        // atualiza tabela 
        return null;
    }
    
}