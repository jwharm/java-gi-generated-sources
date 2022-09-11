package org.gtk.gtk;

/**
 * A function used by gtk_icon_view_selected_foreach() to map all
 * selected rows.
 * 
 * It will be called on every selected row in the view.
 */
@FunctionalInterface
public interface IconViewForeachFunc {
        void onIconViewForeachFunc(IconView iconView, TreePath path);
}
