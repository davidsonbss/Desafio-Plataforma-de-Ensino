package entities;

public class Task extends Lesson{

	private String Description;
	private Integer questionCount;
	
	public Task() {
		super();
	}
	
	public Task(String title, String description, Integer questionCount) {
		super(title);
		Description = description;
		this.questionCount = questionCount;
	}
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	@Override
	public Integer duration() {
		return questionCount * 5 * 60;
	}
	
}
