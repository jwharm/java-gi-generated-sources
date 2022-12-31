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
@FunctionalInterface
public interface ContentDeserializeFunc {
    void run(org.gtk.gdk.ContentDeserializer deserializer);

    @ApiStatus.Internal default void upcall(MemoryAddress deserializer) {
        run((org.gtk.gdk.ContentDeserializer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(deserializer)), org.gtk.gdk.ContentDeserializer.fromAddress).marshal(deserializer, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ContentDeserializeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
