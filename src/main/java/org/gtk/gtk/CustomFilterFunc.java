package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User function that is called to determine if the {@code item} should be matched.
 * <p>
 * If the filter matches the item, this function must return {@code true}. If the
 * item should be filtered out, {@code false} must be returned.
 */
/**
 * Functional interface declaration of the {@code CustomFilterFunc} callback.
 */
@FunctionalInterface
public interface CustomFilterFunc {

    /**
     * User function that is called to determine if the {@code item} should be matched.
     * <p>
     * If the filter matches the item, this function must return {@code true}. If the
     * item should be filtered out, {@code false} must be returned.
     */
    boolean run(org.gtk.gobject.GObject item);
    
    @ApiStatus.Internal default int upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) Interop.register(item, org.gtk.gobject.GObject.fromAddress).marshal(item, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomFilterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
