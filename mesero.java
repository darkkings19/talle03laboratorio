import java.util.ArrayList;
import java.util.List;

public class mesero {
private List<pedido> Pedidos;

public mesero(){
this.Pedidos =new ArrayList<pedido>();
}
public void añadirPedido(){
this.Pedidos.add(new pedido("pollo con arroz","surtida","yoghurt"));
this.Pedidos.add(new pedido("tallarines con salsa","pepino","jalea"));
}
public static void eliminarPedido(String platoPrincipal, String ensalada,String postre){
for(pedido pedido: this.Pedidos){
    if (pedido.getPlatoPrincipal().equals(platoPrincipal) && pedido.getEnsalada().equals(ensalada) && pedido.getPostre().equals(postre)){
    this.Pedidos.remove(pedido);
    break;
    }
}
}
}
