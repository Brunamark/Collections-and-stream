package com.registro;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    Map<Integer, Compromisso> agenda = new TreeMap<>();


    public void adicionarCompromisso(Compromisso compromisso) {
        agenda.put(compromisso.getHorario(), compromisso);
    }

    public boolean removeCompromissoByName(String descricao) {
        Iterator<Map.Entry<Integer, Compromisso>> iterator = agenda.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Compromisso> entry = iterator.next();
            if (entry.getValue().getDescricao().equalsIgnoreCase(descricao)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Compromisso> getAgenda() {
        List<Compromisso> compromissoList = new ArrayList<>(agenda.values());
        compromissoList.sort(Comparator.comparingInt(Compromisso::getHorario));
        return compromissoList;

    }
}
