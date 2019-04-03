package utils;

public  class Tools {
    public static void printArrays(int[] array){
        for (int ele:array
                ) {
            System.out.print(ele);
            System.out.print(", ");
        }
        System.out.println("");
    }

    public String reverseString(char[] s) {
        int length = s.length;
        for(int i=0;i<length/2;i++){
            char temp;
            temp = s[i];
            s[i]=s[length-1-i];
            s[length-1-i]=temp;
        }
        return s.toString();

    }
}
