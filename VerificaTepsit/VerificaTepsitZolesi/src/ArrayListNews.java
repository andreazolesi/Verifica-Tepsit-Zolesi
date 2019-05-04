import java.util.ArrayList;

/**
 * 
 */

/**
 * @author zolesi
 *
 */
public class ArrayListNews {

	private ArrayList<News> list;

	public ArrayListNews(/*ArrayList<News> list*/) 
	{
		list = new ArrayList<News>(100);
		this.list = list;
	}
	
	public void addNews(News n)
	{
		list.add(n);
	}

	public boolean CreaNuovaNews(String iD, String titolo, String contenuto, String commento)
	{
		News n = new News( iD,  titolo,  contenuto, commento);
		list.add(n);
		return true;
	}
	
	public boolean rimuoviNews(String id)
	{
		
		for(News news : list)
		{
			if(news.getiD().compareTo(id)==0)
			{
				list.remove(news);
				return true ;
			}
		}
		return false;
	}
	
	public String ricercaNews(String id)
	{
		
		for(News news : list)
		{
			if(news.getiD().compareTo(id)==0)
			{
				return news.toString() ;
			}
		}
		return null ;
	}
	
	/*public String modificaCommento(String id)
	{
		for(News news : list)
		{
			if(news.getiD().compareTo(id)==0)
			{
				
			}
		}
		return null;
	}
	*/


	@Override
	public String toString() {
		return "" + list +"]";
	}
	
	
}
