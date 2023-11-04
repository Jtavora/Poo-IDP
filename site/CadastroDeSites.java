import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CadastroDeSites {
    private static AtomicInteger siteIdGenerator = new AtomicInteger(1);
    private static List<Site> sites = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Opções:");
            System.out.println("1. Cadastrar um site");
            System.out.println("2. Listar sites cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    cadastrarSite();
                    break;
                case 2:
                    listarSitesCadastrados();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void cadastrarSite() {
        System.out.print("Digite a descrição do site: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite a URL do site: ");
        String url = scanner.nextLine();

        Site site = new Site(descricao, url);
        int siteId = siteIdGenerator.getAndIncrement();
        sites.add(site);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(siteId + ".data"));
            outputStream.writeObject(site);
            outputStream.close();
            System.out.println("Site cadastrado com sucesso (ID: " + siteId + ")");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o site em um arquivo.");
        }
    }

    private static void listarSitesCadastrados() {
        for (Site site : sites) {
            System.out.println("ID: " + siteIdGenerator.get() + ", Descrição: " + site.getDescricao() + ", URL: " + site.getUrl() + ", Data de Cadastro: " + site.getDataCadastro());
        }
    }
}
