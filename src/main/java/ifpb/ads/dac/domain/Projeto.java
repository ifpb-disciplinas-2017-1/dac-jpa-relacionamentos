package ifpb.ads.dac.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 09:10:09
 */
@Entity
public class Projeto implements Serializable {

    @Id
    private String codigo;
    private String descricao;
    @ManyToOne
    private Gerente gerente; //*-1
    @ManyToMany(mappedBy = "projetos")
    private List<Funcionario> funcionarios;

    public Projeto() {
    }

    public Projeto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
