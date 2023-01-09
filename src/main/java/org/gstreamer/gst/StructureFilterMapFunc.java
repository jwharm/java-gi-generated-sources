package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_structure_filter_and_map_in_place().
 * The function may modify {@code value}, and the value will be removed from
 * the structure if {@code false} is returned.
 */
/**
 * Functional interface declaration of the {@code StructureFilterMapFunc} callback.
 */
@FunctionalInterface
public interface StructureFilterMapFunc {

    /**
     * A function that will be called in gst_structure_filter_and_map_in_place().
     * The function may modify {@code value}, and the value will be removed from
     * the structure if {@code false} is returned.
     */
    boolean run(org.gtk.glib.Quark fieldId, org.gtk.gobject.Value value);
    
    @ApiStatus.Internal default int upcall(int fieldId, MemoryAddress value, MemoryAddress userData) {
        var RESULT = run(new org.gtk.glib.Quark(fieldId), org.gtk.gobject.Value.fromAddress.marshal(value, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StructureFilterMapFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
