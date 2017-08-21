package ifpb.ads.dac.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(unique = true)
    private Endereco endereco;

    @ManyToOne//(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dep_id")
    private Departamento departamento;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "funcionario_id")
    private List<Dependente> dependentes;

    @ManyToMany
    private List<Projeto> projetos;

    public Funcionario() {
        this.projetos = new ArrayList<>();
        this.dependentes = new ArrayList<>();
    }

    private Funcionario(String nome, Endereco endereco,
            Departamento departamento) {
        this();
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

    public void novoDependente(Dependente dependente) {
        this.dependentes.add(dependente);
    }

    public void removerDependente(Dependente dependente) {
        this.dependentes.remove(dependente);
    }

    public List<Dependente> getDependentes() {
        return Collections.unmodifiableList(dependentes);
    }

    public void novoProjeto(Projeto projeto) {
        this.projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto) {
        this.projetos.remove(projeto);
    }

    public List<Projeto> getProjetos() {
        return Collections.unmodifiableList(projetos);
    }

}
