package score;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ScoreImpl implements Score{
	List<ScoreDTO> list = new ArrayList<ScoreDTO>();
	ScoreDAO dao = new ScoreDAO();

	@Override
	public int input(String hak, String name, String str_kor, String str_eng, String str_mat) {
		// 학번 중복검사
		boolean isExist = dao.isExist(hak);
		int result = 0;
		
		if(!isExist) {
			// 형변환 및 연산
			int kor = Integer.parseInt(str_kor);
			int eng = Integer.parseInt(str_eng);
			int mat = Integer.parseInt(str_mat);
			int tot = kor + eng + mat;
			double avg = (double)tot/3;
			
			// dto 저장
			ScoreDTO dto = new ScoreDTO();
			dto.setHak(hak);
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			dto.setTot(tot);
			dto.setAvg(avg);
			
			result = dao.insertDB(dto);
		}
		return result;
	}

	@Override
	public String output() {
		list = dao.printDB();
		String result="학번\t이름\t국어\t영어\t수학\t총점\t평균\n";
		for(int i=0; i<list.size(); i++) {
			ScoreDTO dto = list.get(i);
			result += dto.toString() + "\n";
		}
		return result;
	}

	@Override
	public String searchHak(String hak) {
		ScoreDTO dto = new ScoreDTO();
		dto.setHak(hak);
		list = dao.searchHakDB(dto);
		String result="";
		for(int i=0; i<list.size(); i++) {
			ScoreDTO dto1 = list.get(i);
			result += dto1.toString() + "\n";
		}
		return result;
	}

	@Override
	public String searchName(String name) {
		ScoreDTO dto = new ScoreDTO();
		dto.setName(name);
		
		list = dao.searchNameDB(dto);
		String result="";
		for(int i=0; i<list.size(); i++) {
			ScoreDTO vo = list.get(i);
			result += vo.toString() + "\n";
		}
		return result;
	}

}
