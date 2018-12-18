import java.net.URL;

/**
 * Provides random values based on the services of
 * <a href="https://www.random.org/">random.org</a>, a request can take a longer
 * period of time and requires a Internet connection.
 * 
 * @author Philipp Schick
 * @version 1.00, 18.12.2018
 * 
 */
public class RandomGenerator {

	/**
	 * Custom constructor for RandomGenerator, sets a email address were random.org
	 * can contact you if your requests causes trouble
	 * 
	 * @param email your email
	 */
	public RandomGenerator(String email) {
		// sets the http agent to the email address
		System.setProperty("http.agent", email);
	}

	/**
	 * Returns a random integer between <code>min</code> and <code>max</code>, don't
	 * use this method if you need several integers. If this is the case use
	 * <code>getIntArray(int min, int max, int num)</code>
	 * 
	 * @param min the lower border of the integer, has to be greater than -1 000
	 *            000 000
	 * @param max the upper border of the integer has to be lower than 1 000 000
	 *            000
	 * @return an integer
	 */
	public int getInt(int min, int max) {
		// Parameters for random.org, see https://www.random.org/clients/http/
		int num = 1;
		int col = 1;
		int base = 10;
		String format = "plain";
		String rnd = "new";

		URL url;

		url = new URL("https://www.random.org/integers/?num=" + num + "&min=" + min + "&max=" + max + "&col=" + col
				+ "&col=" + col + "&base=" + base + "&format=" + format + "&rnd=" + rnd);

		// TODO finish Method
		return -1;
	}

	/**
	 * Returns a array of random integers between <code>min</code> and
	 * <code>max</code>
	 * 
	 * @param min the lower border of the integers, has to be greater than -1 000
	 *            000 000
	 * @param max the upper border of the integers has to be lower than 1 000 000
	 *            000
	 * @param num The size of the Array which is returned
	 * @return an array of random integers
	 */
	public int[] getIntArray(int min, int max, int num) {
		// Parameters for random.org, see https://www.random.org/clients/http/
		int col = 1;
		int base = 10;
		String format = "plain";
		String rnd = "new";

		URL url;

		//TODO finish Method
		return null;
	}

}
