package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Function type for determining whether {@code column} can be dropped in a
 * particular spot (as determined by {@code prev_column} and {@code next_column}).  In
 * left to right locales, {@code prev_column} is on the left of the potential drop
 * spot, and {@code next_column} is on the right.  In right to left mode, this is
 * reversed.  This function should return {@code true} if the spot is a valid drop
 * spot.  Please note that returning {@code true} does not actually indicate that
 * the column drop was made, but is meant only to indicate a possible drop
 * spot to the user.
 */
@FunctionalInterface
public interface TreeViewColumnDropFunc {
        boolean onTreeViewColumnDropFunc(@NotNull TreeView treeView, @NotNull TreeViewColumn column, @NotNull TreeViewColumn prevColumn, @NotNull TreeViewColumn nextColumn);
}
