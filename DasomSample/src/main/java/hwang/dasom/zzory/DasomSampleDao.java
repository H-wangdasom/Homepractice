package hwang.dasom.zzory;

import java.util.ArrayList;
import java.util.List;

public class DasomSampleDao {
	public String selectGroupName() {
		
		return "�츮����";
	}
	public List<DasomSample> dsselect(){
		List<DasomSample> list= new ArrayList<DasomSample>();
		
		DasomSample ds1 = new DasomSample();
		ds1.setNumber(1);
		ds1.setName("�ټ�");
		ds1.setAge(26);
		list.add(ds1);
		
		DasomSample ds2= new DasomSample();
		ds2.setNumber(2);
		ds2.setName("����");
		ds2.setAge(24);
		list.add(ds2);
		
		DasomSample ds3= new DasomSample();
		ds3.setNumber(3);
		ds3.setName("����");
		ds3.setAge(28);
		list.add(ds3);
		
		DasomSample ds4= new DasomSample();
		ds4.setNumber(4);
		ds4.setName("����");
		ds4.setAge(26);
		list.add(ds4);
		
		DasomSample ds5= new DasomSample();
		ds5.setNumber(5);
		ds5.setName("���");
		ds5.setAge(20);
		list.add(ds5);
		
		System.out.println(list +"<==list Dao.java�� dsselect�޼ҵ�");
		return list;
	}
}
