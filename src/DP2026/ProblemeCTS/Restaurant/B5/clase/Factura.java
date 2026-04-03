package DP2026.ProblemeCTS.Restaurant.B5.clase;

import java.util.Date;

public class Factura {
    private String idFactura;
    private double totalFactura;
    private Date dataEmitereFactura;

    public Factura(String idFactura, double totalFactura, Date dataEmitereFactura) {
        this.idFactura = idFactura;
        this.totalFactura = totalFactura;
        this.dataEmitereFactura = dataEmitereFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", totalFactura=" + totalFactura +
                ", dataEmitereFactura=" + dataEmitereFactura +
                '}';
    }

    public String getIdFactura() {
        return idFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public Date getDataEmitereFactura() {
        return dataEmitereFactura;
    }
}
