package Org.Creators.MovieBuff;

public class MovieBuff {
	private float review;
	private int reviewer;
	public MovieBuff(float code, int reviewer) {
		super();
		this.review = code;
		this.reviewer = reviewer;
	}
	public float getReview() {
		return review;
	}
	public void setReview(float review) {
		this.review = review;
	}
	public int getReviewer() {
		return reviewer;
	}
	public void setReviewer(int reviewer) {
		this.reviewer = reviewer;
	}
	@Override
	public String toString() {
		return "MovieBuff [review=" + review + ", reviewer=" + reviewer + "]";
	}
	
	
}
