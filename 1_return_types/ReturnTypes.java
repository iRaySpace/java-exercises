class ReturnTypes {
    public static void main(String[] args) {
        int zero = 0;
        int one = addOne(zero);
        float pointFive = divideByTwo(one);
        System.out.println(pointFive);

        // Make a variable that accepts `1.5` calling the `addOne` method
        System.out.println(1.5); // Replace static `1.5` to a variable storing `1.5`

        // Make a variable that accepts an int from Math.round(1.5)
        System.out.println(Math.round(1.5)); // Replace Math.round(1.5) with a variable storing the result
    }

    public static int addOne(int num) {
        // Modify this function to accept decimals
        return num + 1;
    }

    public static float divideByTwo(int num) {
        return (float) num / 2;
    }
}
