package Day1;
class MyHashSet {
    //added boolean array since we need to know if that element is exist or not
    //need two variables for two arrays
    //create hash keys for both functions
    // before adding or removing we need to make sure we have keys assigned
    //and check if first array place is zero or not and check if null increase secondary array by size 1
    // next check if the bucket is null then create array and set element to true
    private boolean[][] storage;
    private int bucket;
    private int bucketitems;

    public MyHashSet() {
        this.bucket = 1000;
        this.bucketitems = 1000;
        this.storage = new boolean[bucket][];
    }

    public int hash1(int key) {
        return key % this.bucket;
    }

    public int hash2(int key) {
        return key / this.bucketitems;
    }

    public void add(int key) {
        int bucket = hash1(key);
        int bucketItem = hash2(key);

        if (storage[bucket] == null) {
            if (bucket == 0) {
                storage[bucket] = new boolean[this.bucketitems + 1];
            } else {
                storage[bucket] = new boolean[this.bucketitems];
            }
        }

        storage[bucket][bucketItem] = true;
    }

    public void remove(int key) {
        int bucket = hash1(key);
        int bucketItem = hash2(key);

        if (storage[bucket] == null) return;
        storage[bucket][bucketItem] = false;
    }

    public boolean contains(int key) {
        int bucket = hash1(key);
        int bucketItem = hash2(key);

        if (storage[bucket] == null) return false;
        return storage[bucket][bucketItem];
    }

    // Main method to test MyHashSet functionality
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        // Adding elements to the hash set
        myHashSet.add(1);
        myHashSet.add(2);

        // Checking if elements are in the hash set
        System.out.println("Contains 1: " + myHashSet.contains(1)); // Expected output: true
        System.out.println("Contains 2: " + myHashSet.contains(2)); // Expected output: true
        System.out.println("Contains 3: " + myHashSet.contains(3)); // Expected output: false

        // Removing an element
        myHashSet.remove(2);

        // Checking again after removal
        System.out.println("Contains 2 after removal: " + myHashSet.contains(2)); // Expected output: false
    }
}
