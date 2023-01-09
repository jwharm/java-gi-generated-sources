package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} by calling the provided function.
 * <p>
 * The optional {@code option_keys} and {@code option_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleSaveCallbackFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {

    /**
     * Saves a {@code GdkPixbuf} by calling the provided function.
     * <p>
     * The optional {@code option_keys} and {@code option_values} arrays contain the keys and
     * values (in the same order) for attributes to be saved alongside the image
     * data.
     */
    boolean run(org.gtk.gdkpixbuf.PixbufSaveFunc saveFunc, org.gtk.gdkpixbuf.Pixbuf pixbuf, @Nullable PointerString optionKeys, @Nullable PointerString optionValues);
    
    @ApiStatus.Internal default int upcall(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(null /* Unsupported parameter type */, (org.gtk.gdkpixbuf.Pixbuf) Interop.register(pixbuf, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, null), new PointerString(optionKeys), new PointerString(optionValues));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleSaveCallbackFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
