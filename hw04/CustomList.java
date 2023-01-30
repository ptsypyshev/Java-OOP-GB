package hw04;

/**
 * Custom class that implements ArrayList functionality with additional methods
 */
public class CustomList<T> {
    private static final int DEFAULT_CAPACITY = 1;
    private int len;
    private T[] elements;

    /**
     * It is a constructor for CustomList instance
     */
    public CustomList() {
        this.len = 0;
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    /**
     * It is a constructor for CustomList instance with init parameter
     * @param elements  Array of elements
     */
    public CustomList(T[] elements) {
        this.len = elements.length;
        this.elements = elements;
    }

    /**
     * Returns the length of list
     * @return  this.len
     */
    public int getLen() {
        return this.len;
    }

    /**
     * Returns the internal array of elements
     * @return this.elements
     */
    public T[] getElements() {
        return this.elements;
    }

    /**
     * Prints all elements of list
     */
    public void print() {
        System.out.println(this);
    }

    /**
     * Adds new element to list
     * @param element   New element
     * @return  true if new element is added
     */
    public boolean add(T element) {
        if (this.len == this.elements.length) {
            growArr();
        }
        this.elements[this.len++] = element;
        return true;
    }

    /**
     * It grows internal array if there is no free space to add new element
     */
    private void growArr() {
        int newCapacity = this.getLen() * 2;
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < this.getLen(); i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }

    /**
     * Removes an element by its index from list
     * @param idx   Index of element
     * @return      Value of removed element
     */
    public T remove(int idx) {
        checkIndex(idx);
        T removed = this.elements[idx];

        for (int i = idx; i < this.getLen() - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.len--;
        return removed;
    }

    /**
     * Checks for valid index and throws an Exception if index is not valid
     */
    private void checkIndex(int idx) throws IndexOutOfBoundsException{
        if (idx < 0 || idx >= this.getLen()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d",
                    idx, this.getLen()
                )
            );
        }
    }

    /**
     * Removes all elements with specified value from list
     * @param elem  Element to remove from list
     * @return
     */
    public boolean removeAll(T elem) {
        int count = 0;
        int arrTail = this.getLen();
        boolean isChanged = false;

        for (int i = 0; i < arrTail; i++) {
            if (this.elements[i].equals(elem)) {
                count++;
                arrTail--;
                isChanged = true;
                for (int j = i; j < this.getLen() - 1; j++) {
                    swap(j, j + 1);
                }
            }        
        }

        this.len -= count;
        return isChanged;
    }

    /**
     * Returns minimal element from list
     * @return  minimal element from list
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    public T getMin() throws NonComparableTypeException{
        return getMinOrMax(false);
    }

    /**
     * Returns maximal element from list
     * @return  maximal element from list
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    public T getMax() throws NonComparableTypeException{
        return getMinOrMax(true);
    }

    /**
     * Returns minimal or maximal element from list due to getMax parameter
     * @param getMax    If true it try to find maximal element, else - minimal
     * @return   minimal or maximal element from list   
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    private T getMinOrMax(boolean getMax) throws NonComparableTypeException{
        T result = this.elements[0];
        if (result instanceof Comparable) {
            for (int i = 1; i < this.getLen(); i++) {
                Comparable<T> elem = (Comparable<T>)this.elements[i];
                if (getMax) {
                    if (elem.compareTo(result) > 0 ) {
                        result = this.elements[i];
                    }
                } else {
                    if (elem.compareTo(result) < 0 ) {
                        result = this.elements[i];
                    }
                }                
            }
            return result;
        }
        throw new NonComparableTypeException(result.getClass().getSimpleName());
    }

    /**
     * Returns index of element or -1 if it is not found
     * @param element   Element to search in list
     * @return  index of element
     */
    public int indexOf(T element) {
        for (int i = 0; i < this.getLen(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Checks if the list contains the element
     * @param element   Element to search in list
     * @return  true if the list contains the element
     */
    public boolean contains(T element) {
        return this.indexOf(element) != -1;
    }    

    /**
     * Swaps elements in internal array by their indexes
     * @param i     One index 
     * @param j     Another index 
     */
    private void swap(int i, int j) {
        T tmp = this.elements[i];
        this.elements[i] = this.elements[j];
        this.elements[j] = tmp;
    }

    /**
     * Sorts an internal array with Bubble sort algorithm
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    public void BubbleSort() throws NonComparableTypeException {
        T tmp = this.elements[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLen() - 1; i++) {
                boolean hasSwap = false;
                
                for (int j = 0; j < this.getLen() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.elements[j];
                    T nextElem = this.elements[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        hasSwap = true;
                    }
                }
                
                if (!hasSwap) {
                    break;
                }
            }
        }
        else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    /**
     * Sorts an internal array with Insertion sort algorithm
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    public void InsertionSort() throws NonComparableTypeException {
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
        } else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    /**
     * Sorts an internal array with Selection sort algorithm
     * @throws NonComparableTypeException if type of elements in not comparable
     */
    public void SelectionSort() throws NonComparableTypeException {
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

                if (i != min_idx) {
                    swap(i, min_idx);
                }                
            }
        } else {
            throw new NonComparableTypeException(min.getClass().getSimpleName());
        }
    }

    /**
     * Returns the element from list by its index
     * @param idx   index of element
     * @return      the element from list by its index
     */
    public T get(int idx) {
        checkIndex(idx);
        return this.elements[idx];
    }

    /**
     * Replaces the current element by its index with new element
     * @param idx       index of element
     * @param newElem   new element to replace
     * @return          replaced element of list
     */
    public T set(int idx, T newElem) {
        checkIndex(idx);
        T replaced = this.elements[idx];
        this.elements[idx] = newElem;
        return replaced;
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
