// Collatz conjecture

// Given a positive integer x
// If it is even divide by two 
// If it is odd multiply by 3 and add 1

// And keep repeating this operation until you reach 1

// 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
// 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

// [3, 10, 5, 16, 8, 4, 2]

// collatz(3) => {3: 7, 10: 6, 5: 5, 16: 4 ...}
// collatz(20)

// 8 -> 4 -> 2 -> 1


// Conjecture itself is that starting with any x, eventually you reach 1.

// The problem is: write a program that given positive integer x, calculates how many steps it takes to reach 1.

// collatz_iterations(8) = 3
// collatz_iterations(3) = 7

private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

public int collatz_iterations(int n) {
	int counter = 0;
	int num = n;

	if (map.containsKey(n)) {return map.get(n);}

	while (n != 1) {

		if (map.containsKey(n)) {
			map.put(num, map.get(n) + counter);
			
			return map.get(num);
		}

		if (n % 2 == 0) {
			n /= 2;
        } else {
	        n = n * 3 + 1;
        }

    counter++;
    
    }

    map.put(num, counter);	

	return counter;
}
