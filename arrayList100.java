import java.util.ArrayList;
import java.util.Iterator;


public class arrayList100 {
	static int i;
	
	public static void main(String[]s){
		ArrayList array=new ArrayList();
		for( i=0;i<100;i++){
			array.add(i);
		}
		
		Iterator itr=array.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
