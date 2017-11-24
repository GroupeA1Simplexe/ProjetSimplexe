package exceptions;

public class IndiceListeDepasseException extends Exception{

	public IndiceListeDepasseException() 
	{
		super("L'indice endodé est trop grand");
	}
}
