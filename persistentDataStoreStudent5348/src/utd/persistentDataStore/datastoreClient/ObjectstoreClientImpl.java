package utd.persistentDataStore.datastoreClient;

import java.net.InetAddress;

import org.apache.log4j.Logger;

public class ObjectstoreClientImpl extends DatastoreClientImpl implements ObjectstoreClient
{
	private static Logger logger = Logger.getLogger(ObjectstoreClientImpl.class);

	public ObjectstoreClientImpl(InetAddress address, int port)
	{
		super(address, port);
	}

    /* (non-Javadoc)
	 * @see utd.persistentDataStore.datastoreClient.ObjectstoreClient#writeObject(java.lang.String, java.lang.Object)
	 */
    @Override
    public void writeObject(String name, Object object) throws ClientException
    {
		logger.debug("Executing WriteObject Operation");
    }
    
    /* (non-Javadoc)
	 * @see utd.persistentDataStore.datastoreClient.ObjectstoreClient#readObject(java.lang.String)
	 */
    @Override
    public Object readObject(String name) throws ClientException
    {
		logger.debug("Executing ReadObject Operation");
		return null;
    }

}
