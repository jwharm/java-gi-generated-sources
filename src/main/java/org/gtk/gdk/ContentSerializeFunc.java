package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a function that can be registered with gdk_content_register_serializer().
 * <p>
 * When the function gets called to operate on content, it can call functions on the
 * {@code serializer} object to obtain the mime type, output stream, user data, etc. for its
 * operation.
 */
@FunctionalInterface
public interface ContentSerializeFunc {
    void run(org.gtk.gdk.ContentSerializer serializer);

    @ApiStatus.Internal default void upcall(MemoryAddress serializer) {
        run((org.gtk.gdk.ContentSerializer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(serializer)), org.gtk.gdk.ContentSerializer.fromAddress).marshal(serializer, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ContentSerializeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
