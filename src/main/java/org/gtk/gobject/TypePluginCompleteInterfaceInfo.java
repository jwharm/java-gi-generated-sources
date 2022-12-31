package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
    void run(org.gtk.gobject.TypePlugin plugin, org.gtk.glib.Type instanceType, org.gtk.glib.Type interfaceType, org.gtk.gobject.InterfaceInfo info);

    @ApiStatus.Internal default void upcall(MemoryAddress plugin, long instanceType, long interfaceType, MemoryAddress info) {
        run((org.gtk.gobject.TypePlugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gtk.gobject.TypePlugin.fromAddress).marshal(plugin, Ownership.NONE), new org.gtk.glib.Type(instanceType), new org.gtk.glib.Type(interfaceType), org.gtk.gobject.InterfaceInfo.fromAddress.marshal(info, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TypePluginCompleteInterfaceInfo.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
