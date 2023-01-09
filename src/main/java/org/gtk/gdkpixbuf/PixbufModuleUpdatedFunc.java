package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called every time a region
 * of {@code pixbuf} is updated.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-updated"&gt;area_updated&lt;/link&gt;"
 * signal.
 * @version 2.2
 */
/**
 * Functional interface declaration of the {@code PixbufModuleUpdatedFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {

    /**
     * Defines the type of the function that gets called every time a region
     * of {@code pixbuf} is updated.
     * <p>
     * {@link PixbufLoader} uses a function of this type to emit the
     * "&lt;link linkend="GdkPixbufLoader-area-updated"&gt;area_updated&lt;/link&gt;"
     * signal.
     * @version 2.2
     */
    void run(org.gtk.gdkpixbuf.Pixbuf pixbuf, int x, int y, int width, int height);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
        run((org.gtk.gdkpixbuf.Pixbuf) Interop.register(pixbuf, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, null), x, y, width, height);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleUpdatedFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
