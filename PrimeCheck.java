class PrimeCheck {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        
        int number = Integer.parseInt(args[0]);

        
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

