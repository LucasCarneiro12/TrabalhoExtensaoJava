package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Contrato {
	private String id;
	private Locador locador;
	private Locatario locatario;
	private Objeto objeto;
	private double valorDoAluguel;
	private double valorDaCaucao;
	private LocalDate inicio;
	private LocalDate fim;
	private int diaDoVencimento;
	private static Map<Integer, Set<Integer>> idsGerados = new HashMap<>();
	private List<Evento> eventos;


	public Contrato(Locador locador, Locatario locatario, 
			Objeto objeto, double valorDoAluguel, 
			double valorDaCaucao, LocalDate inicio, LocalDate fim,
			int diaDoVencimento) {
		
		int ano = inicio.getYear();
        Set<Integer> idsAno;
        if (!idsGerados.containsKey(ano)) {
            idsAno = new HashSet<>();
            idsGerados.put(ano, idsAno);
        } else {
            idsAno = idsGerados.get(ano);
        }
        int random;
        do {
            random = new Random().nextInt(10000);
        } while (idsAno.contains(random));
        idsAno.add(random);
        
        this.id = String.format("%04d.%04d", ano, random);
		this.locador = locador;
		this.locatario = locatario;
		this.objeto = objeto;
		this.valorDoAluguel = valorDoAluguel;
		this.valorDaCaucao = valorDaCaucao;
		this.inicio = inicio;
		this.fim = fim;
		this.diaDoVencimento = diaDoVencimento;
		this.eventos = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public Locador getLocador() {
		return locador;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public Objeto getObjeto() {
		return objeto;
	}
	
	public double getValorDoAluguel() {
		return valorDoAluguel;
	}

	public double getValorDaCaucao() {
		return valorDaCaucao;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFim() {
		return fim;
	}

	public int getDiaDoVencimento() {
		return diaDoVencimento;
	}
	
	public void adicionarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}


