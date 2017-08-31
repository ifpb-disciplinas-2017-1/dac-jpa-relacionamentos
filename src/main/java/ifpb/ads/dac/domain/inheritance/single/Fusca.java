package ifpb.ads.dac.domain.inheritance.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 07:38:12
 */
@Entity
//@DiscriminatorValue("Fusca86")
public class Fusca extends Carro {

    private int nivelDeBeleza;

    public Fusca() {
    }

    public Fusca(int nivelDeBeleza, String modelo, String ano, String marca) {
        super(modelo, ano, marca);
        this.nivelDeBeleza = nivelDeBeleza;
    }
    
}
