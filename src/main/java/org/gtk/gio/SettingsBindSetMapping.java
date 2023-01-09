package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert an object property
 * value to a {@link org.gtk.glib.Variant} for storing it in {@link Settings}.
 */
/**
 * Functional interface declaration of the {@code SettingsBindSetMapping} callback.
 */
@FunctionalInterface
public interface SettingsBindSetMapping {

    /**
     * The type for the function that is used to convert an object property
     * value to a {@link org.gtk.glib.Variant} for storing it in {@link Settings}.
     */
    org.gtk.glib.Variant run(org.gtk.gobject.Value value, org.gtk.glib.VariantType expectedType);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress value, MemoryAddress expectedType, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, null), org.gtk.glib.VariantType.fromAddress.marshal(expectedType, null));
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SettingsBindSetMapping.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
