public class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 10;
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size++] = value;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newData = new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
    }

}
