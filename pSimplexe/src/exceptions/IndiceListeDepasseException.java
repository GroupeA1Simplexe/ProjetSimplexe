package exceptions;

public class IndiceListeDepasseException extends Exception{

	public IndiceListeDepasseException() 
	{
		super("L'indice endod� est trop grand");
	}
}
