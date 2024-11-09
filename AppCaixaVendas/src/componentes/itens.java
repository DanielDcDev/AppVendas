package componentes;

public class itens {
    //Atributos dos itens 
    private int id;
//identificacao de cada item, nao necessita de nenhum metodo pois todos os ids serao criados assim que forem instanciados os itens.
    private String nome;
//nome sera criado junto ao item.
    private Double valor;
//sera atribuido e podera ser modificado normalmente.
    private int quatidade;
//pode ser modificado facilmente
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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public int getQuatidade() {
        return quatidade;
    }
    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }
@Override
    public String toString() {
        return "itens [id= " + id + ", nome= " + nome + ", valor= " + valor + ", quatidade= " + quatidade + "]";
    }
@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        itens other = (itens) obj;
        if (id != other.id)
            return false;
        return true;
    }

     
}
