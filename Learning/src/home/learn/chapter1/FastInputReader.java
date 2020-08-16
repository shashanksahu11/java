package home.learn.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastInputReader {
	static class FastReader {
		BufferedReader bufferedReader;
		StringTokenizer stringTokenizer;

		public FastReader() {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
				try {
					stringTokenizer = new StringTokenizer(bufferedReader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return stringTokenizer.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = bufferedReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		System.out.println("Enter number of items");
		int nnumberOfInputs = fastReader.nextInt();
		System.out.println("Enter values");
		StringBuilder builder = new StringBuilder();
		while (nnumberOfInputs-- > 0) {
			builder.append(fastReader.nextLine());
		}
		System.out.println(builder.toString());
	}
}
