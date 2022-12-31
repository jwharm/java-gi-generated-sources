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
@FunctionalInterface
public interface FlowBoxForeachFunc {
    void run(org.gtk.gtk.FlowBox box, org.gtk.gtk.FlowBoxChild child);

    @ApiStatus.Internal default void upcall(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
        run((org.gtk.gtk.FlowBox) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(box)), org.gtk.gtk.FlowBox.fromAddress).marshal(box, Ownership.NONE), (org.gtk.gtk.FlowBoxChild) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(child)), org.gtk.gtk.FlowBoxChild.fromAddress).marshal(child, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlowBoxForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
