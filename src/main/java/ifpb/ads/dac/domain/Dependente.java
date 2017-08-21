package ifpb.ads.dac.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 08:08:31
 */
@Entity
public class Dependente implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String nome;

    public Dependente() {
    }

    public Dependente(String nome) {
        this.nome = nome;
    }
    
    
    
}
