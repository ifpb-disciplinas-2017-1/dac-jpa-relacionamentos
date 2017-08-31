package ifpb.ads.dac.domain.inheritance.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 07:39:28
 */
@Entity
@DiscriminatorValue("mao")
public class CarroDeMao extends Carro {

    private int numeroDeRodas;

    public CarroDeMao() {
    }

    public CarroDeMao(int numeroDeRodas, String modelo, String ano, String marca) {
        super(modelo, ano, marca);
        this.numeroDeRodas = numeroDeRodas;
    }

}
