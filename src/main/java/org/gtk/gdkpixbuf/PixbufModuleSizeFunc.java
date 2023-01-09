package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called once the size
 * of the loaded image is known.
 * <p>
 * The function is expected to set {@code width} and {@code height} to the desired
 * size to which the image should be scaled. If a module has no efficient
 * way to achieve the desired scaling during the loading of the image, it may
 * either ignore the size request, or only approximate it - gdk-pixbuf will
 * then perform the required scaling on the completely loaded image.
 * <p>
 * If the function sets {@code width} or {@code height} to zero, the module should interpret
 * this as a hint that it will be closed soon and shouldn't allocate further
 * resources. This convention is used to implement gdk_pixbuf_get_file_info()
 * efficiently.
 * @version 2.2
 */
/**
 * Functional interface declaration of the {@code PixbufModuleSizeFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleSizeFunc {

    /**
     * Defines the type of the function that gets called once the size
     * of the loaded image is known.
     * <p>
     * The function is expected to set {@code width} and {@code height} to the desired
     * size to which the image should be scaled. If a module has no efficient
     * way to achieve the desired scaling during the loading of the image, it may
     * either ignore the size request, or only approximate it - gdk-pixbuf will
     * then perform the required scaling on the completely loaded image.
     * <p>
     * If the function sets {@code width} or {@code height} to zero, the module should interpret
     * this as a hint that it will be closed soon and shouldn't allocate further
     * resources. This convention is used to implement gdk_pixbuf_get_file_info()
     * efficiently.
     * @version 2.2
     */
    void run(PointerInteger width, PointerInteger height);
    
    @ApiStatus.Internal default void upcall(MemoryAddress width, MemoryAddress height, MemoryAddress userData) {
        run(new PointerInteger(width), new PointerInteger(height));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleSizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
