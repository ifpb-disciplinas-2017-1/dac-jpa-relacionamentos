package ifpb.ads.dac.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 09:10:09
 */
@Entity
public class Projeto implements Serializable{

    @Id
    private String codigo;
    private String descricao;

    public Projeto() {
    }

    public Projeto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    
}
