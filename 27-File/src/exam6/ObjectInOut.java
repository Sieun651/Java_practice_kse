package exam6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

// 객체에 저장된 데이터를 파일로 입출력
public class ObjectInOut {
	// 파일 저장
	// => 리스트에 저장된 객체를 파일에 저장
	public boolean write(String path, List<StudentVO> list) {
		boolean result = false;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);	// 출력 클래스
			oos = new ObjectOutputStream(fos);	// 보조 스트림 클래스
			// 1) 리스트에 저장된 데이터의 개수 저장
			oos.writeInt(list.size());
			// 2) 리스트에 저장된 객체를 저장
			for(int i=0; i<list.size(); i++) {
				StudentVO vo = list.get(i);
				oos.writeObject(vo);
			}
			// 파일 저장 성공 여부 저장
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[EOORO] 파일 저장 실패 >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
		} finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;	// true : 저장 성공, false : 저장 실패
	}
	
	// 파일 읽기
	// => 파일에 저장된 객체를 읽어와서 리스트에 저장
	public List<StudentVO> read(String path) {
		List<StudentVO> list = new ArrayList<StudentVO>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			// 데이터 개수 읽어오기
			int num = ois.readInt();
			// 객체를 읽어와서 리스트에 저장
			for(int i=0; i<num; i++) {
				// 파일에서 객체 1개 데이터 읽어오기
				StudentVO vo = (StudentVO) ois.readObject();
				// 리스트에 저장
				list.add(vo);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
			//e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
