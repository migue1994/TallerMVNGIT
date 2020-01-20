package edu.escuelaing.arem.ASE.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import lombok.Data;

@Data
@SuppressWarnings("unchecked")
public class LinkedList<E> implements List {

    private E object;
    private Node<E> head;
    private Node<E> currentNode;

    @Override
    public int size() {
        int cont = 1;
        Node<E> next = this.head;
        if (this.head != null){
            while(next.getNext()!=null){
                cont++;
                next = next.getNext();
            }
            return cont;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (this.head != null){
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return null;
    }

    @Override
    public boolean add(Object e) {
        Node<E> node = new Node<>(null,null, (E) e);

        if(this.head == null){
            this.head = node;
            this.currentNode=node;
        }else{
            Node<E> last = this.head;
            while(last.getNext() != null){
                last = last.getNext();
            }
            node.setPrior(last);
            last.setNext(node);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        Node<E> node = this.head;
        for(int i=0; i < index; i++){
            node = node.getNext();
        }
        return node.getData();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public Node<E> nextNode(){
        this.currentNode = currentNode.getNext();
        return this.currentNode;
    }

    public Node<E> priorNode(){
        this.currentNode = this.currentNode.getPrior();
        return this.currentNode;
    }

}