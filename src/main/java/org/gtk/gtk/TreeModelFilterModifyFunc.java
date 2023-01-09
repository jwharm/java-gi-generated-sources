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
/**
 * Functional interface declaration of the {@code TreeModelFilterModifyFunc} callback.
 */
@FunctionalInterface
public interface TreeModelFilterModifyFunc {

    /**
     * A function which calculates display values from raw values in the model.
     * It must fill {@code value} with the display value for the column {@code column} in the
     * row indicated by {@code iter}.
     * <p>
     * Since this function is called for each data access, it’s not a
     * particularly efficient operation.
     */
    void run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter, org.gtk.gobject.Value value, int column);
    
    @ApiStatus.Internal default void upcall(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
        run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gobject.Value.fromAddress.marshal(value, null), column);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeModelFilterModifyFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
