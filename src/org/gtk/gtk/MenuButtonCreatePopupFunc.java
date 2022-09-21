package org.gtk.gtk;

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
        void onMenuButtonCreatePopupFunc(MenuButton menuButton);
}
