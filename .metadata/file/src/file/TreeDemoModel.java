/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author HP
 */
public class TreeDemoModel implements TreeModel{
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //khoi tao cay
        rootNode = buildtree("Car&Moto");
        tree=new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buildtree(String rootName){
        DefaultMutableTreeNode root=new DefaultMutableTreeNode(rootName);
        
        //xay dung cac nut con cho root
        DefaultMutableTreeNode car=new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode moto=new DefaultMutableTreeNode("Moto");
        
        //dua vao nut root
        root.add(car);
        root.add(moto);
        
        // xay dung cac nut con cho car
        DefaultMutableTreeNode honda=new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode yamaha=new DefaultMutableTreeNode("Yamaha");
        car.add(honda);
        car.add(yamaha);
        DefaultMutableTreeNode toyota=new DefaultMutableTreeNode("Toyota");
        DefaultMutableTreeNode suzuki=new DefaultMutableTreeNode("Suzuki");
        moto.add(toyota);
        moto.add(suzuki);
        
        //tra ve nut goc
        return root;
        
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    

    @Override
    public Object getRoot() {
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
