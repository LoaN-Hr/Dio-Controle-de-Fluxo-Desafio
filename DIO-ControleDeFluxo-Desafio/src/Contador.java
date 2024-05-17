import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try{
                contar(parametroUm, parametroDois);
            }catch(ParametroInvalidoException e){
                System.out.println(e.getMessage());
            }
            terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException{
        if (parametroUm >= parametroDois) {
            throw new ParametroInvalidoException("O segundo parametro deve ser maior que o primeiro");
           
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero:" + i);
        }
        
    }

}
