
public class VokalZaehler {
	
	
	public Integer zaehleVokale(String zeichenKette) {
		zeichenKette = zeichenKette.toLowerCase();
		Integer aktuellePosition = 0;
		Integer letztePosition = zeichenKette.length()-1;
		Integer anzahlVokale = 0;
		
		while(aktuellePosition <= letztePosition) {
			Character buchstabe = zeichenKette.charAt(aktuellePosition);
			if(buchstabe == 'a') {
				anzahlVokale++;
			} else if (buchstabe == 'e') {
				anzahlVokale++;
			} else if (buchstabe == 'i') {	// Nat�rlich ist diese L�sung
				anzahlVokale++;				// sehr unsch�n - da wir aber
			} else if (buchstabe == 'o') {	// zu diesem Zeitpunkt noch
				anzahlVokale++;				// keine Aussagenlogik o.�. benutzt haben,
			} else if (buchstabe == 'u') { 	// ist die eine der m�glichen
				anzahlVokale++;				// "Notl�sungen".
			}
			aktuellePosition++;
		}
		
		System.out.println("Anzahl aller Vokale in '" + zeichenKette + "': " + anzahlVokale);
		return anzahlVokale;
	}
	
	
}
