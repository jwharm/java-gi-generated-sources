package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that is passed to
 * gtk_print_run_page_setup_dialog_async().
 * <p>
 * This function will be called when the page setup dialog
 * is dismissed, and also serves as destroy notify for {@code data}.
 */
/**
 * Functional interface declaration of the {@code PageSetupDoneFunc} callback.
 */
@FunctionalInterface
public interface PageSetupDoneFunc {

    /**
     * The type of function that is passed to
     * gtk_print_run_page_setup_dialog_async().
     * <p>
     * This function will be called when the page setup dialog
     * is dismissed, and also serves as destroy notify for {@code data}.
     */
    void run(org.gtk.gtk.PageSetup pageSetup);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pageSetup, MemoryAddress data) {
        run((org.gtk.gtk.PageSetup) Interop.register(pageSetup, org.gtk.gtk.PageSetup.fromAddress).marshal(pageSetup, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PageSetupDoneFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
