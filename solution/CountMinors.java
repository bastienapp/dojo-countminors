class CountMinors {

	public static int minors(int[] ages) {
		int minors = 0;
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < 18) {
				minors++;
			}
		}
		return minors;
	}
}