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
@FunctionalInterface
public interface MenuButtonCreatePopupFunc {
    void run(org.gtk.gtk.MenuButton menuButton);

    @ApiStatus.Internal default void upcall(MemoryAddress menuButton, MemoryAddress userData) {
        run((org.gtk.gtk.MenuButton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(menuButton)), org.gtk.gtk.MenuButton.fromAddress).marshal(menuButton, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MenuButtonCreatePopupFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
