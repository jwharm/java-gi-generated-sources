package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Save functions used by {@link Pixbuf#saveToCallback}.
 * <p>
 * This function is called once for each block of bytes that is "written"
 * by {@code gdk_pixbuf_save_to_callback()}.
 * <p>
 * If successful it should return {@code TRUE}; if an error occurs it should set
 * {@code error} and return {@code FALSE}, in which case {@code gdk_pixbuf_save_to_callback()}
 * will fail with the same error.
 * @version 2.4
 */
/**
 * Functional interface declaration of the {@code PixbufSaveFunc} callback.
 */
@FunctionalInterface
public interface PixbufSaveFunc {

    /**
     * Save functions used by {@link Pixbuf#saveToCallback}.
     * <p>
     * This function is called once for each block of bytes that is "written"
     * by {@code gdk_pixbuf_save_to_callback()}.
     * <p>
     * If successful it should return {@code TRUE}; if an error occurs it should set
     * {@code error} and return {@code FALSE}, in which case {@code gdk_pixbuf_save_to_callback()}
     * will fail with the same error.
     * @version 2.4
     */
    boolean run(byte[] buf, long count, Out<org.gtk.glib.Error> error);
    
    @ApiStatus.Internal default int upcall(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            Out<org.gtk.glib.Error> errorOUT = new Out<>(org.gtk.glib.Error.fromAddress.marshal(error, null));
            var RESULT = run(MemorySegment.ofAddress(buf, count, SCOPE).toArray(Interop.valueLayout.C_BYTE), count, errorOUT);
            error.set(Interop.valueLayout.ADDRESS, 0, errorOUT.get().handle());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufSaveFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
