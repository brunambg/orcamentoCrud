package br.com.cpti.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@OneToMany(mappedBy = "obra", cascade = CascadeType.ALL)
	private List<Obra> obras;
    
	private Double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
