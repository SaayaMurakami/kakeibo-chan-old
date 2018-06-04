import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HouseholdAccount {
	private ArrayList<Statement> statementList; //TODO privateにしたいなぁ
	private Map<Integer, String> categoryMap;
	
	public HouseholdAccount() {
		statementList = new ArrayList<>();
		categoryMap = new HashMap<Integer, String>();
		categoryMap.put(1, "食費");
		categoryMap.put(2, "家賃");
		categoryMap.put(3, "通信費");
		categoryMap.put(4, "交通費");
		categoryMap.put(5, "教育費");
		categoryMap.put(6, "交際費");
		categoryMap.put(7, "娯楽費");
		categoryMap.put(8, "その他");
	}
	
	public void showCategory() {
		for (int key : categoryMap.keySet()) {
			System.out.print(key + categoryMap.get(key) + " ");
		}	
	}
	
	public String getCategory(int categoryNum) {
		return categoryMap.get(categoryNum);
	}

	public void addStatement(Statement statement) { 
		statementList.add(statement);
	}
	
	public void showStatement() {
		for (Statement statement : statementList) {
			System.out.println(statement.getDate() + " " + statement.getCategory() + " "
					+ statement.getAmount() + " " + statement.getMemo());
		}
	}
}
