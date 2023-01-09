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
/**
 * Functional interface declaration of the {@code TreeViewColumnDropFunc} callback.
 */
@FunctionalInterface
public interface TreeViewColumnDropFunc {

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
    boolean run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreeViewColumn column, org.gtk.gtk.TreeViewColumn prevColumn, org.gtk.gtk.TreeViewColumn nextColumn);
    
    @ApiStatus.Internal default int upcall(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
        var RESULT = run((org.gtk.gtk.TreeView) Interop.register(treeView, org.gtk.gtk.TreeView.fromAddress).marshal(treeView, null), (org.gtk.gtk.TreeViewColumn) Interop.register(column, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(column, null), (org.gtk.gtk.TreeViewColumn) Interop.register(prevColumn, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(prevColumn, null), (org.gtk.gtk.TreeViewColumn) Interop.register(nextColumn, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(nextColumn, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeViewColumnDropFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
