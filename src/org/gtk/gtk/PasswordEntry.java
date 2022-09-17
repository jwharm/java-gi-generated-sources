package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPasswordEntry</code> is an entry that has been tailored for entering secrets.
 * <p>
 * !{@link [An example GtkPasswordEntry]}(password-entry.png)
 * <p>
 * It does not show its contents in clear text, does not allow to copy it
 * to the clipboard, and it shows a warning when Caps Lock is engaged. If
 * the underlying platform allows it, <code>GtkPasswordEntry</code> will also place
 * the text in a non-pageable memory area, to avoid it being written out
 * to disk by the operating system.
 * <p>
 * Optionally, it can offer a way to reveal the contents in clear text.
 * <p><code>GtkPasswordEntry</code> provides only minimal API and should be used with
 * the {@link [iface@Gtk.Editable] (ref=iface)} API.
 * <p>
 * <h1>SS Nodes</h1>
 * <p><pre>
 * entry.password
 * &#9584;&#9472;&#9472; text
 *     &#9500;&#9472;&#9472; image.caps-lock-indicator
 *     &#9482;
 * </pre>
 * <p><code>GtkPasswordEntry</code> has a single CSS node with name entry that carries
 * a .passwordstyle class. The text Css node below it has a child with
 * name image and style class .caps-lock-indicator for the Caps Lock
 * icon, and possibly other children.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkPasswordEntry</code> uses the {@link org.gtk.gtk.AccessibleRole#TEXT_BOX} role.
 */
public class PasswordEntry extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public PasswordEntry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PasswordEntry */
    public static PasswordEntry castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntry(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_password_entry_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkPasswordEntry</code>.
     */
    public PasswordEntry() {
        super(constructNew());
    }
    
    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_password_entry_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the entry is showing an icon to
     * reveal the contents.
     */
    public boolean getShowPeekIcon() {
        var RESULT = gtk_h.gtk_password_entry_get_show_peek_icon(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @entry.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_password_entry_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Sets whether the entry should have a clickable icon
     * to reveal the contents.
     * 
     * Setting this to <code>false</code> also hides the text again.
     */
    public void setShowPeekIcon(boolean showPeekIcon) {
        gtk_h.gtk_password_entry_set_show_peek_icon(handle(), showPeekIcon ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(PasswordEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * 
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPasswordEntryActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
