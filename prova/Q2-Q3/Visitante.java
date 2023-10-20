public class AcessoVisitante implements Valido{
    Visitante visitante;
    PontoControle pontoControle;
    LocalDateTime dataHora;

    public AcessoVisitante(Visitante visitante, PontoControle pontoControle, Date dataHora) {
        this.visitante = visitante;
        this.pontoControle = pontoControle;
        this.dataHora = dataHora;

        if (this.estaValido() == false){
            System.out.println("Acesso não permitido, pârametros inválidos");
            return;
        }
    }

    @Override
    public boolean estaValido() {
        return this.visitante != null && this.pontoControle != null && this.dataHora != null;
    }
}

public class AcessoVisitante{
    private Visitante visitante;
    private PontoControle pontoControle;
    private Date dataHora;

    public AcessoVisitante(Visitante visitante, PontoControle pontoControle, Date dataHora) {
        if (visitante == null || pontoControle == null || dataHora == null) {
            System.out.println("Acesso não permitido, pârametros inválidos");
            return;
        }

        this.visitante = visitante;
        this.pontoControle = pontoControle;
        this.dataHora = dataHora;
    }
}




