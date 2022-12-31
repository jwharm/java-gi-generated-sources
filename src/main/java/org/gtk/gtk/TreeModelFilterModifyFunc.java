package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which calculates display values from raw values in the model.
 * It must fill {@code value} with the display value for the column {@code column} in the
 * row indicated by {@code iter}.
 * <p>
 * Since this function is called for each data access, it’s not a
 * particularly efficient operation.
 */
@FunctionalInterface
public interface TreeModelFilterModifyFunc {
    void run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter, org.gtk.gobject.Value value, int column);

    @ApiStatus.Internal default void upcall(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
        run((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(model)), org.gtk.gtk.TreeModel.fromAddress).marshal(model, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), column);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeModelFilterModifyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
