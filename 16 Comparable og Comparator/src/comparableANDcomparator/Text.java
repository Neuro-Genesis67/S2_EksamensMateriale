package comparableANDcomparator;

public class Text {

	//
	// -En klasse implementerer comparable interfacet.
	// Klassen definerer metoden compareTo som den arver fra interfacet.
	//
	// -Metoden returnerer 1, 0 eller -1. Hvis -1, kømmer elementet før/er mindre,
	// hvis 0 er de ens, hvis 1 kommer den efter/er større
	//
	// -Når et objekt/en klasse, implementerer comparable, er det muligt at bruge
	// collections framework algoritmer, eksempelvis sort.
	//
	// -Lists (and arrays) of objects that implement this interface can be sorted
	// automatically by Collections.sort (and Arrays.sort). Objects that implement
	// this interface can be used as keys in a sorted map or as elements in a sorted
	// set, without the need to specify a comparator.
	//
	// -Comparable is meant for objects with natural ordering which means the object
	// itself must know how it is to be ordered. For example Roll Numbers of
	// students. Whereas, Comparator interface sorting is done through a separate
	// class.
	//
	// -Logically, Comparable interface compares “this” reference with the object
	// specified and Comparator in Java compares two different class objects
	// provided.
	//
	// -If any class implements Comparable interface in Java then collection of that
	// object either List or Array can be sorted automatically by using
	// Collections.sort() or Arrays.sort() method and objects will be sorted based
	// on there natural order defined by CompareTo method.
	//
	// -To summarize, if sorting of objects needs to be based on natural order then
	// use Comparable whereas if you sorting needs to be done on attributes of
	// different objects, then use Comparator in Java.
	//
	// -En smart ting med comparable er at metoden som udgangspunkt skal returnere
	// 1, 0 eller -1. Men man kan i sin return sætning godt returnere f.eks 6. Det
	// bliver fortolket som 1 da det er over 0.
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
}
