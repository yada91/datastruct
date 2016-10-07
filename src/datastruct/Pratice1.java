package datastruct;

import java.util.Scanner;

public class Pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a;

		System.out.println("행렬크기입력");
		int b = sc.nextInt();
		int c = sc.nextInt();
		a = new int[b][c];

		System.out.println("희소행렬 만들기");
		for (int j = 0; j < a.length; j++) {
			for (int i = (int) (Math.random() * a.length) + 2; i < a[j].length; i += 4) {
				a[j][i] = (int) (Math.random() * 10);
			}
		}
		// 희소행렬 출력
		for (int j = 0; j < a.length; j++) {
			for (int i : a[j]) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 전치연산
		int[][] a1 = preset(a);
		System.out.println("---------------");
		for (int j = 0; j < a1.length; j++) {
			for (int i : a1[j]) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 다시 희소행렬
		int[][] a2 = rePreset(a1);
		System.out.println("---------------");
		for (int j = 0; j < a2.length; j++) {
			for (int i : a2[j]) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static int[][] preset(int[][] a) {

		int x = a.length;
		int y = a[0].length;
		int count = 0;

		// 0이 행렬 갯수
		for (int j = 0; j < a.length; j++) {
			for (int i : a[j]) {
				if (i != 0) {
					count++;
				}
			}
		}
		// 첫 행 초기화
		int[][] b = new int[count + 1][3];
		b[0][0] = x;
		b[0][1] = y;
		b[0][2] = count;

		// 두번째 행이후 값 입력
		int index = 1;
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[0].length; i++) {
				if (a[j][i] != 0) {
					b[index][0] = j;
					b[index][1] = i;
					b[index][2] = a[j][i];
					index++;
				}
			}
		}

		return b;

	}

	public static int[][] rePreset(int[][] a) {

		int[][] b = new int[a[0][0]][a[0][1]];
		int index = a[0][2];

		for (int i = 1; i <= index; i++) {
			b[a[i][0]][a[i][1]] = a[i][2];
		}

		return b;
	}
}
