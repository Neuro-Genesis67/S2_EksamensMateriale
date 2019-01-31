package a_enkeltrettet_associering;

public class Text {

	// Person 0...* -----> 0...1 Group

	// -Her er det Person klassen der har ansvaret for at opdatere forbindelsen.
	// Person klassen har metoder til at sætte og fjerne sin gruppe. Group klassen
	// kender ikke noget til Person klassen
	//
	// -En enkeltrettet forbindelse kræver færre resourcer end en dobbeltrettet
	// forbindelse, da man ikke er nødsaget til at opdatere begge klasser, når man
	// ændrer på Person klassen.
	//
	// -Ved en enkeltrettet forbindelse er det kun muligt at tilgå Group, gennem
	// Person klassen

	// Husk at nævne package visibility

}
