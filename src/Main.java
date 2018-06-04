import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		HouseholdAccount householdAccount = new HouseholdAccount();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String answer = null;
			do {
				System.out.println("家計簿ちゃん");
				
				StringBuilder builder = new StringBuilder();
				builder.append("やりたいことを選んでね（数字で選択）");
				builder.append( System.lineSeparator());
				builder.append("1.家計簿をつける  2.家計簿を見る");
				String message = builder.toString();
				
				int num = inputNumber(message, reader);
				
				switch (num) {
				case 1:
					do {
						Statement statement = new Statement();

						int year = inputNumber("年度を入力してください（ex.1998）", reader);
						int month = inputNumber("月を入力してください（ex.9）", reader);
						int date = inputNumber("日付を入してください（ex.16）", reader);
						LocalDate Date = LocalDate.of(year, month, date);
						statement.setDate(Date);	//TODO 入力値のチェック
						
						System.out.println("カテゴリを選んでください（数字で選択）");
						householdAccount.showCategory();
						System.out.println("");
						int catergoryNum = inputNumber("", reader);
						while (catergoryNum < 1 || catergoryNum > 8) {
							System.out.println("1~8の数字で入力してください");
							catergoryNum = inputNumber("", reader);
						}
						statement.setCategory(householdAccount.getCategory(catergoryNum));
						
						int amount = inputNumber("金額を入力してください（ex.500）", reader);
						statement.setAmount(amount);
						
						System.out.println("メモを入力してください");
						String memo = reader.readLine();
						statement.setMemo(memo);
						
						System.out.println("入力内容を確認します");
						System.out.println(statement.getDate() + " " + statement.getCategory() + " "
								+ statement.getAmount() + "円 " + statement.getMemo());
						System.out.println("登録しますか？（はい/いいえ）");
						answer = reader.readLine();
						if (answer.equals("はい")) {
							householdAccount.addStatement(statement);
							System.out.println("登録完了");
							System.out.println("続けて登録しますか？（はい/いいえ）");
							answer = reader.readLine();
						} else if (answer.equals("いいえ")) {
							answer = "はい";
							System.out.println("やり直します");
						}
						else {
							do {
								System.out.println("「はい」か「いいえ」で入力してください");
							} while (answer.equals("はい") || answer.equals("いいえ"));
						}
					} while (answer.equals("はい"));
					break;
				case 2:
					householdAccount.showStatement();
					do {
						System.out.println("参照をやめる場合は「終了」と入力");
						answer = reader.readLine();
					} while (!answer.equals("終了"));
					answer = "いいえ";
					break;
				default:
					break;
				}
			} while (answer.equals("いいえ"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("終了");
	}

	private static int inputNumber(String message, BufferedReader reader) throws IOException {
		if (!message.isEmpty()) {
			System.out.println(message);
		}
		do {
			try {
				return Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください");
			}
		} while (true);
	}
}
