package utd.persistentDataStore.datastoreServer;

import static org.junit.Assert.assertEquals;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import utd.persistentDataStore.datastoreClient.ObjectstoreClient;
import utd.persistentDataStore.datastoreClient.ObjectstoreClientImpl;

public class ObjectstoreClientTestCase
{
	byte byteAddr[] = { 127, 0, 0, 1 };
	int port = 10023;

	@Test
	public void testWrite() throws Exception
	{
		InetAddress address = InetAddress.getByAddress(byteAddr);
		ObjectstoreClient osClient = new ObjectstoreClientImpl(address, port);

		List<String> data = generateData(100);
		osClient.writeObject("listData", data);
	}

	@Test
	public void testRead() throws Exception
	{
		InetAddress address = InetAddress.getByAddress(byteAddr);
		ObjectstoreClient osClient = new ObjectstoreClientImpl(address, port);

		List<String> data = generateData(100);
		osClient.writeObject("listData", data);

		List<String> dataIn = (List<String>)osClient.readObject("listData");
		assertEquals(100, dataIn.size());
	}

	private List<String> generateData(int size)
	{
		List<String> data = new ArrayList<String>();
		for(int idx = 0; idx < size; idx++) {
			data.add("Now is the time for all good men " + idx);
		}
		return data;
	}
}
