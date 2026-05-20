import java.util.Date;
import java.text.SimpleDateFormat;
public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        System.out.println("A hora do sistema é "+ formatador.format(relogio));
    }
}
