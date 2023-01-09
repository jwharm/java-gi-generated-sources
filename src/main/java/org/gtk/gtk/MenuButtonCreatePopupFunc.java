package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User-provided callback function to create a popup for a
 * {@code GtkMenuButton} on demand.
 * <p>
 * This function is called when the popup of {@code menu_button} is shown,
 * but none has been provided via {@link MenuButton#setPopover}
 * or {@link MenuButton#setMenuModel}.
 */
/**
 * Functional interface declaration of the {@code MenuButtonCreatePopupFunc} callback.
 */
@FunctionalInterface
public interface MenuButtonCreatePopupFunc {

    /**
     * User-provided callback function to create a popup for a
     * {@code GtkMenuButton} on demand.
     * <p>
     * This function is called when the popup of {@code menu_button} is shown,
     * but none has been provided via {@link MenuButton#setPopover}
     * or {@link MenuButton#setMenuModel}.
     */
    void run(org.gtk.gtk.MenuButton menuButton);
    
    @ApiStatus.Internal default void upcall(MemoryAddress menuButton, MemoryAddress userData) {
        run((org.gtk.gtk.MenuButton) Interop.register(menuButton, org.gtk.gtk.MenuButton.fromAddress).marshal(menuButton, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MenuButtonCreatePopupFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
