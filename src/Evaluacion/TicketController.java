package Evaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TicketController {
  public Set<TicketSoporte> filtrarYOrdernarTickets(List<TicketSoporte> ticketSoporte, int prioridadMinima) {
    Set<TicketSoporte> rSet = new TreeSet<>(
        (c1, c2) -> {
          int compPri = Integer.compare(c2.getPrioridad(), c1.getPrioridad());
          if (compPri != 0) {
            return compPri;
          }
          int comN = c1.getTecnico().compareToIgnoreCase(c2.getTecnico());
          return comN;
        });
    for (TicketSoporte t : ticketSoporte) {
      if (t.getPrioridad() >= prioridadMinima) {
        rSet.add(t);
      }
    }

    return rSet;

  }

  public Map<String, List<String>> agruparCodigosPorPrioridad(List<TicketSoporte> ticketSoportes) {
    Map<String, List<String>> resultado = new TreeMap<>();
    resultado.put("ALTA", new ArrayList<>());
    resultado.put("MEDIA", new ArrayList<>());
    resultado.put("BAJA", new ArrayList<>());
    for (TicketSoporte t : ticketSoportes) {
      String rango;
      if (t.getPrioridad() >= 4) {
        rango = "ALTA";
      } else if (t.getPrioridad() >= 2 && t.getPrioridad() <= 3) {
        rango = "MEDIA";
      } else {
        rango = "BAJA";
      }
      String codigoUno = t.getCodigo().split(" ")[0];
      List<String> nGrupo = resultado.get(rango);
      boolean yaExiste = false;
      for (String n : nGrupo) {
        if (n.equalsIgnoreCase(codigoUno)) {
          yaExiste = true;
          break;
        }
      }
      if (!yaExiste) {
        nGrupo.add(codigoUno);
      }

    }
    return resultado;

  }

}
