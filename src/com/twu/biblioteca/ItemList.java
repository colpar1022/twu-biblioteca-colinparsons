/**
 * File for item list. Will be used to extend other lists.
 */

package com.twu.biblioteca;

import java.util.LinkedList;

public class ItemList extends LinkedList{
    private LinkedList list;

    public LinkedList getList(LinkedList name){
        return list;
    }

}
