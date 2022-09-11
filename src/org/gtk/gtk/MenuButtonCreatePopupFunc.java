package org.gtk.gtk;

/**
 * User-provided callback function to create a popup for a
 * `GtkMenuButton` on demand.
 * 
 * This function is called when the popup of @menu_button is shown,
 * but none has been provided via [method@Gtk.MenuButton.set_popover]
 * or [method@Gtk.MenuButton.set_menu_model].
 */
@FunctionalInterface
public interface MenuButtonCreatePopupFunc {
        void onMenuButtonCreatePopupFunc(MenuButton menuButton);
}
