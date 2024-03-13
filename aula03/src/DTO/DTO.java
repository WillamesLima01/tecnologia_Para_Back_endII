package DTO;

import java.util.Date;

public class DTO {
    String nome;
    String telefone;
     Date dataConsulta;
     String hora;
     String medico;


    public DTO(String nome, String telefone, Date dataConsulta, String hora, String medico) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataConsulta = dataConsulta;
        this.hora = hora;
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
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
}
