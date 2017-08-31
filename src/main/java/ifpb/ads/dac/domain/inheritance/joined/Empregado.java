package ifpb.ads.dac.domain.inheritance.joined;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/08/2017, 08:09:11
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "PAPEL",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Funcionario")
public class Empregado implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;

    public Empregado() {
    }

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

}
