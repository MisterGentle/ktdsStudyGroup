package humorlist;

import java.util.ArrayList;
import java.util.List;

	/**
	 * 게시판 기능 서비스
	 * @author User
	 *
	 */
public class HumorListHandler {
	
	/**
	 * 게시글 목록
	 */
	private List<HumorList> humorList = new ArrayList<>();

	/**
	 * 게시글 등록
	 * @param title
	 * @param writer
	 * @param sequence
	 * @param hits
	 */
	public void create(String title, String writer, int sequence, int hits) {
		HumorList humor = new HumorList();
		humor.setTitle(title);
		humor.setWriter(writer);
		humor.setSequence(sequence);
		humor.setHits(hits);
		humorList.add(humor);
	}

	public void update(int index, String title) {
		HumorList humor = humorList.get(index);
		humor.setTitle(title);
	}

	public void delete(int index) {
		humorList.remove(index);
	}

	public void read(int index) {
		if(humorList.size() <= index) {
			System.out.println(index + "번 게시글은 존재하지 않습니다.");
			return;
		}
		
		HumorList humor = humorList.get(index);
		int hits = humor.getHits();
		hits++;
		humor.setHits(hits);
		
		System.out.println("제목: " + humor.getTitle());
		System.out.println("작성자: " + humor.getWriter());
		System.out.println("순서: " + humor.getSequence());
		System.out.println("조회수: " + humor.getHits());
	}
	
	

	public static void main(String[] args) {
		HumorListHandler handler = new HumorListHandler();

		handler.create("백종원 시장 근황", "개드립", 1, 32);
		handler.create("퇴근길 지하철 만담.jpg", "조태용", 2, 12);
		handler.create("이번 설날에 온 가족이 경찰서 갔다옴", "아무개", 3, 0);

		handler.read(0);
		handler.read(1);
		handler.read(2);

		handler.update(2, "이 세상에 존재해선 안될 물건.jpg");
		handler.read(2);

		handler.delete(2);

		handler.read(0);
		handler.read(1);
		handler.read(2);
	}

}
