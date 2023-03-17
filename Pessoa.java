public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

 
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
    
    public static void main(String[] args) {
        // Exemplo de uso da classe Pessoa
        Pessoa pessoa = new Pessoa("João Silva", "123.456.789-00", "01/01/2000");
        System.out.println(pessoa.toString());
        // Saída: Pessoa{nome='João Silva', cpf='123.456.789-00', dataNascimento='01/01/2000'}
        
        pessoa.setCpf("987.654.321-00");
        pessoa.setDataNascimento("02/02/2002");
        System.out.println(pessoa.toString());
        // Saída: Pessoa{nome='João Silva', cpf='987.654.321-00', dataNascimento='02/02/2002'}
    }
}

