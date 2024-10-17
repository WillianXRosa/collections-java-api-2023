package ordenacao.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	/**Attributes**/
	private Map<LocalDate, Eventos> eventosMap;
	
	
	/**Constructors**/
	public AgendaEventos() {
		eventosMap = new HashMap<>();
		
	}
	
	/**Add Events**/
	public void adicionarEventos(LocalDate data, String name, String attraction) {
		Eventos evento = new Eventos(name, attraction);
		eventosMap.put(data, evento);
	}
	
	/**Display Agenda**/
	public void exibirAgenda() {
		Map<LocalDate, Eventos>eventosTreeMap = new TreeMap<LocalDate, Eventos>(eventosMap); 
		
		System.out.println("Eventos agendados: " + eventosTreeMap);
	}
	
	/**get next event**/
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Eventos>eventosTreeMap = new TreeMap<LocalDate, Eventos>(eventosMap);
		for(Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O próximo evento " + entry.getValue() + "será em: " + entry.getKey());
				break;
			}
		}
	}
	
	
	
	/**Metodo Main**/
	public static void main(String[] args) {
		AgendaEventos objAgendaEventos = new AgendaEventos();
		objAgendaEventos.adicionarEventos(LocalDate.of(2022, 9, 13), "Evento 1", "Atracao 1");
		objAgendaEventos.adicionarEventos(LocalDate.of(2020, 7, 20), "Evento 2", "Atracao 2");
		objAgendaEventos.adicionarEventos(LocalDate.of(2023, 10, 26), "Evento 3", "Atracao 3");
		objAgendaEventos.adicionarEventos(LocalDate.of(2024, 11, 19), "Evento 4", "Atracao 4");
		//objAgendaEventos.adicionarEventos(LocalDate.of(2024, 10, 17), "Evento 5", "Atracao 5");
		objAgendaEventos.adicionarEventos(LocalDate.of(2024, 10, 26), "Evento 6", "Atracao 6");
		
		objAgendaEventos.exibirAgenda();
		
		objAgendaEventos.obterProximoEvento();
	}
}

