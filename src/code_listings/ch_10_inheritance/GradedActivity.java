package code_listings.ch_10_inheritance;

public class GradedActivity {
	private double score;

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrades() {
		char letter = ' ';
		
		if(this.score >= 90) {
			letter = 'A';
		}else if(this.score >= 80) {
			letter = 'B';
		}else if(this.score >= 70) {
			letter = 'C';
		}else if(this.score >= 60) {
			letter = 'D';
		}else {
			letter = 'F';
		}
		
		return letter;
	}
}
