package heap;

public class MinHeap {
    private int[] heap;
    private int size; // the current number of elements in the heap

    public MinHeap(int maxSize) {
        this.heap = new int[maxSize];
    }

    public void insert(int elem) {
        // FILL IN CODE

    }

    /** Helper method for the insert method
     * Swap elements of the heap in positions pos1 and pos2
     * @param pos1
     * @param pos2
     */
    private void swap(int pos1, int pos2) {
        int tmp;
        tmp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = tmp;
    }

    /** Return the index of the parent
     *
     * @param pos the index of the element in the heap array
     * @return the index of the parent
     */
    private int parent(int pos) {
        return pos / 2;
    }

    /** Print the array that stores the heap */
    public void print() {
        int i;
        for (i = 1; i <= size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minheap = new MinHeap(6);
        minheap.insert(14);
        minheap.insert(16);
        minheap.insert(5);
        minheap.insert(4);
        minheap.insert(0);
        minheap.print();
        // Should print 0, 4, 14, 16, 5

    }
}
