package guviPractice;
import java.util.*;

public class telephoneDirectoryUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashMap<String, String> map =new LinkedHashMap<String,String>();
        for(int i=0;i<n;++i)
        {
            map.put(sc.next(),sc.next());
        }
        int op=sc.nextInt();
        if(op==1)
        {
            String name=sc.next();
            String num=sc.next();
            map.put(name,num);
        }
        else if(op==2)
        {
            String name=sc.next();
            String num=sc.next();
            Iterator<String> itr=map.keySet().iterator();
            while(itr.hasNext())
            {
                String name1=itr.next();
                if(name1.equals(name))
                {
                    map.replace(name1,map.get(name1),num);
                    //map.repl
                }
            }
        }
        else if(op==3)
        {
            String name=sc.next();
            String num=sc.next();
            map.remove(name);
        }
        Iterator<String> itr=map.keySet().iterator();
        while(itr.hasNext())
        {
        	String nam=itr.next();
        	String num=map.get(nam);
        	System.out.println(nam+" "+num);
        	
        }

	}

}
