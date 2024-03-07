package jungleJumble_java;

import java.util.Scanner;

public class xanoXsAndOs {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[][] tabuleiro = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		String player = "X";
		int linha, coluna;

		System.out.println("-----------------------------------------------------------");
		System.out.println("---------------------- seja bem vindo ---------------------");
		System.out.println("---------------------------- ao ---------------------------");
		System.out.println("------------------------ xanoXsAndOs ----------------------");
		System.out.println("-----------------------------------------------------------");

		while (true) {

			System.out.println("  0    1   2");
			System.out.println("0 " + tabuleiro[0][0] + "  |" + tabuleiro[0][1] + "  |" + tabuleiro[0][2]);
			System.out.println("  ---+---+---");
			System.out.println("1 " + tabuleiro[1][0] + "  |" + tabuleiro[1][1] + "  |" + tabuleiro[1][2]);
			System.out.println("  ---+---+---");
			System.out.println("2 " + tabuleiro[2][0] + "  |" + tabuleiro[2][1] + "  |" + tabuleiro[2][2]);

			System.out.println("Vez do jogador " + player + ".");
			System.out.print("Digite a linha: ");
			linha = leia.nextInt();
			System.out.print("Digite a coluna: ");
			coluna = leia.nextInt();

			if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != " ") {
				System.out.println("Jogada inválida.");
				continue;
			}
			tabuleiro[linha][coluna] = player;

			if (tabuleiro[0][0] == player && tabuleiro[0][1] == player && tabuleiro[0][2] == player
					|| tabuleiro[1][0] == player && tabuleiro[1][1] == player && tabuleiro[1][2] == player
					|| tabuleiro[2][0] == player && tabuleiro[2][1] == player && tabuleiro[2][2] == player
					|| tabuleiro[0][0] == player && tabuleiro[1][0] == player && tabuleiro[2][0] == player
					|| tabuleiro[0][1] == player && tabuleiro[1][1] == player && tabuleiro[2][1] == player
					|| tabuleiro[0][2] == player && tabuleiro[1][2] == player && tabuleiro[2][2] == player
					|| tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player
					|| tabuleiro[0][2] == player && tabuleiro[1][1] == player && tabuleiro[2][0] == player) {
				System.out.println("Jogador " + player + " venceu!");
				break;
			}

			if (player == "X") {
				player = "O";
			} else {
				player = "X";
			}
		}
		leia.close();
	}
}
