public class LinkedListDeque<T>{
    public class Node{
        private T val;
        private Node pre;
        private Node Next;
        public Node(T item, Node _pre, Node _Next){
            val = item;
            pre = _pre;
            Next = _Next;
        }
        public Node(Node _pre, Node _Next) {
            pre = _pre;
            Next = _Next;
        }
    }
    private int size;
    private Node sentinel;
    public LinkedListDeque(){
        sentinel = new Node(null, null);
        sentinel.pre = sentinel;
        sentinel.Next = sentinel;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void addFirst(T item){
        Node node = new Node(item, sentinel, sentinel.Next);
        sentinel.Next.pre = node;
        sentinel.Next = node;
        size++;
    }
    public void addLast(T item){
        Node node = new Node(item, sentinel.pre, sentinel);
        sentinel.pre.Next = node;
        sentinel.pre = node;
        size++;
    }
    public T removeFirst(){
        if(size == 0) return null;
        T res = sentinel.Next.val;
        sentinel.Next.Next.pre = sentinel;
        sentinel.Next = sentinel.Next.Next;
        size--;
        return res;
    }
    public T removeLast(){
        if(size == 0) return null;
        T res = sentinel.pre.val;
        sentinel.pre.pre.Next = sentinel;
        sentinel.pre = sentinel.pre.pre;
        size--;
        return res;
    }
    public T get(int idx){
        if(idx >= size) return null;
        Node t = sentinel;
        for(int i = 0; i <= idx; i++){
            t = t.Next;
        }
        return t.val;
    }
    public T getRecursiveHelp(Node start, int idx){
        if(idx == 0) return start.val;
        else return getRecursiveHelp(start.Next, idx - 1);
    }
    public T getRecursive(int idx){
        if(idx >= size) return null;
        return getRecursiveHelp(sentinel.Next, idx);
    }
    public void printDeque(){
        Node t = sentinel.Next;
        while(t != sentinel){
            System.out.print(t.val + " ");
            t = t.Next;
        }
    }
}