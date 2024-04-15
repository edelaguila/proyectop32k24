package controlador;

public class Bancos {
    private String idBanco;
    private String nombreBanco;

    public Bancos() {
    }

    public Bancos(String idBanco, String nombreBanco) {
        this.idBanco = idBanco;
        this.nombreBanco = nombreBanco;
    }

    public String getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "Bancos{" + "idBanco=" + idBanco + ", nombreBanco=" + nombreBanco + '}';
    }
}
