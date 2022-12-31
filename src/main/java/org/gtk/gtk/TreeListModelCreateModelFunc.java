package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype of the function called to create new child models when
 * gtk_tree_list_row_set_expanded() is called.
 * <p>
 * This function can return {@code null} to indicate that {@code item} is guaranteed to be
 * a leaf node and will never have children. If it does not have children but
 * may get children later, it should return an empty model that is filled once
 * children arrive.
 */
@FunctionalInterface
public interface TreeListModelCreateModelFunc {
    @Nullable org.gtk.gio.ListModel run(org.gtk.gobject.GObject item);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(item)), org.gtk.gobject.GObject.fromAddress).marshal(item, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeListModelCreateModelFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
