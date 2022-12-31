package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which should set the value of {@code cell_layout}’s cell renderer(s)
 * as appropriate.
 */
@FunctionalInterface
public interface CellLayoutDataFunc {
    void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter);

    @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CellLayoutDataFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
