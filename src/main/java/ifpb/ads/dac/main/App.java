package ifpb.ads.dac.main;

import ifpb.ads.dac.domain.Departamento;
import ifpb.ads.dac.domain.Dependente;
import ifpb.ads.dac.domain.Funcionario;
import ifpb.ads.dac.domain.Projeto;
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
        App app = new App();

//        Departamento departamento = app.primeiroDepartamento();
        Departamento departamento = Departamento.empty();
        Funcionario funcionario = Funcionario.of("Chaves", departamento);

        funcionario.novoDependente(new Dependente("Kiko"));
        funcionario.novoDependente(new Dependente("Chiquinha"));
        
        Projeto dac = new Projeto("20171", "Vai ser mara");
        Projeto pos = new Projeto("20172", "Vai ser mara, de novo");
        funcionario.novoProjeto(dac);
        funcionario.novoProjeto(pos);
        
        app.persist(dac);
        app.persist(pos);
        app.persist(departamento);
        app.persist(funcionario);

    }

//    public Departamento primeiroDepartamento() {
//        return em.find(Departamento.class, 1);
//    }
    public void persist(Object object) {
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
