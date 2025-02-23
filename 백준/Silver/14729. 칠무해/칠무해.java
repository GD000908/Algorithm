import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		//Scanner s = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine()); 
		
		
		double[] arr = new double[N];

		double score = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(bf.readLine()); 
		}

		Arrays.sort(arr);

		for (int i = 0; i < 7; i++) {
			System.out.printf("%.3f",arr[i]);
			System.out.println();
		}

	}
}