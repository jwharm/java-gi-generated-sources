package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which should set the value of {@code cell_layout}’s cell renderer(s)
 * as appropriate.
 */
/**
 * Functional interface declaration of the {@code CellLayoutDataFunc} callback.
 */
@FunctionalInterface
public interface CellLayoutDataFunc {

    /**
     * A function which should set the value of {@code cell_layout}’s cell renderer(s)
     * as appropriate.
     */
    void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        run((org.gtk.gtk.CellLayout) Interop.register(cellLayout, org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, null), (org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CellLayoutDataFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
