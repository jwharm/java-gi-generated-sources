package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPasswordEntry} is an entry that has been tailored for entering secrets.
 * <p>
 * <img src="./doc-files/password-entry.png" alt="An example GtkPasswordEntry">
 * <p>
 * It does not show its contents in clear text, does not allow to copy it
 * to the clipboard, and it shows a warning when Caps Lock is engaged. If
 * the underlying platform allows it, {@code GtkPasswordEntry} will also place
 * the text in a non-pageable memory area, to avoid it being written out
 * to disk by the operating system.
 * <p>
 * Optionally, it can offer a way to reveal the contents in clear text.
 * <p>
 * {@code GtkPasswordEntry} provides only minimal API and should be used with
 * the {@code Gtk.Editable} API.
 * <p>
 * <h1>CSS Nodes</h1>
 * <p>
 * <pre>{@code 
 * entry.password
 * ╰── text
 *     ├── image.caps-lock-indicator
 *     ┊
 * }</pre>
 * <p>
 * {@code GtkPasswordEntry} has a single CSS node with name entry that carries
 * a .passwordstyle class. The text Css node below it has a child with
 * name image and style class .caps-lock-indicator for the Caps Lock
 * icon, and possibly other children.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkPasswordEntry} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class PasswordEntry extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public PasswordEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PasswordEntry */
    public static PasswordEntry castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntry(gobject.refcounted());
    }
    
    static final MethodHandle gtk_password_entry_new = Interop.downcallHandle(
        "gtk_password_entry_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_password_entry_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkPasswordEntry}.
     */
    public PasswordEntry() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_password_entry_get_extra_menu = Interop.downcallHandle(
        "gtk_password_entry_get_extra_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        try {
            var RESULT = (MemoryAddress) gtk_password_entry_get_extra_menu.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_password_entry_get_show_peek_icon = Interop.downcallHandle(
        "gtk_password_entry_get_show_peek_icon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the entry is showing an icon to
     * reveal the contents.
     */
    public boolean getShowPeekIcon() {
        try {
            var RESULT = (int) gtk_password_entry_get_show_peek_icon.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_password_entry_set_extra_menu = Interop.downcallHandle(
        "gtk_password_entry_set_extra_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        try {
            gtk_password_entry_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_password_entry_set_show_peek_icon = Interop.downcallHandle(
        "gtk_password_entry_set_show_peek_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the entry should have a clickable icon
     * to reveal the contents.
     * <p>
     * Setting this to {@code false} also hides the text again.
     */
    public void setShowPeekIcon(boolean showPeekIcon) {
        try {
            gtk_password_entry_set_show_peek_icon.invokeExact(handle(), showPeekIcon ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(PasswordEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PasswordEntry.Callbacks.class, "signalPasswordEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalPasswordEntryActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (PasswordEntry.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new PasswordEntry(Refcounted.get(source)));
        }
        
    }
}
