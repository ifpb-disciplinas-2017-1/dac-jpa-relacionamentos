package ifpb.ads.dac.domain.inheritance.table;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 07:58:35
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String raca;
    private boolean bonito;

    public Animal() {
    }

    public Animal(String raca, boolean bonito) {
        this.raca = raca;
        this.bonito = bonito;
    }

}
