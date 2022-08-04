public class MyStorage {
    private static int[] storage = new int [1000000];

    public static void fillStorage() {
        for (int i = 0 ; i<1000000 ; i++) {
            storage[i] =(int)(Math.random()*2000000000);
        }
    }

    public static boolean InStorage(int x){
        for (int i = 0 ; i<1000000 ; i++) {
            if (storage[i] == x) return true;
        }

        return false;

    }
}