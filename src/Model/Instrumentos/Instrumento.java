package Model.Instrumentos;

public class Instrumento {
    private String tipoInstrumento;
    private String marcaDoInstrumento;
    private String modeloDoInstrumento;

    public Instrumento(String tipoInstrumento, String marcaDoInstrumento, String modeloDoInstrumento ) {
        this.tipoInstrumento = tipoInstrumento;
        this.marcaDoInstrumento = marcaDoInstrumento;
        this.modeloDoInstrumento = modeloDoInstrumento;
    }

    public String getModeloDoInstrumento() {
        return modeloDoInstrumento;
    }

    public void setModeloDoInstrumento(String modeloDoInstrumento) {
        this.modeloDoInstrumento = modeloDoInstrumento;
    }

    public String getMarcaDoInstrumento() {
        return marcaDoInstrumento;
    }

    public void setMarcaDoInstrumento(String marcaDoInstrumento) {
        this.marcaDoInstrumento = marcaDoInstrumento;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
}
