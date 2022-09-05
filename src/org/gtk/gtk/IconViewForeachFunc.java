package org.gtk.gtk;

@FunctionalInterface
public interface IconViewForeachFunc {

    /**
     * A function used by gtk_icon_view_selected_foreach() to map all
     * selected rows.
     * 
     * It will be called on every selected row in the view.
     */
    public void onIconViewForeachFunc(IconView iconView, TreePath path, jdk.incubator.foreign.MemoryAddress data);
}
