package xiancheng.jiekou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {
	public static void main(String[] args) {
	/*List list=new ArrayList(100000);
	list.add(1);
	list.add(2);
	list.add("a");
	list.add("b");
	System.out.println(list.contains("a"));*/
	//如果接着 增加的话，不会报错
	//list.add(4, 6);
	//System.out.println(list.get(2));
	//这两种for循环都行
	/*for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}*/
	//list.remove(2);
	/*for(Object obj:list) {
		System.out.println(obj);
	}*/
	System.out.println("---------------------------");
	Map map=new HashMap();
	map.put("a", "abc");
	map.put("b", "efg");
	map.put("c", "hjk");
	map.put(1, "a");
	map.put(2, "b");
	map.put(3, 9);
	map.put(1, "d");
	map.remove("b");
	
	//System.out.println(map.containsKey("a"));
	System.out.println(map.containsValue("abc"));
	/*System.out.println(map.get("b"));
	System.out.println(map.get(1));
	System.out.println(map.get(3));
	System.out.println(map.get(1));*/
	Set set=map.keySet();
	for(Object key:set) {
		System.out.println(map.get(key));
	}
	
}
}
