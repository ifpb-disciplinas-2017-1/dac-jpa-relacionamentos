package ifpb.ads.dac.main;

import ifpb.ads.dac.domain.Departamento;
import ifpb.ads.dac.domain.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 07:27:31
 */
public class App {

    public static void main(String[] args) {

        Departamento departamento = Departamento.empty();
        Funcionario funcionario = Funcionario.of("Kiko", departamento);

        App app = new App();
        app.persistFuncionario(departamento);
        app.persistFuncionario(funcionario);

    }

    public void persistFuncionario(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
