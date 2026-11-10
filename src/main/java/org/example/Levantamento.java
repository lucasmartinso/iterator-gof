package org.example;

import java.util.Iterator;

public class Levantamento {
    public static Integer contarMedicosAtivos(Hospital hospital) {
        int quantidade = 0;
        for(Medico medico : hospital) {
           if(medico.isAtivo()) {
               quantidade++;
           }
        }

        return quantidade;
    }

    public static Integer contarMedicos(Hospital hospital) {
        int quantidade = 0;
        for(Iterator medico = hospital.iterator(); medico.hasNext(); ) {
            quantidade++;
            medico.hasNext();
        }

        return quantidade;
    }
}
