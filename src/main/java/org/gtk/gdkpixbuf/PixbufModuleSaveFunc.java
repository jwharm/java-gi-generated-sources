package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} into a standard C file stream.
 * <p>
 * The optional {@code param_keys} and {@code param_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleSaveFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleSaveFunc {

    /**
     * Saves a {@code GdkPixbuf} into a standard C file stream.
     * <p>
     * The optional {@code param_keys} and {@code param_values} arrays contain the keys and
     * values (in the same order) for attributes to be saved alongside the image
     * data.
     */
    boolean run(@Nullable java.lang.foreign.MemoryAddress f, org.gtk.gdkpixbuf.Pixbuf pixbuf, @Nullable PointerString paramKeys, @Nullable PointerString paramValues);
    
    @ApiStatus.Internal default int upcall(MemoryAddress f, MemoryAddress pixbuf, MemoryAddress paramKeys, MemoryAddress paramValues) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(f, (org.gtk.gdkpixbuf.Pixbuf) Interop.register(pixbuf, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, null), new PointerString(paramKeys), new PointerString(paramValues));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleSaveFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
