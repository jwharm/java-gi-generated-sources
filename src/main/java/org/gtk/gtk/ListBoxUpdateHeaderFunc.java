package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Whenever {@code row} changes or which row is before {@code row} changes this
 * is called, which lets you update the header on {@code row}.
 * <p>
 * You may remove or set a new one via {@link ListBoxRow#setHeader}
 * or just change the state of the current header widget.
 */
@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {
    void run(org.gtk.gtk.ListBoxRow row, @Nullable org.gtk.gtk.ListBoxRow before);

    @ApiStatus.Internal default void upcall(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
        run((org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(row)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, Ownership.NONE), (org.gtk.gtk.ListBoxRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(before)), org.gtk.gtk.ListBoxRow.fromAddress).marshal(before, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ListBoxUpdateHeaderFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
