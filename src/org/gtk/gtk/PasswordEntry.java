package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPasswordEntry` is an entry that has been tailored for entering secrets.
 * 
 * ![An example GtkPasswordEntry](password-entry.png)
 * 
 * It does not show its contents in clear text, does not allow to copy it
 * to the clipboard, and it shows a warning when Caps Lock is engaged. If
 * the underlying platform allows it, `GtkPasswordEntry` will also place
 * the text in a non-pageable memory area, to avoid it being written out
 * to disk by the operating system.
 * 
 * Optionally, it can offer a way to reveal the contents in clear text.
 * 
 * `GtkPasswordEntry` provides only minimal API and should be used with
 * the [iface@Gtk.Editable] API.
 * 
 * # CSS Nodes
 * 
 * ```
 * entry.password
 * ╰── text
 *     ├── image.caps-lock-indicator
 *     ┊
 * ```
 * 
 * `GtkPasswordEntry` has a single CSS node with name entry that carries
 * a .passwordstyle class. The text Css node below it has a child with
 * name image and style class .caps-lock-indicator for the Caps Lock
 * icon, and possibly other children.
 * 
 * # Accessibility
 * 
 * `GtkPasswordEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 */
public class PasswordEntry extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public PasswordEntry(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PasswordEntry */
    public static PasswordEntry castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntry(gobject.getProxy());
    }
    
    /**
     * Creates a `GtkPasswordEntry`.
     */
    public PasswordEntry() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_new(), false));
    }
    
    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_get_extra_menu(HANDLE());
        return new org.gtk.gio.MenuModel(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns whether the entry is showing an icon to
     * reveal the contents.
     */
    public boolean getShowPeekIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_get_show_peek_icon(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for @entry.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_set_extra_menu(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets whether the entry should have a clickable icon
     * to reveal the contents.
     * 
     * Setting this to %FALSE also hides the text again.
     */
    public void setShowPeekIcon(boolean showPeekIcon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_set_show_peek_icon(HANDLE(), showPeekIcon ? 1 : 0);
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
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPasswordEntryActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
