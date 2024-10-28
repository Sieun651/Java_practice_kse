// //전체
package customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	public boolean write(String path, List<CustomerVO> list) {
		boolean result = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);		//파일만들기 + 파일열기
			oos = new ObjectOutputStream(fos);
			
			oos.writeInt(list.size());				//전체 데이터 개수 출력
			for(int i=0; i<list.size(); i++) {		//객체 출력
				CustomerVO vo = list.get(i);
				oos.writeObject(vo);
			}
			result = true;							//저장성공
			
		} catch (FileNotFoundException e) {
			System.out.println("저장 경로를 찾을 수 없습니다. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 저장 실패 >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 >> " + path);
			//e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();		//파일닫기
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}				
		return result;		
	}
	
	public List<CustomerVO> read(String path) {
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(path);	//파일열기
			ois = new ObjectInputStream(fis);
			
			int num = ois.readInt();			//전체 데이터 개수 읽기
			for(int i=0; i<num; i++) {			//객체 1개씩 읽어와서 리스트에 저장
				CustomerVO vo = (CustomerVO)ois.readObject();
				list.add(vo);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 읽기 실패 >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알 수 없는 에러 >> " + path);
			//e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();		//파일닫기
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
		
		
		return list;
	}
}














