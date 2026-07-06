import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Evaluacion.TicketController;
import Evaluacion.TicketSoporte;

public class App {
    public static void main(String[] args) throws Exception {
        runTicketsEva();
    }

    private static void runTicketsEva() {
        List<TicketSoporte> tickets = new ArrayList<>();
        tickets.add(new TicketSoporte("TK-104", "Ana Torres", 5));
        tickets.add(new TicketSoporte("TK-101", "Luis Mora", 2));
        tickets.add(new TicketSoporte("TK-108", "Carlos Vega", 4));
        tickets.add(new TicketSoporte("tK-104", "Ana Torres", 5));
        tickets.add(new TicketSoporte("TK-103", "Luis Andrade", 3));
        tickets.add(new TicketSoporte("TK-107", "Mateo Rojas", 1));
        tickets.add(new TicketSoporte("TK-102", "Sofia Cordero", 4));
        tickets.add(new TicketSoporte("TK-106", "Carlos Mendez", 5));
        tickets.add(new TicketSoporte("TK-105", "Ana Molina", 2));
        TicketController controller = new TicketController();
        Set<TicketSoporte> fp = controller.filtrarYOrdernarTickets(tickets, 3);
        System.out.println("==Filtrar y Ordenar Tickets");
        for (TicketSoporte td : fp) {
            System.out.println(td.getCodigo() + "-" + td.getTecnico() + "-" + td.getPrioridad());
        }
        Map<String, List<String>> agrupar = controller.agruparCodigosPorPrioridad(tickets);
        for (Map.Entry<String, List<String>> entry : agrupar.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}
