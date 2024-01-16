package exemplo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> turma = new ArrayList<>();
        
        turma.add(new Aluno("Bruno", 8.5));
        turma.add(new Aluno("Carlos", 8.2));
        turma.add(new Aluno("Ana", 6));
        
        Collections.sort(turma);
        
        for(Aluno a : turma){
            System.out.println(a.getNome());
        }
    }
}
