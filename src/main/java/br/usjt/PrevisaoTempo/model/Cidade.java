package br.usjt.PrevisaoTempo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_cidade")
public class Cidade {

    @OneToMany(mappedBy = "cidade")
    private List<Previsao> previsao;

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double latitude;
    private double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Previsao> getPrevisao() {
        return previsao;
    }

    public void setPrevisao(List<Previsao> previsao) {
        this.previsao = previsao;
    }
}
