package com.farmacia.tipodocumento.domain.emtity;

public class TipoDocumento {
   private int idTipo;
   private String tipo;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipo, String tipo) {
        this.idTipo = idTipo;
        this.tipo = tipo;
    }

    public int getIdTipo() {
        return this.idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
