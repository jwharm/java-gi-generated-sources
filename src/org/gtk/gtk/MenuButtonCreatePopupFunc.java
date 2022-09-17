package org.gtk.gtk;

/**
 * User-provided callback function to create a popup for a<code>GtkMenuButton</code> on demand.
 * 
 * This function is called when the popup of @menu_button is shown,
 * but none has been provided via {@link org.gtk.gtk.MenuButton#setPopover}
 * or {@link org.gtk.gtk.MenuButton#setMenuModel}.
 */
@FunctionalInterface
public interface MenuButtonCreatePopupFunc {
        void onMenuButtonCreatePopupFunc(MenuButton menuButton);
}
