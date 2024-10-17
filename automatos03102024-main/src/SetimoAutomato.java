import java.util.ArrayList;
import java.util.List;

public class SetimoAutomato {

        public static void main(String[] args) {
            List<Integer> alfabeto = new ArrayList<>();
            alfabeto.add(0);
            alfabeto.add(1);

            List<String> estados = new ArrayList<>();

            estados.add("q0");
            estados.add("q1");
            estados.add("q2");
            estados.add("q3");

            String estadoInicial = "q0";
            String estadoAtual = estadoInicial;

            List<String> estadosFinais = new ArrayList<>();
            estadosFinais.add("q3");

            String cadeia = "010111";

            for(int i = 0; i < cadeia.length(); i++){

                if (estadoAtual.equals("q0") && cadeia.charAt(i) == '0') {
                    estadoAtual = "q1";
                } else if (estadoAtual.equals("q1") && cadeia.charAt(i) == '1') {
                    estadoAtual = "q2";
                } else if (estadoAtual.equals("q2") && cadeia.charAt(i) == '0') {
                    estadoAtual = "q3";
                } else if (estadoAtual.equals("q3")) {
                    estadoAtual = "q3";
                } else {
                    estadoAtual = "q0";
                }

            }

            if (estadoAtual == "q3"){
                System.out.println("Cadeia aceita!");
            } else{
                System.out.println("Cadeia rejeitada!");
            }
        }
    }

