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
/**
 * Functional interface declaration of the {@code TreeListModelCreateModelFunc} callback.
 */
@FunctionalInterface
public interface TreeListModelCreateModelFunc {

    /**
     * Prototype of the function called to create new child models when
     * gtk_tree_list_row_set_expanded() is called.
     * <p>
     * This function can return {@code null} to indicate that {@code item} is guaranteed to be
     * a leaf node and will never have children. If it does not have children but
     * may get children later, it should return an empty model that is filled once
     * children arrive.
     */
    @Nullable org.gtk.gio.ListModel run(org.gtk.gobject.GObject item);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) Interop.register(item, org.gtk.gobject.GObject.fromAddress).marshal(item, null));
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TreeListModelCreateModelFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
