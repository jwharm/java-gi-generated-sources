package org.gtk.gtk;

/**
 * Prebuilt sets of buttons for `GtkDialog`.
 * 
 * If none of these choices are appropriate, simply use
 * %GTK_BUTTONS_NONE and call [method@Gtk.Dialog.add_buttons].
 * 
 * > Please note that %GTK_BUTTONS_OK, %GTK_BUTTONS_YES_NO
 * > and %GTK_BUTTONS_OK_CANCEL are discouraged by the
 * > [GNOME Human Interface Guidelines](http://library.gnome.org/devel/hig-book/stable/).
 */
public enum ButtonsType {

    /**
     * no buttons at all
     */
    NONE,
    
    /**
     * an OK button
     */
    OK,
    
    /**
     * a Close button
     */
    CLOSE,
    
    /**
     * a Cancel button
     */
    CANCEL,
    
    /**
     * Yes and No buttons
     */
    YES_NO,
    
    /**
     * OK and Cancel buttons
     */
    OK_CANCEL;
    
    public static ButtonsType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> OK;
            case 2 -> CLOSE;
            case 3 -> CANCEL;
            case 4 -> YES_NO;
            case 5 -> OK_CANCEL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case OK -> 1;
            case CLOSE -> 2;
            case CANCEL -> 3;
            case YES_NO -> 4;
            case OK_CANCEL -> 5;
        };
    }

}
