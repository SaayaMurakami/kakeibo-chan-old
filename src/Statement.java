import java.time.LocalDate;

public class Statement {
	LocalDate date;
	String category;
	int amount;
	String memo;
	
	public void registerdate(LocalDate date) {
		this.date = date;
	}
	
	public void registerCategory(String category) {
		this.category = category;
	}
	
	public void registerAmount(int amount) {
		this.amount = amount;
	}
	
	public void registerMemo(String memo) {
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
	
	public void removeStatement() {
		date = null;
		category = null;
		amount = 0;
		memo = null;
	}


}
