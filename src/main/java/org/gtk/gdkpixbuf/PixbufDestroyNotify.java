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
/**
 * Functional interface declaration of the {@code PixbufDestroyNotify} callback.
 */
@FunctionalInterface
public interface PixbufDestroyNotify {

    /**
     * A function of this type is responsible for freeing the pixel array
     * of a pixbuf.
     * <p>
     * The gdk_pixbuf_new_from_data() function lets you pass in a pre-allocated
     * pixel array so that a pixbuf can be created from it; in this case you
     * will need to pass in a function of type {@code GdkPixbufDestroyNotify} so that
     * the pixel data can be freed when the pixbuf is finalized.
     */
    void run(PointerByte pixels);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pixels, MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(new PointerByte(pixels));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufDestroyNotify.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
