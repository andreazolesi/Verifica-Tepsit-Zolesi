/**
 * 
 */

/**
 * @author zolesi
 *
 */
public class News {

	public String iD;
	public String titolo;
	public String contenuto ;
	public String commento;
	
	public News(String iD, String titolo, String contenuto, String commento) 
	{
		//costruttore di parametrizzato
		this.iD = iD;
		this.titolo = titolo;
		this.contenuto = contenuto;
		this.commento = commento;
	}
	
	public News() 
	{
		//costruttore di default
	}
	
	public News(News n) 
	{
		//costruttore di copia
		this.iD = n.iD;
		this.titolo = n.titolo;
		this.contenuto = n.contenuto;
		this.commento = n.commento;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	@Override
	public String toString() {
		return "News [iD=" + iD + ", titolo=" + titolo + ", contenuto=" + contenuto + ", commento=" + commento + "]";
	}

	
	
	
	
}
