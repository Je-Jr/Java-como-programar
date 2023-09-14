import java.util.Scanner;

public class AquecimentoGlobal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int acertos = 0;
    int resposta;
    for (int pergunta = 1; pergunta <= 5; pergunta++) {
      if (pergunta == 1) {
        System.out.println("Pergunta 1: Qual e o principal fenomeno de longo prazo associado ao aquecimento global?");
        System.out.println("1-Aumento constante da temperatura global*.");
        System.out.println("2-Variacoes significativas na temperatura global a cada ano.");
        System.out.println("3-Crescimento das emissoes de CO2.");
        System.out.println("4-Flutuacoes sazonais nas temperaturas globais.");
        resposta = input.nextInt();
        if (resposta == 1) {
          acertos++;
        }
      }
      if (pergunta == 2) {
        System.out.println(
            "Pergunta 2: Qual e um dos principais argumentos frequentemente utilizados pelos \"ceticos\" em relacao ao aquecimento global?");
        System.out.println("1-Aumento constante da temperatura global nos ultimos 10 anos*.");
        System.out.println("2-Reducao drastica das emissoes de CO2.");
        System.out.println("3-Emissoes de CO2 nao tem impacto sobre o clima.");
        System.out.println("4-Aquecimento global e um fenomeno recente.");
        resposta = input.nextInt();
        if (resposta == 1) {
          acertos++;
        }
      }
      if (pergunta == 3) {
        System.out.println(
            "Pergunta 3: Alem da temperatura global, quais sao outros indicadores importantes do aquecimento global?");
        System.out.println("1-Velocidade do vento.");
        System.out.println("2-Cor dos oceanos.");
        System.out.println("3-Composicao da atmosfera.");
        System.out.println("4-Nivel de poluicao urbana*.");
        resposta = input.nextInt();
        if (resposta == 4) {
          acertos++;
        }
      }
      if (pergunta == 4) {
        System.out.println("Pergunta 4: Qual e o orgao internacional que produz relatorios sobre mudancas climaticas, frequentemente referenciado como IPCC?");
        System.out.println("1-International Panel of Climate Control.");
        System.out.println("2-United Nations Climate Council.");
        System.out.println("3-Intergovernmental Panel on Climate Change*.");
        System.out.println("4-Global Climate Assessment Committee.");
        resposta = input.nextInt();
        if (resposta == 3) {
          acertos++;
        }
      }
      if (pergunta == 5) {
        System.out.println("Pergunta 5: Como a comunidade cientifica geralmente aborda o debate sobre o aquecimento global?");
        System.out.println("1-Apoiando unanimemente a ideia de que o aquecimento global e inevitavel.");
        System.out.println("2-Realizando pesquisas constantes para entender as complexidades do clima*.");
        System.out.println("3-Ignorando as evidencias contrarias ao aquecimento global.");
        System.out.println("4-Apresentando opinioes polarizadas sobre o assunto.");
        resposta = input.nextInt();
        if (resposta == 2) {
          acertos++;
        }
      }
    }
    if (acertos == 5) {
      System.out.println("Excelente!");
    }
    else if (acertos == 4) {
      System.out.println("Muito bom!");
    }
    else {
      System.out.println("E momento de aprimorar seu conhecimento sobre o aquecimento global");
      System.out.println("Acesse o link abaixo para mais informacoes");
      System.out.println("https://www.pensamentoverde.com.br/sustentabilidade/aquecimento-global-ceticos/");
    }
    input.close();
  }
}