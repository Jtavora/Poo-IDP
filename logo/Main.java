class PaginaEstatica {
    public void render() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║             Página Estática           ║");
        System.out.println("╚════════════════════════════════════╝");
    }

    public void renderComponente(String componente) {
        System.out.println("║                                    ║");
        System.out.println("║   " + componente);
    }
}

class Logo {
    private String texto;

    public Logo(String texto) {
        this.texto = texto;
    }

    public void render(PaginaEstatica pagina) {
        pagina.renderComponente("┌──── IDP ────┐");
        pagina.renderComponente("│                            │");
        pagina.renderComponente("└────────────────────┘");
    }
}

class Informativo {
    private String texto;

    public Informativo(String texto) {
        this.texto = texto;
    }

    public void render(PaginaEstatica pagina) {
        pagina.renderComponente("Informativo: " + texto);
    }
}

class Entrada {
    private String texto;

    public Entrada(String texto) {
        this.texto = texto;
    }

    public void render(PaginaEstatica pagina) {
        pagina.renderComponente(texto);
    }
}

class Botao {
    private String texto;

    public Botao(String texto) {
        this.texto = texto;
    }

    public void render(PaginaEstatica pagina) {
        pagina.renderComponente(texto);
        pagina.renderComponente("┌──── " + texto + " ────┐");
        pagina.renderComponente("│                            │");
        pagina.renderComponente("└────────────────────┘");
    }
}

public class Main {
    public static void main(String[] args) {
        PaginaEstatica pagina = new PaginaEstatica();
        pagina.render();

        Logo logo = new Logo("IDP");
        Informativo informativo = new Informativo("Texto informativo da página");
        Entrada entrada = new Entrada("Digite aqui...");
        Botao botao = new Botao("Salvar");

        logo.render(pagina);
        informativo.render(pagina);
        entrada.render(pagina);
        botao.render(pagina);

        System.out.println("╚════════════════════════════════════╝");
    }
}
