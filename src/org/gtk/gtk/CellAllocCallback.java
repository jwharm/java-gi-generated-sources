package org.gtk.gtk;

@FunctionalInterface
public interface CellAllocCallback {

        void onCellAllocCallback(CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle cellBackground);
}
