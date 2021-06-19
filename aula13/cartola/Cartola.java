
package cartola;

public class Cartola {
    String nome, cidade, pais, time, apelidoDoTime;
    
    public void montarTime(){
        System.out.println("Time montado");
        System.out.println("Apelido do time: "+apelidoDoTime);
        System.out.println("Time:"+time);
    }
    public void atualizarTime(String Novotime){
        System.out.println("O novo time é: "+Novotime);
        
    }
    public void atualizarinformacoesP(String novoNome,String novaCidade,String novoPais){
        System.out.println("Novo nome:"+novoNome);
         System.out.println("Nova cidade:"+novaCidade);
          System.out.println("Novo país : "+novoPais);
    }

}
