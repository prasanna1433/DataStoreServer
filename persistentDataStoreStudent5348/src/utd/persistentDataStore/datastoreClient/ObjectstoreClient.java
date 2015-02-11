package utd.persistentDataStore.datastoreClient;

public interface ObjectstoreClient
{
	void writeObject(String name, Object object) throws ClientException;

	Object readObject(String name) throws ClientException;
}