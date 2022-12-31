package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_type_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
    void run(org.gtk.gobject.TypePlugin plugin, org.gtk.glib.Type gType, org.gtk.gobject.TypeInfo info, org.gtk.gobject.TypeValueTable valueTable);

    @ApiStatus.Internal default void upcall(MemoryAddress plugin, long gType, MemoryAddress info, MemoryAddress valueTable) {
        run((org.gtk.gobject.TypePlugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gtk.gobject.TypePlugin.fromAddress).marshal(plugin, Ownership.NONE), new org.gtk.glib.Type(gType), org.gtk.gobject.TypeInfo.fromAddress.marshal(info, Ownership.NONE), org.gtk.gobject.TypeValueTable.fromAddress.marshal(valueTable, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TypePluginCompleteTypeInfo.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
