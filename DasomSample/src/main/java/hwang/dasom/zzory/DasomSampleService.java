package hwang.dasom.zzory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DasomSampleService {
	
	/*DasomSampleDao dsdao;
	public List<DasomSample> getSample(){
		dsdao = new DasomSampleDao();
		List<DasomSample> list = dsdao.dsselect();
		System.out.println(list+"<==list Service.java�� getSample�޼ҵ�");
		
		return list;
	}*/
	
	/*String a;
	public String getDSample() {
		DasomSampleDao dsdao2 = new DasomSampleDao();
		a = dsdao2.selectGroupName();
		System.out.println(a+"<== a Service�� getDSample�޼ҵ� ���ϰ�");
		
		return a;
	}*/
	String we;
	List<DasomSample> list;
	
	public Map<String, Object> dssample(){
		DasomSampleDao dsdao = new DasomSampleDao();
		we = dsdao.selectGroupName();
		list = dsdao.dsselect();
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("list",list);
		map.put("we", we);
		return map;
	}
}
