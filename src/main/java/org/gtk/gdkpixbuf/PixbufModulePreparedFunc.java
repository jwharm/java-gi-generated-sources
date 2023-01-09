package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called once the initial
 * setup of {@code pixbuf} is done.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-prepared"&gt;area_prepared&lt;/link&gt;"
 * signal.
 * @version 2.2
 */
/**
 * Functional interface declaration of the {@code PixbufModulePreparedFunc} callback.
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {

    /**
     * Defines the type of the function that gets called once the initial
     * setup of {@code pixbuf} is done.
     * <p>
     * {@link PixbufLoader} uses a function of this type to emit the
     * "&lt;link linkend="GdkPixbufLoader-area-prepared"&gt;area_prepared&lt;/link&gt;"
     * signal.
     * @version 2.2
     */
    void run(org.gtk.gdkpixbuf.Pixbuf pixbuf, org.gtk.gdkpixbuf.PixbufAnimation anim);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
        run((org.gtk.gdkpixbuf.Pixbuf) Interop.register(pixbuf, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, null), (org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(anim, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(anim, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModulePreparedFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
