package org.gtk.gtk;

/**
 * Function type for determining whether @column can be dropped in a
 * particular spot (as determined by @prev_column and @next_column).  In
 * left to right locales, @prev_column is on the left of the potential drop
 * spot, and @next_column is on the right.  In right to left mode, this is
 * reversed.  This function should return <code>true</code> if the spot is a valid drop
 * spot.  Please note that returning <code>true</code> does not actually indicate that
 * the column drop was made, but is meant only to indicate a possible drop
 * spot to the user.
 */
@FunctionalInterface
public interface TreeViewColumnDropFunc {
        boolean onTreeViewColumnDropFunc(TreeView treeView, TreeViewColumn column, TreeViewColumn prevColumn, TreeViewColumn nextColumn);
}
