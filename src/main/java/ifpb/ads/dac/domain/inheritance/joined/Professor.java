package ifpb.ads.dac.domain.inheritance.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 08:10:31
 */
@Entity
@DiscriminatorValue("Prof")
public class Professor extends Empregado {

    private String matricula;
    private int numeroDeAulas;

    public Professor() {
    }

    public Professor(String matricula, int numeroDeAulas, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.numeroDeAulas = numeroDeAulas;
    }
    
}
