public class Main {

    public static void main(String[] args) {
        HashingStorage.fillStorage();

        long Starttime = System.currentTimeMillis();

        for(int i = 0 ; i< 10000 ; i++) {
            if(HashingStorage.InStorage(i)) {
                System.out.println(i);

            }
        }
        System.out.println("Time: "+(System.currentTimeMillis()-Starttime));

    }

}