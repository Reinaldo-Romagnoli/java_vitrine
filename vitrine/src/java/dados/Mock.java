
package dados;

import java.util.ArrayList;
import modelo.Produto;


public class Mock {
    
    public static ArrayList<Produto> makeProdutos(){
        ArrayList<Produto> dados = new ArrayList();
        
        Produto p = new Produto();
        p.setId(dados.size());
        p.setNome("Caneta");
        p.setDescricao("Marca bic");
        p.setPreco((float) 1.00);
        dados.add(p);        
        
        Produto p2 = new Produto();
        p2.setId(dados.size());
        p2.setNome("Carteira");
        p2.setDescricao("Otima qualidade");
        p2.setPreco((float) 15.00);
        dados.add(p2);
        
        Produto p3 = new Produto();
        p3.setId(dados.size());
        p3.setNome("Notebook");
        p3.setDescricao("Notebook gamer dell");
        p3.setPreco((float) 4000.00);
        dados.add(p3);
        
        return dados;
    }
    
}
