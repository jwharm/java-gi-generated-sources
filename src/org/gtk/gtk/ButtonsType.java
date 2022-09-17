package org.gtk.gtk;

/**
 * Prebuilt sets of buttons for <code>GtkDialog</code>.
 * 
 * If none of these choices are appropriate, simply use
 * {@link org.gtk.gtk.ButtonsType#NONE} and call {@link org.gtk.gtk.Dialog#addButtons}.
 * 
 * &#62; Please note that <code>GTK_BUTTONS_OK,</code> <code>GTK_BUTTONS_YES_NO
 * &#62;</code> and {@link org.gtk.gtk.ButtonsType#OK_CANCEL} are discouraged by the
 * &#62; {@link [GNOME Human Interface Guidelines]}(http://library.gnome.org/devel/hig-book/stable/).
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
