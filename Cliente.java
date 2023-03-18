
public class Cliente extends Pessoa {
    private int id;

    public Cliente(String nome, String cpf, String dataNascimento, int id) {
        super(nome, cpf, dataNascimento);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID: " + id;
    }
}

