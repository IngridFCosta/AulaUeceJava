
package cartola;

import java.util.Scanner;

public class PrincipalCartola {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Cartola timeC=new Cartola();
        System.out.println("Digite o seu nome:");
        timeC.nome=ler.nextLine();
        System.out.println("Digite a cidade:");
        timeC.cidade=ler.nextLine();
        System.out.println("Digite o país:");
        timeC.pais=ler.nextLine();
        System.out.println("Digite o seu nome do seu time do coração:");
        timeC.time=ler.nextLine();
        System.out.println("Digite o apelido do seu time:");
        timeC.apelidoDoTime=ler.nextLine();
        
        System.out.println("Nome:"+timeC.nome);
        System.out.println("Cidade:"+timeC.cidade);
        System.out.println("País:"+timeC.pais);
        timeC.montarTime();
        
        System.out.println("Atualizar");
        System.out.println("Digite o novo time");
        String novoTime=ler.nextLine();
        timeC.atualizarTime(novoTime);
        System.out.println("Digite o novo nome, a nova cidade e o novo país");
        String novoNome=ler.nextLine();
        String novaCidade=ler.nextLine();
        String novoPais=ler.nextLine();
        timeC.atualizarinformacoesP(novoNome, novaCidade, novoPais);
    }
    
}
