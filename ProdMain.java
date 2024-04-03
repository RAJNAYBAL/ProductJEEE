package MapProject2;

import java.util.List;
import java.util.Map;

public class ProdMain {

	public static void main(String[] args) {
		ProdInfo pin=new ProdInfo();
		Map<String, List<Products>> pli= pin.insert();
		pin.display(pli);


	}

}
