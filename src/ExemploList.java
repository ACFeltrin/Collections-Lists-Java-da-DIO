import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e add sete notas: ");

        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(5.0);
        notas.add(10.0);
        notas.add(8.5);
        notas.add(9.25);
        notas.add(0.0);
        notas.add(9.0);
        System.out.println(notas);

       /* System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Add a nota 8.0 na posição 4: ");

        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 7.0: ");

        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0.0: ");

        notas.remove(0.0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");

        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7d) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("A lista esta vazia: " + notas.isEmpty()); */
      /*  System.out.println("Confira se a nota 5.0 está na lista: " + notas. contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        } */
        
        
        //System.out.println(notas);
    }

}