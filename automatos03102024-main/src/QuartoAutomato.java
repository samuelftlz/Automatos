import java.util.ArrayList;
import java.util.List;

public class QuartoAutomato {

    public static void main(String[] args) {
        List<Integer> alfabeto = new ArrayList<>();
        alfabeto.add(0);
        alfabeto.add(1);

        List<String> estados = new ArrayList<>();
        estados.add("q0");
        estados.add("q1");

        String estadoInicial = "q0";
        List<String> estadosFinais = new ArrayList<>();
        estadosFinais.add("q1");

        String cadeia = "";

        String estadoAtual = estadoInicial;

        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia == null){
                estadoAtual = "q0";
            } else{
                estadoAtual = "q1";
            }
        }

        if (estadoAtual == "q1") {
            System.out.println("Cadeia aceita.");
        } else {
            System.out.println("Cadeia rejeitada");
        }
    }
}