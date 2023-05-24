class ClosestNeighbours {
	public static void main (String[] args) {
		int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
		int min = Math.abs(myArray[0] - myArray[1]);
		int[] neighbours = {myArray[0], myArray[1]};
		for (int i=0; i < myArray.length-1; i++) {
			int diff = Math.abs(myArray[i] - myArray[i+1]);
			if (diff <= min) {
				min = diff;
				neighbours[0] = myArray[i];
				neighbours[1] = myArray[i+1];
			}
		}
		System.out.println(neighbours[0]);
		System.out.println(neighbours[1]);
	}
}
