package edu.escuelaing.arem.ASE.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node<E>{
    private Node<E> next;
    private Node<E> prior;
    private E data;
}