package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User function that is called to map an {@code item} of the original model to
 * an item expected by the map model.
 * <p>
 * The returned items must conform to the item type of the model they are
 * used with.
 */
@FunctionalInterface
public interface MapListModelMapFunc {
    org.gtk.gobject.GObject run(org.gtk.gobject.GObject item);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(item)), org.gtk.gobject.GObject.fromAddress).marshal(item, Ownership.FULL));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MapListModelMapFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
