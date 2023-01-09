package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert from {@link Settings} to
 * an object property. The {@code value} is already initialized to hold values
 * of the appropriate type.
 */
/**
 * Functional interface declaration of the {@code SettingsBindGetMapping} callback.
 */
@FunctionalInterface
public interface SettingsBindGetMapping {

    /**
     * The type for the function that is used to convert from {@link Settings} to
     * an object property. The {@code value} is already initialized to hold values
     * of the appropriate type.
     */
    boolean run(org.gtk.gobject.Value value, org.gtk.glib.Variant variant);
    
    @ApiStatus.Internal default int upcall(MemoryAddress value, MemoryAddress variant, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, null), org.gtk.glib.Variant.fromAddress.marshal(variant, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SettingsBindGetMapping.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
