import java.io.*;
import java.util.*;

class Site implements Serializable {
    private String descricao;
    private String url;
    private Date dataCadastro;

    public Site(String descricao, String url) {
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = new Date();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
