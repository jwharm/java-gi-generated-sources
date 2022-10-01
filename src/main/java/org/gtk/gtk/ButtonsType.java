package org.gtk.gtk;

/**
 * Prebuilt sets of buttons for {@code GtkDialog}.
 * <p>
 * If none of these choices are appropriate, simply use
 * {@link ButtonsType#NONE} and call {@link Dialog#addButtons}.
 * <p>
 * > Please note that {@link ButtonsType#OK}, {@link ButtonsType#YES_NO}
 * > and {@link ButtonsType#OK_CANCEL} are discouraged by the
 * > <a href="http://library.gnome.org/devel/hig-book/stable/">GNOME Human Interface Guidelines</a>.
 */
public class ButtonsType extends io.github.jwharm.javagi.Enumeration {

    /**
     * no buttons at all
     */
    public static final ButtonsType NONE = new ButtonsType(0);
    
    /**
     * an OK button
     */
    public static final ButtonsType OK = new ButtonsType(1);
    
    /**
     * a Close button
     */
    public static final ButtonsType CLOSE = new ButtonsType(2);
    
    /**
     * a Cancel button
     */
    public static final ButtonsType CANCEL = new ButtonsType(3);
    
    /**
     * Yes and No buttons
     */
    public static final ButtonsType YES_NO = new ButtonsType(4);
    
    /**
     * OK and Cancel buttons
     */
    public static final ButtonsType OK_CANCEL = new ButtonsType(5);
    
    public ButtonsType(int value) {
        super(value);
    }
    
}
