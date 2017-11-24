package exceptions;


public class IndiceNegatifException extends Exception{

	public IndiceNegatifException()
	{
		super("L'indice est négatif");
	}
}
