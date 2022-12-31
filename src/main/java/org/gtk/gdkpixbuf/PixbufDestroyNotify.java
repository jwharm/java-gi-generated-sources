package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function of this type is responsible for freeing the pixel array
 * of a pixbuf.
 * <p>
 * The gdk_pixbuf_new_from_data() function lets you pass in a pre-allocated
 * pixel array so that a pixbuf can be created from it; in this case you
 * will need to pass in a function of type {@code GdkPixbufDestroyNotify} so that
 * the pixel data can be freed when the pixbuf is finalized.
 */
@FunctionalInterface
public interface PixbufDestroyNotify {
    void run(PointerByte pixels);

    @ApiStatus.Internal default void upcall(MemoryAddress pixels, MemoryAddress data) {
        run(new PointerByte(pixels));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufDestroyNotify.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
