package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code unuse_plugin} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginUnuse {
    void run(org.gtk.gobject.TypePlugin plugin);

    @ApiStatus.Internal default void upcall(MemoryAddress plugin) {
        run((org.gtk.gobject.TypePlugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gtk.gobject.TypePlugin.fromAddress).marshal(plugin, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TypePluginUnuse.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
