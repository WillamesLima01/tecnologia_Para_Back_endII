package consulta;

import DTO.DTO;

import java.util.Date;

public class Consulta {

    String dataConsulta;
    String hora;
    String medico;
    Double valor;

    public Consulta(String dataConsulta, String hora, String medico, Double valor) {
        this.dataConsulta = dataConsulta;
        this.hora = hora;
        this.medico = medico;
        this.valor = valor;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
