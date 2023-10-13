package HerancaEComposicao;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
