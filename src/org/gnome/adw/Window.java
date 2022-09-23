package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A freeform window.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window.png" alt="window"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwWindow} widget is a subclass of {@link org.gtk.gtk.Window} which has no
 * titlebar area. It means {@link org.gtk.gtk.HeaderBar} can be used as follows:
 * <p>
 * <pre>{@code xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="GtkHeaderBar"/>
 *       </child>
 *       <child>
 *         <!-- ... -->
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * Using {@code Gtk.Window.set_titlebar}
 * is not supported and will result in a crash.
 */
public class Window extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {

    public Window(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Window */
    public static Window castFrom(org.gtk.gobject.Object gobject) {
        return new Window(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_window_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwWindow}.
     */
    public Window() {
        super(constructNew());
    }
    
    /**
     * Gets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#getChild}.
     */
    public org.gtk.gtk.Widget getContent() {
        var RESULT = gtk_h.adw_window_get_content(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the content widget of {@code self}.
     * <p>
     * This method should always be used instead of {@link org.gtk.gtk.Window#setChild}.
     */
    public void setContent(org.gtk.gtk.Widget content) {
        gtk_h.adw_window_set_content(handle(), content.handle());
    }
    
}
