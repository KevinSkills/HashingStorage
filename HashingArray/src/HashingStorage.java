
public class HashingStorage {
    private static int nrOfNumbers = 1000000;
    private static int sizeOfStorage = 10000000;
    private static int[] hashingStorage = new int [sizeOfStorage]; 
	
    
    public static void fillStorage() {
    	int positionInStorage;
    	int randomNumber;
        for (int i = 0 ; i<nrOfNumbers ; i++) {
        	randomNumber = 1+((int)(Math.random()*2000000000));
        	positionInStorage = randomNumber%sizeOfStorage;
        	while(hashingStorage[positionInStorage] != 0) {
        		positionInStorage++;
        	}
        	hashingStorage[positionInStorage] = randomNumber;
        }
    }
    
    
    
    public static boolean InStorage(int x) {
    	int i = x % sizeOfStorage;
    	
    	while (hashingStorage[i] != 0) {
    		if(hashingStorage[i] == x) return true;
    		i++;
    	}
    	
    	return false;
    }
}
