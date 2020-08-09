/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.java;

import java.util.Collection;

/**
 *
 * @author Braavos
 */
public interface IBinaryTree {

    public void add(Module module);

    public void clear();

    public boolean contains(String moduleID);

    public Module getModule(String moduleID);

    public Collection<Module> headSet();

    public boolean isEmpty();

    public Module remove(String moduleID);

    public int size();
}
