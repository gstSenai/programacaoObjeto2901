
import java.util.Scanner;

public class loja {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    String nome, cidade, bairro, rua, roupa, acessorios, outro;
    int numero, numCasa, loja, carrinho = 0, cadastro, metodo, prazo, valorPrazo, precoTotal = 0;

    System.out.println("Deseja fazer cadastro: " +
                        "\n1- SIM"+
                        "\n2- NÃO:");
    cadastro = sc.nextInt();
        
    if ( cadastro == 2 ){
        System.out.println("NÃO FOI POSSIVEL FAZER O CADASTRO");
    }
    if ( cadastro == 1 ){
    System.out.println ( "FAÇA SEU CADASTRO:" );
    System.out.println ( "--------------------" );

        System.out.println ( "Digite seu nome: " );
        nome = sc.next();

        System.out.println ( "Digite o sua CIDADE: " );
        cidade = sc.next();

        System.out.println ( "Digite o seu BAIRRO: " );
        bairro = sc.next();

        System.out.println ( "Digite o sua RUA: " );
        rua = sc.next();

        System.out.println ( "Digite o seu Número da Casa: " );
        numCasa = sc.nextInt();

        System.out.println ( "Digite seu número para cotato: " );
        numero = sc.nextInt();
        }

        System.out.println( " " );

        int pesquisa;

        do{

        System.out.println ( "Digite qual segmento deseja pesquisar: "+
                            "\n1-Eletronico"+
                            "\n2-Roupa" + 
                            "\n3-Acessórios"+
                            "\n4-Outro "+
                            "\n5-Finalizar: ");
        pesquisa = sc.nextInt();

        String eletronico;

        if ( pesquisa == 1 ){

            System.out.println ( "Digite o nome do eletronico que deseja comprar: " );
            eletronico = sc.next();

            if(eletronico .equals ( "celular" )){
       
                System.out.println ( "Nome: Iphone 13" );
                System.out.println ( "Preço: R$ 4000,00" );
                System.out.println ( "Descrição: Este celular tem 128 gb, 4 memória ram ");
                System.out.println( "Deseja adicionar ao carrinho? "+
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 4000;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                }
            }
            if(eletronico .equals ( "televisao" )){

                System.out.println ( "Nome: Samsung Smart TV Crystal" );
                System.out.println ( "Preço: R$ 2.054,00" );
                System.out.println ( "Descrição: Essa televisão tem 43 polegadas, 4k HD, SMART TV ");
                System.out.println( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 2054;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                } 
            }
            if(eletronico .equals( "monitor" )){

                System.out.println ( "Nome: MONITOR GAMER REDRAGON AMBER" );
                System.out.println ( "Preço: R$ 1.100,00" );
                System.out.println ( "Descrição: 27 POLEGADAS, VA, FHD, 1MS, 165HZ, FREESYNC, HDMI/DP, GM27H10C ");
                System.out.println( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 1100;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                } 
            }
        }

        if(pesquisa == 2){

            System.out.println ( "Digite o nome da Roupa que deseja comprar: ");
            roupa = sc.next();

            if(roupa .equals( "camisa" )){
                System.out.println ( "Nome: Camisa Oversized " );
                System.out.println ( "Preço: R$ 90,00 " );
                System.out.println( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 90;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
                }

            if(roupa .equals( "calça" )){
                System.out.println ( "Nome: Calça Skinny " );
                System.out.println ( "Preço: R$ 156,00 " );
                System.out.println ( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 156;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
                }
            }
            if(pesquisa == 3){

                System.out.println ( "Digite o nome do Acessório que deseja comprar: ");
                acessorios = sc.next();

                if(acessorios .equals("boné")){

                    System.out.println ( "Nome: Boné Trucker Brasão" );
                    System.out.println ( "Preço: R$ 119,00 " );
                    System.out.println ( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                    loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 119;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
                }
                if(acessorios .equals("corrente")){

                    System.out.println ( "Nome: Corrente Holger" );
                    System.out.println ( "Preço: R$ 100,00 " );
                    System.out.println ( "Descrição: Aço Prata 3mm " );
                    System.out.println ( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                    loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 100;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
                }
            }
            if ( pesquisa == 4 ){

                System.out.println ( "Digite qual outro produto deseja pesquisar: " );
                outro = sc.next();

                if ( outro .equals ("cadeira")){

                    System.out.println ( "Nome: Cadeira Uni" );
                    System.out.println ( "Preço: R$750 " );
                    System.out.println ( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                    loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 750;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
 
                }
                if ( outro .equals ("mesa")){

                    System.out.println ( "Nome: Mesa Gamer" );
                    System.out.println ( "Preço: R$215,00" );
                    System.out.println ( "Deseja adicionar ao carrinho? " +
                                    "\n1-SIM"+
                                    "\n2-NÃO:");
                    loja = sc.nextInt();

                if(loja == 1){
                    carrinho ++;
                    precoTotal = precoTotal + 215;
                }
                else{
                    System.out.println("Não deseja adicionar este eletronico no carrinho: ");
                    } 
                }
            }

         }while(pesquisa < 5 );
            
            if(carrinho > 0){
                System.out.println ( " " );
                System.out.println ( "Você tem " + carrinho + " itens no carrinho " );
                System.out.println ( "O preço total que você deverá Pagar é de: R$" + precoTotal );
                System.out.println ( "Qual o método de pagamento você deseja pagar: " + 
                                     "\n1-À vista"+
                                     "\n2-À prazo: ");
                metodo = sc.nextInt();
                
                if ( metodo == 2 ){
                    System.out.println ( "Digite em quantas vezes deseja fazer: " );
                    prazo = sc.nextInt();

                    valorPrazo = precoTotal/prazo;
                    System.out.println( "Você terá que pagar R$" + valorPrazo + " por mês" );
                }
                else{
                    System.out.println ( "Você terá que pagar: " + precoTotal );
                }

            }
            else{
                System.out.println("VOCÊ ENCERROU SUAS COMPRAS");
            }

         }
    }

