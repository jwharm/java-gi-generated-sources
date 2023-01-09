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
/**
 * Functional interface declaration of the {@code ListBoxUpdateHeaderFunc} callback.
 */
@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {

    /**
     * Whenever {@code row} changes or which row is before {@code row} changes this
     * is called, which lets you update the header on {@code row}.
     * <p>
     * You may remove or set a new one via {@link ListBoxRow#setHeader}
     * or just change the state of the current header widget.
     */
    void run(org.gtk.gtk.ListBoxRow row, @Nullable org.gtk.gtk.ListBoxRow before);
    
    @ApiStatus.Internal default void upcall(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
        run((org.gtk.gtk.ListBoxRow) Interop.register(row, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, null), (org.gtk.gtk.ListBoxRow) Interop.register(before, org.gtk.gtk.ListBoxRow.fromAddress).marshal(before, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListBoxUpdateHeaderFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
