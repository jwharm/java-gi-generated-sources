package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used for checking whether a row in {@code model} matches
 * a search key string entered by the user. Note the return value
 * is reversed from what you would normally expect, though it
 * has some similarity to strcmp() returning 0 for equal strings.
 */
/**
 * Functional interface declaration of the {@code TreeViewSearchEqualFunc} callback.
 */
@FunctionalInterface
public interface TreeViewSearchEqualFunc {

    /**
     * A function used for checking whether a row in {@code model} matches
     * a search key string entered by the user. Note the return value
     * is reversed from what you would normally expect, though it
     * has some similarity to strcmp() returning 0 for equal strings.
     */
    boolean run(org.gtk.gtk.TreeModel model, int column, java.lang.String key, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default int upcall(MemoryAddress model, int column, MemoryAddress key, MemoryAddress iter, MemoryAddress searchData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), column, Marshal.addressToString.marshal(key, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeViewSearchEqualFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
