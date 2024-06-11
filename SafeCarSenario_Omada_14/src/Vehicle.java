
public class Vehicle {
	private String marka;
	private String modelo;
	private String pinakida;
	private String etos;

	private String arithmos_plaisiou;
	
	public Vehicle(String marka, String modelo, String pinakida,String etos, String arithmos_plaisiou) {
		this.marka = marka;
		this.modelo = modelo;
		this.etos = etos;
		this.pinakida = pinakida;
		this.arithmos_plaisiou = arithmos_plaisiou;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPinakida() {
		return pinakida;
	}

	public void setPinakida(String pinakida) {
		this.pinakida = pinakida;
	}

	public String getArithmos_plaisiou() {
		return arithmos_plaisiou;
	}

	public void setArithmos_plaisiou(String arithmos_plaisiou) {
		this.arithmos_plaisiou = arithmos_plaisiou;
	}

	public String getEtos() {
		return etos;
	}

	public void setEtos(String etos) {
		this.etos = etos;
	}
	
	
}
