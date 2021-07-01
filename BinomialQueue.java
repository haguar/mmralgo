// Group 8: Jacob Hagen, Matthew Duong
// Comp 282 Spring 2021 Prof. Hsu
// Project 3 Part B
// April 26th, 2021


public final class BinomialQueue<T extends Comparable<? super T>> {
    private static final int DEFAULT_TREES = 1;
 
    // # items in priority queue.
    private int size;
 
    // An array of tree roots.
    private BinomialNode<T>[] trees;
 
    /**
     * Construct the binomial queue.
     */
    public BinomialQueue() {
        trees = new BinomialNode[DEFAULT_TREES];
        makeEmpty();
    }
 
    /**
     * Construct with a single item.
     */
    public BinomialQueue(T item) {
        size = 1;
        trees = new BinomialNode[1];
        trees[0] = new BinomialNode<>(item, null, null);
    }
    
    public void displayTeam(int[] team){
        System.out.print("\nTeam Assembled with Composites: ");
        for(int i = 0; i < team.length; i++){
            System.out.print(team[i] + " ");
        }
    }
    
    public void assembleTeamOf3(BinomialQueue<T> queue, int[] team) throws Exception{
        for(int i = 0; i < 3; i++){
            queue.deleteMin();
            //team[i] = queue.deleteMin();
            //team[i] = value;
        }
    }
 
    /**
     * Test program.
     *
     * @param args The arguments.
     */
    public static void main(String[] args) throws Exception {

        //Initialize Binomial Queue
        BinomialQueue<Integer> bq1 = new BinomialQueue<>();
        
        //Array of 30 unique MMR ratings
        int[] mmr = {2145, 2058, 2271, 2089, 2012, 2062, 2099, 
                     2108, 2263, 2048, 2004, 2241, 2092, 2047, 
                     2051, 2074, 2082, 2166, 2098, 2349, 2252, 
                     2075, 2027, 2102, 2033, 2128, 2133, 2147,
                     2101, 2176};
        
        //Array of 30 corresponding waiting times in seconds
        int[] times = {82, 33, 76, 74, 15, 73, 100, 34, 55, 111,
                       98, 103, 79, 34, 60, 98, 108, 14, 89, 117,
                       13, 68, 43, 32, 30, 9, 63, 52, 4, 74};
        
        //Array to store 30 composite values
        int[] comps = new int[30];
                       
        for(int i = 0; i < mmr.length; i++){
            comps[i] = (mmr[i] * times[i]);
        }
                     
        System.out.println("Player MMC Insertions: \n");
        
        //Traverse and insert all MMCs into the Binomial Queue
        
        double time1 = System.currentTimeMillis();
        
        for(int i = 0; i < comps.length; i++){
            bq1.insert(comps[i]);
            
            //Insertion Indicator
            System.out.println("[" + (i+1) + "] Inserted: " + comps[i] + " ");
        }
        
        double time2 = System.currentTimeMillis();      
        System.out.println("\nTotal Runtime For Insertion of 30 Values: ");
        double sub = (time2 - time1) * 1e+6;
        System.out.printf("Value: %.5f", sub);
        System.out.print(" nanoseconds\n");
        
        System.out.println("\nPops / Team Assemblies: \n");
        
        //Popping Min Value which correlates to the "most matched"
        int[] team1 = new int[3];
        int[] team2 = new int[3];
        int[] team3 = new int[3];
        int[] team4 = new int[3];
        int[] team5 = new int[3];
        int[] team6 = new int[3];
        int[] team7 = new int[3];
        int[] team8 = new int[3];
        int[] team9 = new int[3];
        int[] team10 = new int[3];
        
        double t3 = System.currentTimeMillis();
        
        for(int i = 0; i < team1.length; i++){
            team1[i] = bq1.deleteMin();
        }
        
        System.out.println("END OF TEAM 1");
        
        for(int i = 0; i < team2.length; i++){
            team2[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 2"); 
        
        for(int i = 0; i < team3.length; i++){
            team3[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 3"); 
        
        for(int i = 0; i < team4.length; i++){
            team4[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 4"); 
        
        for(int i = 0; i < team5.length; i++){
            team5[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 5"); 
        
        for(int i = 0; i < team6.length; i++){
            team6[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 6"); 
        
        for(int i = 0; i < team7.length; i++){
            team7[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 7"); 
        
        for(int i = 0; i < team8.length; i++){
            team8[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 8"); 
        
        for(int i = 0; i < team9.length; i++){
            team9[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 9"); 

        for(int i = 0; i < team10.length; i++){
            team10[i] = bq1.deleteMin();
        }

        System.out.println("END OF TEAM 10"); 

        
        double t4 = System.currentTimeMillis();
        System.out.println("\nTotal Runtime For Extraction of 30 Values: ");
        double sub2 = (t4 - t3) * 1e+6;
        System.out.printf("Value: %.5f", sub2);
        System.out.print(" nanoseconds\n\n");
        
        double total = sub + sub2;
        System.out.printf("Total time for insertions and extractions: %.5f", total); 
        System.out.print(" nanoseconds\n");
        
        bq1.displayTeam(team1);    
        bq1.displayTeam(team2); 
        bq1.displayTeam(team3);
        bq1.displayTeam(team4);    
        bq1.displayTeam(team5); 
        bq1.displayTeam(team6); 
        bq1.displayTeam(team7);    
        bq1.displayTeam(team8); 
        bq1.displayTeam(team9); 
        bq1.displayTeam(team10);   
        
        System.out.println("\nBinomial Queue Empty? : " + bq1.isEmpty()); //A check to see if the queue has been cleared of all players           
    }

    /**
     * Expand trees.
     *
     * @param newNumTrees The new number of trees.
     */
    private void expandTrees(int newNumTrees) {
        BinomialNode<T>[] old = trees;
        int oldNumTrees = trees.length;
 
        trees = new BinomialNode[newNumTrees];
        for (int i = 0; i < Math.min(oldNumTrees, newNumTrees); i++) {
            trees[i] = old[i];
        }
        for (int i = oldNumTrees; i < newNumTrees; i++) {
            trees[i] = null;
        }
    }
    
    
 
    /**
     * Merge binomial queue into the priority queue.
     * Binomial queue becomes empty.
     * Binomial queue must be different from this.
     *
     * @param binomialQueue The other binomial queue.
     */
    public void merge(BinomialQueue<T> binomialQueue) {
        // Avoid aliasing problems.
        if (this == binomialQueue) {
            return;
        }
 
        size += binomialQueue.size;
        if (size > capacity()) {
            int newNumTrees = Math.max(trees.length, binomialQueue.trees.length) + 1;
            expandTrees(newNumTrees);
        }
 
        BinomialNode<T> carry = null;
        for (int i = 0, j = 1; j <= size; i++, j *= 2) {
            BinomialNode<T> t1 = trees[i];
            BinomialNode<T> t2 = i < binomialQueue.trees.length ? binomialQueue.trees[i] : null;
 
            int whichCase = t1 == null ? 0 : 1;
            whichCase += t2 == null ? 0 : 2;
            whichCase += carry == null ? 0 : 4;
 
            switch (whichCase) {
                case 0: /* No trees */
                case 1: /* Only this */
                    break;
                case 2: /* Only binomialQueue */
                    trees[i] = t2;
                    binomialQueue.trees[i] = null;
                    break;
                case 4: /* Only carry */
                    trees[i] = carry;
                    carry = null;
                    break;
                case 3: /* This and binomialQueue */
                    carry = combineTrees(t1, t2);
                    trees[i] = binomialQueue.trees[i] = null;
                    break;
                case 5: /* This and carry */
                    carry = combineTrees(t1, carry);
                    trees[i] = null;
                    break;
                case 6: /* BinomialQueue and carry */
                    carry = combineTrees(t2, carry);
                    binomialQueue.trees[i] = null;
                    break;
                case 7: /* All three */
                    trees[i] = carry;
                    carry = combineTrees(t1, t2);
                    binomialQueue.trees[i] = null;
                    break;
            }
        }
 
        for (int k = 0; k < binomialQueue.trees.length; k++) {
            binomialQueue.trees[k] = null;
        }
        binomialQueue.size = 0;
    }
 
    /**
     * Return the result of merging equal-sized tree1 and tree2.
     */
    private BinomialNode<T> combineTrees(BinomialNode<T> tree1, BinomialNode<T> tree2) {
        if (tree1.element.compareTo(tree2.element) > 0) {
            return combineTrees(tree2, tree1);
        }
        tree2.nextSibling = tree1.leftChild;
        tree1.leftChild = tree2;
        return tree1;
    }
 
    /**
     * Insert into the priority queue, maintaining heap order.
     * This implementation is not optimized for O(1) performance.
     *
     * @param x The item to insert.
     */
    public void insert(T x) {
        merge(new BinomialQueue<>(x));
    }
 
    /**
     * Find the smallest item in the priority queue.
     *
     * @return The smallest item, or throw exception if empty.
     */
    public T findMin() throws Exception {
        if (isEmpty()) {
            throw new Exception("Binomial queue is empty!");
        }
 
        return trees[findMinIndex()].element;
    }
 
    /**
     * Find index of tree containing the smallest item in the priority queue.
     * The priority queue must not be empty.
     *
     * @return The index of tree containing the smallest item.
     */
    private int findMinIndex() {
        int i;
        int minIndex;
        for (i = 0; trees[i] == null; i++) {
        }
 
        for (minIndex = i; i < trees.length; i++) {
            if (trees[i] != null && trees[i].element.compareTo(trees[minIndex].element) < 0) {
                minIndex = i;
            }
        }
 
        return minIndex;
    }
 
    /**
     * Remove the smallest item from the priority queue.
     *
     * @return The smallest item, or throw exception if empty.
     */
    public T deleteMin() throws Exception {
        if (isEmpty()) {
            throw new Exception("Binomial queue is empty!");
        }
 
        int minIndex = findMinIndex();
        T minItem = trees[minIndex].element;
        System.out.println("Popped Composite: " + minItem); //Added Checker
        BinomialNode<T> deletedTree = trees[minIndex].leftChild;
 
        // Construct H''.
        BinomialQueue<T> deletedQueue = new BinomialQueue<>();
        deletedQueue.expandTrees(minIndex);
        deletedQueue.size = (1 << minIndex) - 1;
        for (int j = minIndex - 1; j >= 0; j--) {
            deletedQueue.trees[j] = deletedTree;
            deletedTree = deletedTree.nextSibling;
            deletedQueue.trees[j].nextSibling = null;
        }
 
        // Construct H'.
        trees[minIndex] = null;
        size -= deletedQueue.size + 1;
        merge(deletedQueue);
 
        return minItem;
    }
 
    /**
     * Test if the priority queue is logically empty.
     *
     * @return True if empty; false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
 
    /**
     * Make the priority queue logically empty.
     */
    public void makeEmpty() {
        size = 0;
        for (int i = 0; i < trees.length; i++) {
            trees[i] = null;
        }
    }
 
    /**
     * Return the capacity.
     */
    private int capacity() {
        return (1 << trees.length) - 1;
    }
 
    /**
     * Binomial queue node class.
     *
     * @param <AnyType> Any type.
     */
    private static class BinomialNode<AnyType> {
        AnyType element; // The data in the node.
        BinomialNode<AnyType> leftChild; // Left child.
        BinomialNode<AnyType> nextSibling; // Next sibling.
 
        // Constructors.
        BinomialNode(AnyType element) {
            this(element, null, null);
        }
 
        BinomialNode(AnyType element, BinomialNode<AnyType> leftChild, BinomialNode<AnyType> nextSibling) {
            this.element = element;
            this.leftChild = leftChild;
            this.nextSibling = nextSibling;
        }
    }
}