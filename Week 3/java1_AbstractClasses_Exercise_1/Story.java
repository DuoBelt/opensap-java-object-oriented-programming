class Story {

	public static void main(String[] args) {
		CombinationLock lock = new CombinationLock();
		System.out.println(lock.open(1337));
		System.out.println(lock.open(4711));
	}
}


/*

class Story {

	public static void main(String[] args) {
		CombinationLock lock = new CombinationLock();
		
		if (lock.open(1337)) {
			System.out.println("The code was correct, the combination lock was opened.");
		} else {
		    System.out.println("The code was incorrect, the lock stays shut.");
		}
        
        if (lock.open(4711)) {
			System.out.println("The code was correct, the combination lock was opened.");
		} else {
		    System.out.println("The code was incorrect, the lock stays shut.");
		}

	}

}*/
