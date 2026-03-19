import java.util.*;

public class FiltroEletronicoCaros implements FiltroProduto{
    public List<Produto> filtrar(List<Produto> produtos){
        List<Produto> resultado = new ArrayList<>();

        for (Produto p : produtos){
            if (p.categoria().equals("Eletronicos") && p.preco() > 1000.00){
                resultado.add(p);
            }
        }

        return resultado;
    }
}