package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
 */
/**
 * Functional interface declaration of the {@code TypePluginCompleteInterfaceInfo} callback.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {

    /**
     * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
     */
    void run(org.gtk.gobject.TypePlugin plugin, org.gtk.glib.Type instanceType, org.gtk.glib.Type interfaceType, org.gtk.gobject.InterfaceInfo info);
    
    @ApiStatus.Internal default void upcall(MemoryAddress plugin, long instanceType, long interfaceType, MemoryAddress info) {
        run((org.gtk.gobject.TypePlugin) Interop.register(plugin, org.gtk.gobject.TypePlugin.fromAddress).marshal(plugin, null), new org.gtk.glib.Type(instanceType), new org.gtk.glib.Type(interfaceType), org.gtk.gobject.InterfaceInfo.fromAddress.marshal(info, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TypePluginCompleteInterfaceInfo.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
