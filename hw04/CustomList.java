package hw04;

public class CustomList<T> {
    private static final int DEFAULT_CAPACITY = 1;
    private int len;
    private T[] elements;

    public CustomList() {
        this.len = 0;
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomList(T[] elements) {
        this.len = elements.length;
        this.elements = elements;
    }


    public int getLen() {
        return this.len;
    }

    public void print() {
        System.out.println(this);
    }

    public void add(T element) {
        if (this.len == this.elements.length) {
            growArr();
        }
        this.elements[this.len++] = element;
    }

    private void growArr() {
        int newCapacity = this.getLen() * 2;
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < this.getLen(); i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }

    public void remove(int idx) {
        checkIndex(idx);

        for (int i = idx; i < this.getLen() - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.len--;
    }

    private void checkIndex(int idx) throws IndexOutOfBoundsException{
        if (idx < 0 || idx >= this.getLen()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d",
                    idx, this.getLen()
                )
            );
        }
    }

    public void removeAll(T elem) {
        int count = 0;
        for (int i = 0; i < this.getLen(); i++) {
            if (this.elements[i].equals(elem)) {
                this.elements[i] = null;
                count++;
            }
        
        }
        if (count == 0) {
            return;
        }

        int shift = 0;
        boolean shift_flag = false;
        for (int i = 0; i < this.getLen(); i++) {            
            if (this.elements[i] == null) {
                shift_flag = true;
                shift++;
            }
            if (shift_flag) {
                try {
                    this.elements[i] = this.elements[i + shift];
                } catch (IndexOutOfBoundsException e) {
                    break;
                } catch (NullPointerException e) {
                    continue;
                }
                
            }
        }
        this.len -= shift;
    }

    public T getMin() throws Exception{
        T min = this.elements[0];
        if (min instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>)this.elements[i];
                if (elem.compareTo(min) < 0 ) {
                    min = this.elements[i];
                }
            }
            return min;
        }
        throw new Exception("elements are not comparable");
    }

    public T getMax() throws Exception{
        T max = this.elements[0];
        if (max instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>)this.elements[i];
                if (elem.compareTo(max) > 0 ) {
                    max = this.elements[i];
                }
            }
            return max;
        }
        throw new Exception("elements are not comparable");
    }

    public T getSum() throws Exception {
        T sum = this.elements[0];
        if (sum instanceof Adder) {
            for (int i = 1; i < this.getLen(); i++) {
                sum = ((Adder<T>) sum).add(this.elements[i]);
            }
            return sum;
        }
        throw new Exception("Cannot sum it");
    }

    public int indexOf(T element) {
        for (int i = 0; i < this.getLen(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return this.indexOf(element) != -1;
    }    

    private void swap(int i, int j) {
        T tmp = this.elements[i];
        this.elements[i] = this.elements[j];
        this.elements[j] = tmp;
    }

    public void BubbleSort() {
        T tmp = this.elements[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLen(); i++) {
                for (int j = 0; j < this.getLen() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.elements[j];
                    T nextElem = this.elements[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                    }
                }
            }
        }        
    }

    public void InsertionSort() {
        T tmp = this.elements[0];
        if (tmp instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {                
                for (int j = i; j > 0; j--) {
                    Comparable<T> elem = (Comparable)this.elements[j];
                    T prevElem = this.elements[j - 1];
                    if (elem.compareTo(prevElem) < 0) {
                        swap(j, j - 1);
                    } else {
                        break;
                    }
                }                
            }
        }  
    }

    public void SelectionSort() {
        T min = this.elements[0];
        if (min instanceof Comparable) {
            for (int i = 0; i < this.getLen(); i++) {
                min = this.elements[i];   
                int min_idx = i;             
                for (int j = i; j < this.getLen(); j++) {
                    Comparable<T> elem = (Comparable<T>)this.elements[j];
                    if (elem.compareTo(min) < 0) {
                        min = this.elements[j];
                        min_idx = j;
                    }
                }
                swap(i, min_idx);
            }
        }  
    }

    public T get(int idx) {
        checkIndex(idx);
        return this.elements[idx];
    }

    public T set(int idx, T newElem) {
        checkIndex(idx);
        T tmp = this.elements[idx];
        this.elements[idx] = newElem;
        return tmp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.getLen(); i++) {
            sb.append(this.elements[i]);
            if (i != this.getLen() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
