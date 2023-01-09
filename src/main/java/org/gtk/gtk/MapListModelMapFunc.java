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
/**
 * Functional interface declaration of the {@code MapListModelMapFunc} callback.
 */
@FunctionalInterface
public interface MapListModelMapFunc {

    /**
     * User function that is called to map an {@code item} of the original model to
     * an item expected by the map model.
     * <p>
     * The returned items must conform to the item type of the model they are
     * used with.
     */
    org.gtk.gobject.GObject run(org.gtk.gobject.GObject item);
    
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
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MapListModelMapFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
