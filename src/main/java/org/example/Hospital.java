package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Hospital implements Iterable<Medico>{
    private List<Medico> medicos = new ArrayList<>();

    public Hospital(Medico... medicos) { this.medicos = Arrays.asList(medicos); }

    public Iterator<Medico> iterator() { return medicos.iterator(); }
}
