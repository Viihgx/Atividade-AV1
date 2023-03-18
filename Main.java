import java.time.LocalDate;
public class Main {
        public static void main(String[] args) {
            Cliente[] clientes = new Cliente[4];
    
            clientes[0] = new Cliente("João", "111.111.111-11", "01/01/1980", 1);
            clientes[1] = new Cliente("Maria", "222.222.222-22", "02/02/1975", 2);
            clientes[2] = new Cliente("Pedro", "333.333.333-33", "03/03/1990", 3);
            clientes[3] = new Cliente("Ana", "444.444.444-44", "04/04/1985", 4);
    
            System.out.println("Todos os clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
                System.out.println();
            }
    
            System.out.println("Clientes com idade maior ou igual a 30 anos:");
            for (Cliente cliente : clientes) {
                int idade = LocalDate.now().getYear() - cliente.getDataNascimento().getYear();
                if (idade >= 30) {
                    System.out.println(cliente);
                    System.out.println();
                }
            }
        }
    }

