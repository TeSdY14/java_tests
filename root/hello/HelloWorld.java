package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		sayHelloTo("World");
		Unicorn unicorn = new Unicorn();
		System.out.println(unicorn.power);
		// unicorn.height = 180; // Error : java: height has private access in hello.Unicorn
		// unicorn.sleep(); // Error : java: sleep() has private access in hello.Unicorn
		unicorn.run(); // OK : "YO"
		Unicorn.run(); // FONCTION STATIC Agit sur la CLASSE non sur l'Objet

//		ForOne one = new ForOne();
//		one.firstArrayTest();
//
//		While whileOne = new While();
//		whileOne.testWhileOne();
//
//		DoWhile doWhileOne = new DoWhile();
//		doWhileOne.testDoWhileOne();
//
//		Rectangle rect1 = new Rectangle();
//		rect1.printValues();

		Animal animal = new Animal();
		System.out.println("Instance de Animal : " + animal.deplacer());
		Chien chien = new Chien();
		System.out.println("Instance de Chien : " + chien.deplacer());
		Oiseau oiseau = new Oiseau();
		System.out.println("Instance de Oiseau (un) : " + oiseau.deplacer());
		Oiseau oiseau1 = new Oiseau();
		System.out.println("Instance de Oiseau (deux) : " + oiseau1.deplacer("Vole en ville."));
	}

	/**
	 *
	 * @param who String
	 */
	public static void sayHelloTo(String who) {
		System.out.println("Hello " + who + "!");
	}
}