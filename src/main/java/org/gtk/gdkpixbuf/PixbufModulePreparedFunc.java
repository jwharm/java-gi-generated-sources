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
@FunctionalInterface
public interface PixbufModulePreparedFunc {
    void run(org.gtk.gdkpixbuf.Pixbuf pixbuf, org.gtk.gdkpixbuf.PixbufAnimation anim);

    @ApiStatus.Internal default void upcall(MemoryAddress pixbuf, MemoryAddress anim, MemoryAddress userData) {
        run((org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pixbuf)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, Ownership.NONE), (org.gtk.gdkpixbuf.PixbufAnimation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(anim)), org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(anim, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModulePreparedFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
