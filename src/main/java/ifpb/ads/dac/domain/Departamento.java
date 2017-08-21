package ifpb.ads.dac.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 07:31:01
 */
@Entity
public class Departamento implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String sigla;

    
    
    public Departamento() {
    }

    public static Departamento empty() {
        return new Departamento("IFPB");
    }

    private Departamento(String sigla) {
        this.sigla = sigla;
    }

    public String id() {
        return String.valueOf(id);
    }

}
