/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.java;

/**
 *
 * @author Braavos
 */
public interface ILinkedList {

    public void add(Module module);

    public void addFirst(Module module);

    public void addLast(Module module);

    public void clear();

    public boolean contains(String moduleID);

    public Module getModule(String moduleID);

    public Module getFirstModule();

    public Module getLastModule();

    public Module remove(String moduleID);

    public Module removeFirstModule();

    public Module removeLastModule();

    public int size();

    public boolean isEmpty();

}
