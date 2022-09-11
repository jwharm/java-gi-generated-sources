package org.gtk.gtk;

@FunctionalInterface
public interface IconViewForeachFunc {

        void onIconViewForeachFunc(IconView iconView, TreePath path);
}
