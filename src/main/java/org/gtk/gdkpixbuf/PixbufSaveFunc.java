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
@FunctionalInterface
public interface PixbufSaveFunc {
    boolean run(byte[] buf, long count, Out<org.gtk.glib.Error> error);

    @ApiStatus.Internal default int upcall(MemoryAddress buf, long count, MemoryAddress error, MemoryAddress data) {
        Out<org.gtk.glib.Error> errorOUT = new Out<>(org.gtk.glib.Error.fromAddress.marshal(error, Ownership.FULL));
        var RESULT = run(MemorySegment.ofAddress(buf, count, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), count, errorOUT);
        error.set(Interop.valueLayout.ADDRESS, 0, errorOUT.get().handle());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufSaveFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
