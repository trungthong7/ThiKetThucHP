/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.File;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author HP
 */
public class FileTreeDemoModel implements TreeModel{
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public FileTreeDemoModel(String rootD) {
        //khoi tao nut goc
        rootNode=new DefaultMutableTreeNode(new File(rootD));
        //khoi tao cay
        buildDrec(rootNode, rootD);
        tree= new DefaultTreeModel(rootNode);
    }
    
    public void buildDrec(DefaultMutableTreeNode node, String rootD){
        File fo=new File(rootD);
        if(!fo.isDirectory()){
            return; 
        }
        File[] list=fo.listFiles();
        for(int i=0; i<list.length; i++){
            DefaultMutableTreeNode child=new DefaultMutableTreeNode(list[i]);
            node.add(child);
            buildDrec(child, rootD + File.separator +list[i].getName());
        }
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
