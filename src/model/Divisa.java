package model;

/**
 * @author T13932
 *
 */
public class Divisa {
	
	private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private Rates rates;
    
    
	public Divisa(String disclaimer, String license, long timestamp, String base, Rates rates) {
		this.disclaimer = disclaimer;
		this.license = license;
		this.timestamp = timestamp;
		this.base = base;
		this.rates = rates;
	}


	public String getDisclaimer() {
		return disclaimer;
	}


	public String getLicense() {
		return license;
	}


	public long getTimestamp() {
		return timestamp;
	}


	public String getBase() {
		return base;
	}


	public Rates getRates() {
		return rates;
	}


	
    
    
    
    
    

}
