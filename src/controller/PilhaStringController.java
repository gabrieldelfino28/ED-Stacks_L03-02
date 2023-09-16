package controller;

import model.AnyStack;

public class PilhaStringController {

	public PilhaStringController() {
		// TODO Auto-generated constructor stub
		super();
	}

	AnyStack<String> p = new AnyStack<String>();
	AnyStack<String> aux = new AnyStack<String>();
	AnyStack<String> pFinal = new AnyStack<String>();

	public void CharChanges(String[] vet) {
		for (int i = 0; i < vet.length; i++) {
			p.push(vet[i]);
		}

		try {
			while (p != null) {
				switch (p.top()) {
				case "J":
					aux.push("K");
					p.pop();
					break;
				case "R":
					System.out.println(p.top());
					aux.push("M");
					p.pop();
					break;
				case "H":
					p.pop();
					break;
				case "W":
					System.out.println(p.top());
					p.pop();
					break;
				default:
					aux.push(p.pop());
				}
			}

		} catch (Exception e) {
			// End of stack p
			try {
				while (aux != null) {
					pFinal.push(aux.pop());
				}
			} catch (Exception e1) {
				// End of stack aux

				System.out.println("\nContent of the new pile: \n");
				try {
					while (pFinal != null) {
						
						System.out.println(pFinal.pop());
					}
				} catch (Exception e2) {
					// End of stack pFinal
				}
			}
		}
	}

}
