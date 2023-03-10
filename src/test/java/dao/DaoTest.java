package dao;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import modelo.Animal;
import modelo.Consulta;
import modelo.Tutor;
import modelo.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.ExcecaoIdNaoEncontrado;

/**
 *
 * @author User
 */
public class DaoTest {

    public DaoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
    
//    @Test
//    public void testAlterar() throws ExcecaoIdNaoEncontrado{
//        Dao<Usuario> dao = new Dao(Usuario.class); 
//        Usuario u = dao.buscarPorId(1); 
//        u.setNome("Astolfo Junior");
//        dao.alterar(u); 
//    }

//    @Test
//    public void testBuscarPorId() {
//        Dao<Usuario> dao = new Dao(Usuario.class);
//        try {
//            Usuario u = dao.buscarPorId(5);
//            System.out.println("\n\n");
//            System.out.println(u);
//            System.out.println("\n\n");
//        } catch (ExcecaoIdNaoEncontrado e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
//    @Test
//    public void testInserirAnimal() throws ExcecaoIdNaoEncontrado{
//        Dao<Animal> dao = new Dao(Animal.class);
//        Dao<Tutor> daoTutor = new Dao(Tutor.class);
//        Tutor tutor = daoTutor.buscarPorId(2);  // existe tutor com codigo 2
//        // String classe, String nome, Tutor tutor
//        Animal a = new Animal("Cachorro", "Rex", tutor); 
//        dao.inserir(a);        
//    }
    
    
//    @Test
//    public void testInserirConsulta() throws ExcecaoIdNaoEncontrado{
//        Dao<Animal> daoAnimal = new Dao(Animal.class);
//        Dao<Consulta> daoConsulta = new Dao(Consulta.class);
//        // ?? preciso buscar um animal que j?? existe
//       Animal animal = daoAnimal.buscarPorId(1); // existe animal com c??digo 1
//        // Animal animal, Date dataConsulta, String detalhes, Double valor, Boolean pago
//        Consulta consulta = new Consulta(animal, 
//                new java.util.Date(), "Est?? vomitando", 100.00, false);
//        daoConsulta.inserir(consulta);        
//    }
//    
//    @Test
//    public void testInserirTutor() {
//        Dao<Tutor> dao = new Dao(Tutor.class);
//         // String cpf, String nome, String endereco, String telefone, Date dataNascimento
//        Tutor t = new Tutor("313.548.693-15", "Rigby", "Rua das Couves, 100 - Bandeirantes-PR", 
//                "(43) 9688-7755", 
//                new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime()); 
//        dao.inserir(t);     
//    }

//    @Test
//    public void testInserirUsuario() {
//        Dao<Usuario> dao = new Dao(Usuario.class);
//        Usuario u = new Usuario("Astolfo", "Rua das Antas, 1 - Bandeirantes-PR", 
//                "(43) 9988-7755", 
//                new GregorianCalendar(2004, Calendar.FEBRUARY, 11).getTime(), 
//                "astolfo", "123"); 
//        dao.inserir(u);     
//    }
    
       
//    @Test
//    public void testListarUsuarios(){
//        Dao<Usuario> dao = new Dao(Usuario.class);
//        List<Usuario> lista = dao.listarTodos(); 
//        for(Usuario u : lista){
//            System.out.println(u);
//        }
//    }
//    
    @Test
    public void testListarAnimais(){
        Dao<Animal> dao = new Dao(Animal.class);
        List<Animal> lista = dao.listarTodos(); 
        for(Animal a : lista){
            System.out.println(a.getNome());
        }
    }
//    
//    @Test
//    public void testConsultarAnimal() throws ExcecaoIdNaoEncontrado{
//        Dao<Animal> dao = new Dao(Animal.class);
//        Animal a = dao.buscarPorId(1);
//        
//            System.out.println(a);
//       
//    }

}