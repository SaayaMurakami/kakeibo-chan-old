import java.time.LocalDate;

public class Statement {
	private LocalDate date; 
	private String category;
	private int amount;
	private String memo;
	
	public void setDate(LocalDate date) { 
		this.date = date;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getMemo() {
		return memo;
	}
}
