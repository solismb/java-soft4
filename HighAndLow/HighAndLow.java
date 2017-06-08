import java.util.Scanner;
import java.util.InputMismatchException;

public class HighAndLow {
	public static void main(String[] args) {
		int count = 0, digit, ans, guess = 0;
		double temp = 0.0;
		boolean r, success = false, flag = true;

		int len = args.length;

		// 引数が2つ以上の場合終了
		if (len > 1 || len == 0) {
			System.out.println("Error! Please check the arguments.");
			System.exit(1);
		}
		
		digit = Integer.parseInt(args[0]);
			
		// 例えば桁数が2の場合, 10 ~ 99の乱数が欲しい
		// Math.random() は0.00~ から 0.99~ までの値がランダムに返る
		// 0.1 未満の値が返った場合, 整数にする過程で 10 未満の数となってしまう
		// 以上のことは桁数が3以上の場合でも当てはまる
		// これを防ぐために, 整数に変換する前に 0.1 未満が生成されるとやり直す
		do {
			r = false;
			temp = Math.random();
			if (digit >= 2 && temp < 0.1)
				r = true;
		} while (r);

		ans = (int)(temp * Math.pow(10, digit));
		Scanner in = new Scanner(System.in);

		//System.out.println("Ans: " + ans);

		do {
			// 以下while文エラー入力処理
			while (success == false) {
				try {
					System.out.print("Guess: ");
					guess = in.nextInt();
					
					success = true;
				} catch(InputMismatchException e) {
					System.out.println("Error! Illegal input.");
					in.nextLine();  // 残っている入力ストリーム読み飛ばし
				}
			}
			
			if (guess > ans) {
				System.out.println("HIGH");
			} else if (guess < ans) {
				System.out.println("LOW");
			} else {
				System.out.println("BINGO!");
				flag = false;
			}

			if (success == true)  // Illegal input ならカウントしない
				count++;
			success = false;
		} while(flag);
		
		System.out.println("You've answered " + count + " times.");
	}
}
