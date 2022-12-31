package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectSetPropertyFunc {
    void run(org.gtk.gobject.GObject object, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);

    @ApiStatus.Internal default void upcall(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
        run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ObjectSetPropertyFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
