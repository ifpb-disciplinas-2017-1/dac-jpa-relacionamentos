package ifpb.ads.dac.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 24/08/2017, 07:59:51
 */
@Entity
public class Gerente implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @OneToMany(mappedBy = "gerente")
    private List<Projeto> projetos; //1-*
    @OneToOne(mappedBy = "gerente")
    private Departamento departamento; //1-1
    
    

    public Gerente() {
    }

    public Gerente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void novoProjeto(Projeto projeto) {
        this.projetos.add(projeto);
        projeto.setGerente(this);
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}


