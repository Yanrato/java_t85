package aula_03_condicionais;

import java.util.Scanner;

public class Exe04Ls1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("***Que animal é esse?***");

		System.out.println("Primeiro me diga... Seu animal é um Vertebrado ou um Invertebrado? ");
		String invVer = leia.next();

		if (invVer.equalsIgnoreCase("Invertebrado")) {
			System.out.println("Invertebrado né?... Agora me diga é um animal Inseto ou Anelideo? ");
			String insAne = leia.next();

			if (insAne.equalsIgnoreCase("Inseto")) {
				System.out.println("Inseto ne?... Agora me diga é um animal Hematofago ou Herbivoro? ");
				String hemHer = leia.next();
				
				if (hemHer.equalsIgnoreCase("Hematofago")) {
					System.out.println("Hematofago né?... Entao deve ser uma Pulga! ");
			} else {
					System.out.println("Herbivoro né?... Entao deve ser uma Lagarta! ");
			}
			} else {
				System.out.println("Anelideo ne?... Agora me diga é um animal Hematofago ou Onivoro? ");
				String hemOni = leia.next();
				
				if (hemOni.equalsIgnoreCase("Hematofago")) {
					System.out.println("Hematofago né?... Entao deve ser uma Sanguessuga! ");
			} else {
					System.out.println("Onivoro né?... Entao deve ser uma Minhoca! ");
			}
			}

		} else if (invVer.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Vertebrado né?... Agora me diga é um animal Ave ou Mamifero? ");
			String aveMam = leia.next();
			
			if (aveMam.equalsIgnoreCase("Ave")) {
				System.out.println("Ave ne?... Agora me diga é um animal Carnivoro ou Onivoro? ");
				String carOni = leia.next();
				
				if (carOni.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Carnivoro né?... Entao deve ser uma Aguia! ");
			} else {
					System.out.println("Onivoro né?... Entao deve ser uma Pomba! ");
			}
			} else {
				System.out.println("mamifero ne?... Agora me diga é um animal Onivoro ou Herbivoro? ");
				String hemOni = leia.next();
				
				if (hemOni.equalsIgnoreCase("Onivoro")) {
					System.out.println("onivoro né?... Entao deve ser um Homem! ");
			} else {
					System.out.println("Herbivoro né?... Entao deve ser uma Vaca! ");
			}
			}
		}

	}

}
