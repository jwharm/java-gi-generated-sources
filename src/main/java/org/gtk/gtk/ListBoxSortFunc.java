package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Compare two rows to determine which should be first.
 */
/**
 * Functional interface declaration of the {@code ListBoxSortFunc} callback.
 */
@FunctionalInterface
public interface ListBoxSortFunc {

    /**
     * Compare two rows to determine which should be first.
     */
    int run(org.gtk.gtk.ListBoxRow row1, org.gtk.gtk.ListBoxRow row2);
    
    @ApiStatus.Internal default int upcall(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.ListBoxRow) Interop.register(row1, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row1, null), (org.gtk.gtk.ListBoxRow) Interop.register(row2, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row2, null));
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListBoxSortFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
