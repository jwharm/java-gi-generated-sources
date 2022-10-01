package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Will be called whenever the row changes or is added and lets you control
 * if the row should be visible or not.
 */
@FunctionalInterface
public interface ListBoxFilterFunc {
        boolean onListBoxFilterFunc(ListBoxRow row);
}
