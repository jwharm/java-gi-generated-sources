package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a function that can be registered with gdk_content_register_deserializer().
 * <p>
 * When the function gets called to operate on content, it can call functions on the
 * {@code deserializer} object to obtain the mime type, input stream, user data, etc. for its
 * operation.
 */
/**
 * Functional interface declaration of the {@code ContentDeserializeFunc} callback.
 */
@FunctionalInterface
public interface ContentDeserializeFunc {

    /**
     * The type of a function that can be registered with gdk_content_register_deserializer().
     * <p>
     * When the function gets called to operate on content, it can call functions on the
     * {@code deserializer} object to obtain the mime type, input stream, user data, etc. for its
     * operation.
     */
    void run(org.gtk.gdk.ContentDeserializer deserializer);
    
    @ApiStatus.Internal default void upcall(MemoryAddress deserializer) {
        run((org.gtk.gdk.ContentDeserializer) Interop.register(deserializer, org.gtk.gdk.ContentDeserializer.fromAddress).marshal(deserializer, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ContentDeserializeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
