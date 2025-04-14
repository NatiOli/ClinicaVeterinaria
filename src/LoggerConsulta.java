import java.util.HashMap;

public class LoggerConsulta {
	  private static LoggerConsulta instancia;
	  
	  private LoggerConsulta() {
	    }
	  
	  public static LoggerConsulta getInstance() {
	        if (instancia == null) {
	            instancia = new LoggerConsulta();
	        }
	        return instancia;
	    }
	  
	  public void log(String mensagem) {
		  System.out.println("[CONSULTA LOG]" + mensagem);
	  }
}
