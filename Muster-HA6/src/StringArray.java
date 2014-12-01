
/**
 * Diese Klasse vereinfacht den Umgang mit einem Array, indem
 * sie Methoden implementiert, durch die das Array wachsen kann.
 * 
 * Um die Objektvariablen sowie die internen Hilfsmethoden vor Zugriffen
 * von außen zu schützen, wurden sie als "private" deklariert.
 *
 */
public class StringArray {

	private String[] array;
	
	/**
	 * Die Position, an der das nächste Element, das eingefügt wird,
	 * gespeichert werden soll.
	 */
	private int nextInsert;

	/**
	 * Konstruktor für StringArray, in dem die Größe des
	 * als Parameter übergeben werden kann.
	 * @param initialSize Größe des Arrays
	 */
	public StringArray(int initialSize) {
		array = new String[initialSize];
		nextInsert = 0;
	}
	
	/**
	 * Konstruktor, der mit einem Array initialisiert wird.
	 * @param initialArray Das initiale Array
	 */
	public StringArray(String[] initialArray) {
		array = initialArray;
		nextInsert = initialArray.length;
	}
	
	/**
	 * Default-Konstruktor, ohne Parameter.
	 */
	public StringArray() {
		array = new String[5];
		nextInsert = 0;
	}
	
	/**
	 * Fügt den übergebenen String der Liste
	 * aller Strings hinzu.
	 * @param string
	 */
	public void add(String string) {
		if(noSpaceAvailable()) {
			resizeArray();
		}
		array[nextInsert] = string;
		nextInsert++;
	}
	
	/**
	 * Prüft, ob ein weiterer String eingefügt werden kann,
	 * ohne dass das Array vergrößert werden muss. 
	 * @return true, falls kein Platz vorhanden ist, sonst false
	 */
	private boolean noSpaceAvailable() {
		if(nextInsert == array.length ) {
			return true;
		}
		return false;
	}

	/**
	 * Vergrößert den verfügbaren Platz, indem ein neues Array erzeugt wird,
	 * der Inhalt des alten in das neue kopiert wird, und dieses schließlich 
	 * der Objektvariablen "array" zugewiesen wird.
	 */
	private void resizeArray() {
		String[] neuesArray = new String[array.length*2];
		System.arraycopy(array, 0, neuesArray, 0, array.length);
		array = neuesArray;
	}

	/**
	 * Gibt den String an der mit position referenzierten Stelle zurück.
	 * @param position
	 * @return
	 */
	public String get(int position) {
		return array[position];
	}

	/**
	 * Gibt die Anzahl der Strings, die im Array gespeichert sind, zurück.
	 * @return
	 */
	public int size() {
		return nextInsert;
	}
	
	
	
}
