import java.rmi.RemoteException;

import com.netroxtech.webservice.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bonjour");
		HelloProxy h = new HelloProxy();
		try {
			System.out.println(h.sayHello("Xavier"));
			h.list();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
