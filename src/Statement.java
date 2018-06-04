import java.time.LocalDate;

public class Statement {
	LocalDate date; //TODO Privateにしたいなぁ。
	String category;
	int amount;
	String memo;
	
	public void registerdate(LocalDate date) { //TODO 単純に値を設定する処理を行う場合、プログラミングだとsetXXXというメソッドを使うのが良いです。registerでも間違いじゃないのですが、もっと色々処理して登録するようなイメージを抱きます
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
	
	public void removeStatement() { //TODO これは使ってないから、削除しちゃった方が良いですね
		date = null;
		category = null;
		amount = 0;
		memo = null;
	}


}
