package ifpb.ads.dac.domain.inheritance.table;

import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 08:00:56
 */
@Entity
public class Gato extends Animal {

    private int nivelDePreguica;

    public Gato() {
    }

    public Gato(int nivelDePreguica, String raca) {
        super(raca, false);
        this.nivelDePreguica = nivelDePreguica;
    }

}
