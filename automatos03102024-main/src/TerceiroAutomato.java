import java.util.ArrayList;
import java.util.List;

public class TerceiroAutomato {

    public static void main(String[] args) {
        List<Integer> alfabeto = new ArrayList<>();
        alfabeto.add(0);
        alfabeto.add(1);

        List<String> estados = new ArrayList<>();
        estados.add("q0");
        estados.add("q1");
        estados.add("q2");

        String estadoInicial = "q0";
        List<String> estadosFinais = new ArrayList<>();
        estadosFinais.add("q2");

        String cadeia = "01111";

        String estadoAtual = estadoInicial;

        for (int i = 0; i < cadeia.length(); i++) {
            if (estadoAtual == "q0" && cadeia.charAt(i) == '0') {
                estadoAtual = "q2";
            } else if (estadoAtual == "q0" && cadeia.charAt(i) == '1') {
                estadoAtual = "q1";
            } else if (estadoAtual == "q1" && cadeia.charAt(i) == '0') {
                estadoAtual = "q1";
            } else if (estadoAtual == "q1" && cadeia.charAt(i) == '1') {
                estadoAtual = "q1";
            } else if (estadoAtual == "q2" && cadeia.charAt(i) == '0') {
                estadoAtual = "q2";
            } else if (estadoAtual == "q2" && cadeia.charAt(i) == '1') {
                estadoAtual = "q2";
            }

        }

        if (estadoAtual == "q2") {
            System.out.println("Cadeia aceita.");
        } else {
            System.out.println("Cadeia rejeitada");
        }
    }
}
