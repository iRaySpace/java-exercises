class ReturnTypesSolution {
    public static void main(String[] args) {
        double number = 1.5;
        System.out.println(addOne(number));
        
        int intValue = (int) Math.round(number);
        System.out.println(divideByTwo(intValue));
    }
    
    public static double addOne(double num) {
        int intNumber = (int) num;
        return num + 1;
    }

    public static float divideByTwo(int num) {
        float floatNumber = (float) num;
        return (float) num / 2;
    }
}
