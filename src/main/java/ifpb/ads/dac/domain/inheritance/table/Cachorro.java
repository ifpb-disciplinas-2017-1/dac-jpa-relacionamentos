package ifpb.ads.dac.domain.inheritance.table;

import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 08:00:00
 */
@Entity
public class Cachorro extends Animal {

    private String dono;

    public Cachorro() {
    }

    public Cachorro(String dono, String raca) {
        super(raca, true);
        this.dono = dono;
    }

}
