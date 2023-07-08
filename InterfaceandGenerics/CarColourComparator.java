package InterfaceandGenerics;

import java.util.Comparator;

public class CarColourComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car tcar, Car ocar) {
		// TODO Auto-generated method stub
		return tcar.colour.compareTo(ocar.colour);
	}

}
