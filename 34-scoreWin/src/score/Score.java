package score;

public interface Score {
	public int input(String hak, String name, String str_kor, String str_eng, String str_mat);
	public String output();
	public String searchHak(String hak);
	public String searchName(String name);
}
