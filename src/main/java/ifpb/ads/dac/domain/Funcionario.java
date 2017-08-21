package ifpb.ads.dac.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2017, 07:20:53
 */
@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 80)
    private String nome;
    @Embedded
    private Endereco endereco;

    @OneToOne//(cascade = CascadeType.PERSIST)
    private Departamento departamento;

    public Funcionario() {
    }

    private Funcionario(String nome, Endereco endereco,
            Departamento departamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.departamento = departamento;
    }

    public static Funcionario of(String nome) {
        return of(nome, Departamento.empty());
    }

    public static Funcionario of(String nome, Departamento departamento) {
        return new Funcionario(
                nome, Endereco.empty(), departamento);
    }

//    public void setDepartamento(Departamento departamento) {
//        this.departamento = departamento;
//    }
}
