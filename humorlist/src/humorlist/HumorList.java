package humorlist;

public class HumorList {

	private String title;
	private String writer;
	private int sequence;
	private int hits;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getHits() {
		//hits = hits + 1;
		return hits;
		
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

}
