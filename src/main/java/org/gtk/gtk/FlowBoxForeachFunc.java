package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_flow_box_selected_foreach().
 * <p>
 * It will be called on every selected child of the {@code box}.
 */
/**
 * Functional interface declaration of the {@code FlowBoxForeachFunc} callback.
 */
@FunctionalInterface
public interface FlowBoxForeachFunc {

    /**
     * A function used by gtk_flow_box_selected_foreach().
     * <p>
     * It will be called on every selected child of the {@code box}.
     */
    void run(org.gtk.gtk.FlowBox box, org.gtk.gtk.FlowBoxChild child);
    
    @ApiStatus.Internal default void upcall(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
        run((org.gtk.gtk.FlowBox) Interop.register(box, org.gtk.gtk.FlowBox.fromAddress).marshal(box, null), (org.gtk.gtk.FlowBoxChild) Interop.register(child, org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlowBoxForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
