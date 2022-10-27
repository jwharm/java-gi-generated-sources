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
        void onMenuButtonCreatePopupFunc(@NotNull org.gtk.gtk.MenuButton menuButton);
}
