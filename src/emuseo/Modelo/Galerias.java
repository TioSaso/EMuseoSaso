package emuseo.Modelo;

public class Galerias {
//Atributos

    private int codigoGaleria;
    private String nombregaleria;
    private String UbicacionGaleria;
//Constructores

    public Galerias() {
    }

    public Galerias(int codigoGaleria, String nombregaleria, String UbicacionGaleria) {
        this.codigoGaleria = codigoGaleria;
        this.nombregaleria = nombregaleria;
        this.UbicacionGaleria = UbicacionGaleria;
    }

    public Galerias(int codigoGaleria) {
        this.codigoGaleria = codigoGaleria;
    }

    public Galerias(String nombregaleria) {
        this.nombregaleria = nombregaleria;
    }
    
    //Mutadores

    public int getCodigoGaleria() {
        return codigoGaleria;
    }

    public void setCodigoGaleria(int codigoGaleria) {
        this.codigoGaleria = codigoGaleria;
    }

    public String getNombregaleria() {
        return nombregaleria;
    }

    public void setNombregaleria(String nombregaleria) {
        this.nombregaleria = nombregaleria;
    }

    public String getUbicacionGaleria() {
        return UbicacionGaleria;
    }

    public void setUbicacionGaleria(String UbicacionGaleria) {
        this.UbicacionGaleria = UbicacionGaleria;
    }

}
