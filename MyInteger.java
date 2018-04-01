public class MyInteger {
    private int value;

    public MyInteger( int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean isEven (){
        if(value%2==0){
            return true;
        }
        return false;
    }
    public boolean isOld (){
        if(value%2!=0){
            return true;
        }
        return false;
    }

    public boolean isPrime (){
        if(value<2){
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(value);
        for (int i = 2; i <= squareRoot; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static boolean isEven (int number){
        return number%2==0;
    }
    public static boolean isOld(int number){
        if(number%2==0) return false;
        return true;
    }

    public boolean equals(int value) {
       if (this.value==value) return true;
       return false;
    }
    // chuyển một mảng ký tự sang các giá trị số nguyên
    public static int parseInt(char[] listChar) {
        int resultNumber = 0;
        for (int i = 0; i < listChar.length; i++) {
            int number = Integer.parseInt(String.valueOf(listChar[i]));
            resultNumber += number;
        }
        return resultNumber;
    }
    // chuyển một chuỗi sang giá trị số nguyên
    public static int parseInt(String string) {
        int numberSwap = Integer.parseInt(string);
        return numberSwap;
    }
}

