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
@FunctionalInterface
public interface PageSetupDoneFunc {
    void run(org.gtk.gtk.PageSetup pageSetup);

    @ApiStatus.Internal default void upcall(MemoryAddress pageSetup, MemoryAddress data) {
        run((org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pageSetup)), org.gtk.gtk.PageSetup.fromAddress).marshal(pageSetup, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PageSetupDoneFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
