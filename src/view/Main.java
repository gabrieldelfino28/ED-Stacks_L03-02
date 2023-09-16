package view;

import controller.PilhaStringController;

public class Main {

	public static void main(String[] args) {
		PilhaStringController ps = new PilhaStringController();

		String vet[] = { "W", "L", "H", "B", "R", "G", "J" };

		ps.CharChanges(vet);

	}

}
