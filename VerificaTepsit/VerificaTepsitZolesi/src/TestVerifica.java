/**
 * 
 */

/**
 * @author zolesi
 *
 */
import java.util.Scanner;
public class TestVerifica {

		private static int scelta;
		private static Scanner s;
		private static News n;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			s = new Scanner (System.in);
			String id = null ;
			String titolo = null ;
			String contenuto = null ;
			String commento = null; 
				
			ArrayListNews aln = new ArrayListNews(/*null*/);
			n = new News();
			

			System.out.println("Quante news si volgiono inserire?");
			int dim=s.nextInt();
			
			for (int i = 0; i< dim ; i++)
			{
				System.out.println("inserire l'id della news:");
				id = s.next();
				System.out.println("inserire il titolo della news:");
				titolo = s.next();
				System.out.println("inserire il contenuto della news :");
				contenuto = s.next();
				System.out.println("inserire un commento allaa news :");
				commento = s.next();
				aln.addNews(new News(id,titolo,contenuto, commento));

				System.out.println(aln.toString());
			}	
			
			System.out.println(" Inserire un numero per accedere al menù:");
			System.out.println(" Il numero 0 corrisponde all' aggiunta di una nuova news:");
			System.out.println(" Il numero 1 corrisponde al elenco di tutte le news presenti:");
			System.out.println(" Il numero 2 corrisponde alla rimozione di una news mediante il suo id:");
			System.out.println(" Il numero 3 corrisponde alla ricerca di una news mediante il suo id:");
			System.out.println(" Il numero 4 corrisponde al elenco di tutte le news rimandenti dopo l'eliminazione:");
			System.out.println(" Un numero diverso da 0,1,2,3 e 4 per uscire dal menù:");
			
			do
			{
				scelta = s.nextInt();
				switch (scelta)
				{
				
				case 0 :
					System.out.println("Funzionalità di aggiunta di una nuova news:");
					System.out.println("Quante news si volgiono inserire?");
					dim=s.nextInt();
					
					for (int i = 0; i< dim ; i++)
					{
						System.out.println("inserire l'id della news:");
						id = s.next();
						System.out.println("inserire il titolo della news:");
						titolo = s.next();
						System.out.println("inserire il contenuto della news :");
						contenuto = s.next();
						System.out.println("inserire un commento allaa news :");
						commento = s.next();
						aln.addNews(new News(id,titolo,contenuto, commento));

						System.out.println(aln.toString());
					}
					System.out.println("news aggiunta correttamente"+"\n"+"Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 1 :
					System.out.println("Elenco di tutte le news pubblicate:");
					System.out.println(aln.toString());
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 2:
					System.out.println("Rimozione di una news mediante il id:"+"\n"+"inerire l' id della news da rimuovere:");
					id = s.next();
					aln.rimuoviNews(id);
					System.out.println("news rimossa:");
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 3:
					System.out.println("Ricerca di una news mediante il suo id:"+"\n"+"inerire l' id della news da ricercare:");
					id = s.next();
					System.out.println(aln.ricercaNews(id));
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				case 4:
					System.out.println("Elenco di tutte le news rimanenti nella collection dopo l'eventuale rimozione:");
					System.out.println(aln.toString());
					System.out.println("Inserire un nuovo numero per accedere nuovamente nel menù:");
					break;
					
				default :
					System.out.println("Se si vuole uscire dal menù premere un tasto diverso da 0,1,2,3 o 4");
					scelta = s.nextInt();
					break;
				}
				
			}while(scelta == 0 || scelta == 1 || scelta ==2 || scelta == 3 || scelta == 4);
		
			System.out.println("Siete usciti dal menù grazie e buona giornata");

		}
		}

