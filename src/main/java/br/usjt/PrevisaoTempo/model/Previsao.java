package br.usjt.PrevisaoTempo.model;

import javax.persistence.*;

@Entity
@Table (name = "tb_previsao")
public class Previsao {

    //atributos
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn (name = "id_dia_semana")
    private DiaSemana diaSemana;

    @ManyToOne
    @JoinColumn (name="id_cidade")
    private Cidade cidade;

    private double minTemp;
    private double maxTemp;
    private double humidade;
    private String data;
    private String hora;
    private String descr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getHumidade() {
        return humidade;
    }

    public void setHumidade(double humidade) {
        this.humidade = humidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}