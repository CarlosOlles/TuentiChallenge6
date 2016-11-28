package challenge1;

public class CalculateTablesFromDinners {

	public static void main(String... args) {
		String result;
		int i = 0;
		for (String numberOfDinners : args) {
			i++;
			result = new String();
			Integer numberOfDinnersInt = Integer.valueOf(numberOfDinners);
			Integer numberOfTables;
			if (numberOfDinnersInt <= 4) {
				numberOfTables = 1;
			} else {
				numberOfTables = ((numberOfDinnersInt - 4) / 2) + 1;
				if (numberOfDinnersInt % 4 == 1 || numberOfDinnersInt % 4 == 3) {
					numberOfTables++;
				}
			}
			result = result.concat(numberOfTables.toString());
			System.out.println("Case #" + i + ": " + result);
		}
	}

}
