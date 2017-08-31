package ifpb.ads.dac.domain.inheritance.mapped;

import ifpb.ads.dac.domain.Endereco;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 09:07:36
 */
@MappedSuperclass
public class Medico implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @OneToOne
    private Endereco endereco;
}
