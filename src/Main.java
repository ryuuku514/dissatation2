
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// generating tuple objects
		// list<Tuple>;
		
		
		ArrayList<Tuple> list = new ArrayList<Tuple>();
		for(int i = 1; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
				list.add(new Tuple(i,j));

			}

		}

	

	}
}
