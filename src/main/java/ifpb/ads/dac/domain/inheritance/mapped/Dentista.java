package ifpb.ads.dac.domain.inheritance.mapped;

import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 09:10:26
 */
@Entity
public class Dentista extends Medico {

    private int horas;

    public Dentista() {
    }

    public Dentista(int horas) {
        this.horas = horas;
    }
    
}
