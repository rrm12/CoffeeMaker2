class Receptacle {
	
	public void filterHolder() {
		System.out.println("Put filter and coffee grounds into filter holder");
		System.out.println("o load it into the receptacle.");
	}
}

class CoffeeMaker extends Receptacle{
		
		boolean reliefValveOpen = true;
		
		public void reliefValve() {
			reliefValveOpen = true;
		}
		
		public void reliefValve1() {
			reliefValveOpen = false;
			System.out.println("close the relief valve");
		}
		
		public boolean statusReliefValveOpen() {
			System.out.println("opens the (pressure) relief valve");
			return reliefValveOpen;
		}
		
		public boolean statusReliefValveClosed() {
			System.out.println("Closes relief valve to allow water to flow to receptacle");
			return !reliefValveOpen;
		}
}


class BrewButton {
	
	boolean indicatorLightOn = true;
	
	public void indicatorLightOn() {
		indicatorLightOn = true;
	}
	
	public boolean statusIndicatorLightOn() {
		System.out.println("The indicator light is also turned on."); 
		
		return indicatorLightOn;
	}
	
	public boolean statusIndicatorLightOff() {
		System.out.println("If the indicator light is on, then turn it off");
		
		return !indicatorLightOn;
	}
	
	 public void brewButton() { 
		System.out.println("press Brew Button");
	} 
	
	public void continueBrewing() {
		System.out.println("continue the brew cycle");
	}
}



class WarmerPlate   {
	
	boolean potLifted = true;
	boolean plateWarmerOn = true;
	boolean potHasCoffee = true;

	public void potEmpty() {
		potHasCoffee = false;
		System.out.println("Put empty pot on warmer.");
	}

	public void warmerEmpty() {
		potLifted = true;
		System.out.println("Lifts pot from warmer");
	}
	
	 public void warmerEmpty1() { 
		potLifted = true;
		plateWarmerOn = false;
		System.out.println("Detects the pot has been lifted");
		System.out.println("â€¢ Coffee Maker: turns off the plate warmer");
	} 

	 public void potNotEmpty() { 
		 potHasCoffee = true;
		 plateWarmerOn = true;
		 System.out.println("replaces pot onto the warmer");
	} 
	 
	 public void restartWarmer() {
		 potHasCoffee = true;
		 plateWarmerOn = true;
		 System.out.println("If there is coffee remaining in the pot, restart the plate warmer");
		 
	 }
}

 class Boiler{
	
	 boolean boilerHeaterOn = true;
	 boolean boilerEmpty = false;
	 boolean potLifted = true;
	 
	 public void boilerNotEmpty() { 
			boilerHeaterOn = true;
			System.out.println("Turns on boiler heater");
		}
	 
	 public void boilerHeater() {
		 boilerHeaterOn = true;
		 System.out.println("turns on the boiler");
	 }

		public void boilerEmpty() { 
			boilerEmpty = false;
			boilerHeaterOn = false;
			System.out.println("When boiler is empty turns off boiler heater.");
		} 
		
		 public void boilerEmpty2() { 
			potLifted = true;
			boilerHeaterOn = false;
			System.out.println("Detects the pot has been lifted");
			System.out.println("â€¢ Coffee Maker: turns off the boiler");
		} 
		
		public void fillBoiler() {
			System.out.println("Fill boiler with water.");
		}
 }

class CoffeeStrength {	
	
	double basicCoffee = 1.10;
	double mocha = 0.90;
	double whip = 1.25;
	double cinnamon = 1.00;
	
	
	CoffeeStrength() {
		
	}
	
	 public double basicCoffee() {
		
		return basicCoffee;
	}
	
	public double mocha() {
		
		return mocha ;
	}
	
	public double whip() {
		
		return whip;
	} 
	
	public double extra() {
		
		return cinnamon;
	}
	
	CoffeeStrength(float strong) {
		System.out.println("Select the coffee strength : strong");
	}
	
	public String coffeeStrength(float strong) {
		return "Adjusts the spray force setting according to the selected coffee strength: slow light spray."; 
	}
	
	CoffeeStrength(double medium) {
		System.out.println("o Select the coffee strength : medium.");
	}
	
	public String coffeeStrength(double medium) {
		return "Adjusts the spray force setting according to the selected coffee strength: medium spray.";
	}
	
	CoffeeStrength(int light) {
		System.out.println("Select the coffee strength : light");
	}

	
	public String coffeeStrength(int light) {
		return "Adjusts the spray force setting according to the selected coffee strength: fast strong spray.";
	}
 }
 

public class CoffeeMaker2 {
	
	public static void main(String[] args) {
		
		CoffeeMaker cm = new CoffeeMaker();
		BrewButton bb = new BrewButton();
		WarmerPlate wp = new WarmerPlate();
		Boiler b = new Boiler();
		CoffeeStrength cs = new CoffeeStrength();
		
		System.out.println("A) The coffee lady morning routine");
		System.out.println();
		util(cm,bb,wp,b,cs);
		
		System.out.println();
		System.out.println();
		
		System.out.println("B) In the evening, she invited a friend over for coffee");
		System.out.println();
		utile(cm,bb,wp,b,cs);
		
	}
	
	public static void util(CoffeeMaker cm, BrewButton bb, WarmerPlate wp, Boiler b, CoffeeStrength cs ) {
		System.out.println("------------Case 1 --------------");
		System.out.println("The user (Coffee Lady) needs to");
		System.out.print("o "); wp.potEmpty();
		System.out.print("o "); b.fillBoiler();
		System.out.print("o "); cm.filterHolder();
		new CoffeeStrength(1.0);
		System.out.print("o "); bb.brewButton();
		
		System.out.println();
		
		System.out.println("In order to brew coffee, the system (coffee maker) needs to have the different hardware properties");
		System.out.print("â€¢ "); cm.statusReliefValveClosed();
		System.out.print("â€¢ "); b.boilerNotEmpty();
		System.out.print("â€¢ "); System.out.println(cs.coffeeStrength(1.0));
		System.out.print("â€¢ "); b.boilerEmpty();
		System.out.print("â€¢ "); bb.statusIndicatorLightOn();
		
		System.out.println();
		
		System.out.println("------------Case 3 ----------------------------------------");
		System.out.println("The user (Coffee Lady) and the Coffee Maker should need to");
		System.out.print("o Coffee Lady: ");
		wp.warmerEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		b.boilerEmpty2();
		System.out.print("â€¢ Coffee Maker: ");
		cm.statusReliefValveOpen();
		System.out.print("â€¢ Coffee Maker: ");
		bb.statusIndicatorLightOff();
		System.out.print("o Coffee Lady: ");
		wp.potNotEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		b.boilerHeater();
		System.out.print("â€¢ Coffee Maker: ");
		cm.reliefValve1();
		System.out.print("â€¢ Coffee Maker: ");
		bb.continueBrewing();
		
		System.out.println();
		
		System.out.println("------------Case 2 ------------------");
		System.out.print("o Coffee Lady: ");
		wp.warmerEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.warmerEmpty1();
		System.out.print("â€¢ Coffee Maker: ");
		bb.statusIndicatorLightOff();
		System.out.print("o Coffee Lady: ");
		wp.potNotEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.restartWarmer();
		System.out.println("o Coffee Lady adds the extras: whip");
		System.out.print("o Coffee Lady recieves the cumulative cost updates on the cost : $");
		System.out.println((cs.basicCoffee() + cs.whip()));
		
		
		
	}
	
	public static void utile(CoffeeMaker cm, BrewButton bb, WarmerPlate wp, Boiler b, CoffeeStrength cs ) {
		
		System.out.println("------------Case 1 --------------");
		System.out.println("The user (Coffee Lady) needs to");
		System.out.print("o "); wp.potEmpty();
		System.out.print("o "); b.fillBoiler();
		System.out.print("o "); cm.filterHolder();
		System.out.print("o "); new CoffeeStrength(1);
		System.out.print("o "); bb.brewButton();
		
		System.out.println();
		
		System.out.println("In order to brew coffee, the system (coffee maker) needs to have the different hardware properties");
		System.out.print("â€¢ "); cm.statusReliefValveClosed();
		System.out.print("â€¢ "); b.boilerNotEmpty();
		System.out.print("â€¢ "); System.out.println(cs.coffeeStrength(1));
		System.out.print("â€¢ "); b.boilerEmpty();
		System.out.print("â€¢ "); bb.statusIndicatorLightOn();
		System.out.println();
		
		System.out.println("------------Case 3 ---------------------------------------------");
		System.out.println("The user (Coffee Lady) and the Coffee Maker should need to");
		System.out.print("o Coffee Lady: ");
		wp.warmerEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		b.boilerEmpty2();
		System.out.print("â€¢ Coffee Maker: ");
		cm.statusReliefValveOpen();
		System.out.print("â€¢ Coffee Maker: ");
		bb.statusIndicatorLightOff();
		System.out.print("o Coffee Lady: ");
		wp.potNotEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		b.boilerHeater();
		System.out.print("â€¢ Coffee Maker: ");
		cm.reliefValve1();
		System.out.print("â€¢ Coffee Maker: ");
		bb.continueBrewing();
		
		System.out.println();
		
		System.out.println("------------Case 2------------------");
		System.out.print("o Coffee Lady: ");
		wp.warmerEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.warmerEmpty1();
		System.out.print("â€¢ Coffee Maker: ");
		bb.statusIndicatorLightOff();
		System.out.print("o Coffee Lady: ");
		wp.potNotEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.restartWarmer();
		System.out.println("o Coffee Lady adds the extras: cinnamon ");
		
		System.out.println();
		
		System.out.println("------------Case 2---------------------------------------------------");
		System.out.print("o Coffee Lady recieves the cumulative cost updates on the cost : $");
		System.out.println((cs.basicCoffee() + cs.extra()));
		
		System.out.println();
		
		System.out.println("------------Case 2-------------------");
		System.out.print("o Coffee Lady: ");
		wp.warmerEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.warmerEmpty1();
		System.out.print("â€¢ Coffee Maker: ");
		bb.statusIndicatorLightOff();
		System.out.print("o Coffee Lady: ");
		wp.potNotEmpty();
		System.out.print("â€¢ Coffee Maker: ");
		wp.restartWarmer();
		System.out.println("o Coffee Lady adds the extras: mocha");
		
		System.out.println();
		
		System.out.println("------------Case 2---------------------------------------------------");
		System.out.print("o Coffee Lady recieves the cumulative cost updates on the cost : $");
		System.out.println((cs.basicCoffee() + cs.mocha()));
	}
}


