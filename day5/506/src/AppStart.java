abstract class Fightable{
	public  void fight() {
		
	};
}
public class AppStart {
	public static void main(String[] args) {
		Fightable fighter=new Fightable() {
			public void cry() {
				System.out.println("x");
			}
		};
		fighter.cry();
		fighter.fight();
	}
}
