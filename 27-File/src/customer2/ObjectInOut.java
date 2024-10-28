package customer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	public boolean write(String path, List<CustomerVO> list, String encType) {
		boolean result = false;	// true : 저장 성공, false : 저장 실패
		String content = "";
		
		// 리스트에 저장된 데이터를 csv 형식의 문자열로 변경
		for(int i=0; i<list.size(); i++) {
			CustomerVO vo = list.get(i);
			String str = String.format("%s,%s,%s\n", vo.getCus_Num(), vo.getName(), vo.getPhone());
			content += str;
		}
		
		// byte[] 배열로 변경
				byte[] buffer = null;
				try {
					buffer = content.getBytes(encType); 	
				} catch (UnsupportedEncodingException e) {
					System.out.println("[ERROR] 엔코딩 지정 에러");
					return false;	//강제종료
					//e.printStackTrace();
				}		
				// 파일 저장
				OutputStream out = null;	//try밖에서도 사용할 수 있게 밖에 입력	
				try {
					 out = new FileOutputStream(path);	//파일만들기 + 파일열기
					 out.write(buffer);		//파일출력
					 result = true;			//여기까지 코드가 진행되었다면, 저장 성공
					 System.out.println("[INFO] 파일 저장됨 >> " + path);
				} catch (FileNotFoundException e) {
					System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
					//e.printStackTrace();
				} catch (IOException e) {
					System.out.println("[ERROR] 저장에 실패했습니다.");
					//e.printStackTrace();
				} catch (Exception e) {
					System.out.println("[ERRPR] 알 수 없는 에러가 발생했습니다.");
					//e.printStackTrace();
				} finally {
					try {
						if(out != null) out.close();	// 파일닫기
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		return result;
	}
	
	public List<CustomerVO> read(String path, String encType) {
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		// 읽은 내용이 저장될 byte 배열
		byte[] data = null;
		// byte배열에 저장된 데이터를 문자열 변경해서 저장할 변수
		String content = null;
		
		// 파일 읽기
		InputStream in = null;
		try {
			in = new FileInputStream(path);		// 1. 파일 열기(독점)
			// 문자열 데이터를 저장할 byte 배열 생성
			// in.available() : 파일의 크기를 읽어오는 함수
			data = new byte[in.available()];	// 2. 파일의 크기만큼 배열 생성
			// 3. 읽어와서 저장하기(입력)
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			data = null;	// 예외가 발생했기 때문에 다시 초기화 시킴
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			data = null;	// 예외가 발생했기 때문에 다시 초기화 시킴
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
		} finally {
			try {
				if(in != null) in.close();	// 4. 파일 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 5. byte 배열에 저장된 데이터를 문자열(일반데이터)로 변경
		if(data != null) {
			try {
				content = new String(data, encType);
				//System.out.println(content);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] 인코딩 지정 에러");
				//e.printStackTrace();
			}
		}
		
		// csv 데이터를 객체로 분리해서 리스트에 저장
		String[] str = content.split("\n");
		System.out.println(str.length + "개");
		for(int i=0; i<str.length; i++) {
			String[] result = str[i].split(",");
			CustomerVO vo = new CustomerVO();
			vo.setCus_Num(result[0]);
			vo.setName(result[1]);
			vo.setPhone(result[2]);
			//리스트에저장
			list.add(vo);
		}

		return list;
		//중간과정에서 에러 발생시 content값이 리턴되지 않도록 null값으로 초기화해줘야함
	}
}














