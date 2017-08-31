package ifpb.ads.dac.domain.inheritance;

import ifpb.ads.dac.domain.inheritance.joined.Empregado;
import ifpb.ads.dac.domain.inheritance.joined.Professor;
import ifpb.ads.dac.domain.inheritance.joined.Tecnico;
import ifpb.ads.dac.domain.inheritance.mapped.Dentista;
import ifpb.ads.dac.domain.inheritance.single.Carro;
import ifpb.ads.dac.domain.inheritance.single.CarroDeMao;
import ifpb.ads.dac.domain.inheritance.single.Fusca;
import ifpb.ads.dac.domain.inheritance.table.Animal;
import ifpb.ads.dac.domain.inheritance.table.Cachorro;
import ifpb.ads.dac.domain.inheritance.table.Gato;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 07:50:03
 */
public class Main {

    public static void main(String[] args) {
//        single();
//        table();
//        joinned();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Dentista(1));
        em.getTransaction().commit();
    }

    private static void joinned() {

        Empregado empregado = new Empregado("Ana", "123");
        Empregado prof = new Professor("123-1", 12, "Maria", "1234");
        Empregado tae = new Tecnico(30, "ADDD", "Mariana", "1234");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(empregado);
        em.persist(prof);
        em.persist(tae);
        em.getTransaction().commit();
    }

    private static void table() {

        Animal animal = new Animal("Formiga", true);
        Animal cachorro = new Cachorro("Kiko", "Pug");
        Animal gato = new Gato(99, "Persa");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(animal);
        em.persist(cachorro);
        em.persist(gato);
        em.getTransaction().commit();
    }

    private static void single() {
        Carro carro = new Carro("massa", "2015", "Fiat");
        Carro fusca = new Fusca(10, "fusca 83", "1982", "VW");
        Carro carroDeMao = new CarroDeMao(3, "massa 2", "2002", "MinhaCasa");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(carro);
        em.persist(carroDeMao);
        em.persist(fusca);
        em.getTransaction().commit();
    }

}
