package utd.persistentDataStore.datastoreClient;

public class ClientException extends Exception
{
	public ClientException(String msg)
	{
		super(msg);
	}

	public ClientException(String msg, Throwable ex)
	{
		super(msg, ex);
	}

}
