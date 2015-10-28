import java.util.ArrayList;
import java.util.Iterator;


public class arrayList10000 {
	
	static int i;

	public static void main(String[] args) {
		ArrayList array=new ArrayList();
		for( i=0;i<10000;i++){
			array.add(i);
		}
		
		Iterator itr=array.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}

}
