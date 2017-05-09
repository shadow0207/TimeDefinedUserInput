import java.util.Scanner;

public class PatternOne {
	static int start = 0;
	static int end = 0;
	static boolean flag = true;

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		end=sc.nextInt();
		int n = end*2-1;
		int count = 1;
		for (int j = start; (flag) ? j < end : j >= end;) {
			count = j + 1;
			if (j % 2 == 0) {
				for (int i = 0; i < n; i++) {
					if (count > 7)
						break;
					if (i % 2 == 0 && i >= j) {
						System.out.print(count);
						count++;
					} else if (i % 2 != 0 || i < j) {
						System.out.print(" ");
					}

				}

			} else {
				for (int i = 0; i < n; i++) {
					if (count > 7)
						break;
					if (i % 2 == 0 || i < j) {
						System.out.print(" ");

					} else {
						System.out.print(count);
						count++;
					}

				}

			}
			if (j != end - 1)
				System.out.println();
			if (flag)
				j++;
			else
				j--;

			if (j == end - 1) {

				start = end-2;
				end = 0;
				flag = false;

			}

		}
	}
}
