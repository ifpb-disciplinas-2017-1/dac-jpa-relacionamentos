package ifpb.ads.dac.domain.inheritance.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 08:11:02
 */
@Entity
@DiscriminatorValue("TAE")
public class Tecnico extends Empregado {

    private int numeroDeHoras;
    private String setor;

    public Tecnico() {
    }

    public Tecnico(int numeroDeHoras, String setor, String nome, String cpf) {
        super(nome, cpf);
        this.numeroDeHoras = numeroDeHoras;
        this.setor = setor;
    }

}
