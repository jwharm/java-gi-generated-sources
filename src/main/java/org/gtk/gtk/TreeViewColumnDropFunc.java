package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
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
    boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeViewColumn column, org.gtk.gtk.TreeViewColumn prevColumn, org.gtk.gtk.TreeViewColumn nextColumn);

    @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(column)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(column, Ownership.NONE), (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(prevColumn)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(prevColumn, Ownership.NONE), (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(nextColumn)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(nextColumn, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeViewColumnDropFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
