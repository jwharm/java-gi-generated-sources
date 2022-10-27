package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS Nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkPasswordEntry} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class PasswordEntry extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PasswordEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PasswordEntry */
    public static PasswordEntry castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntry(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_password_entry_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkPasswordEntry}.
     */
    public PasswordEntry() {
        super(constructNew());
    }
    
    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_password_entry_get_extra_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the entry is showing an icon to
     * reveal the contents.
     * @return {@code true} if an icon is shown
     */
    public boolean getShowPeekIcon() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_password_entry_get_show_peek_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_password_entry_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the entry should have a clickable icon
     * to reveal the contents.
     * <p>
     * Setting this to {@code false} also hides the text again.
     * @param showPeekIcon whether to show the peek icon
     */
    public void setShowPeekIcon(boolean showPeekIcon) {
        try {
            DowncallHandles.gtk_password_entry_set_show_peek_icon.invokeExact(handle(), showPeekIcon ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(PasswordEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     */
    public Signal<PasswordEntry.Activate> onActivate(PasswordEntry.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PasswordEntry.Callbacks.class, "signalPasswordEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PasswordEntry.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_password_entry_new = Interop.downcallHandle(
            "gtk_password_entry_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_password_entry_get_extra_menu = Interop.downcallHandle(
            "gtk_password_entry_get_extra_menu",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_password_entry_get_show_peek_icon = Interop.downcallHandle(
            "gtk_password_entry_get_show_peek_icon",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_password_entry_set_extra_menu = Interop.downcallHandle(
            "gtk_password_entry_set_extra_menu",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_password_entry_set_show_peek_icon = Interop.downcallHandle(
            "gtk_password_entry_set_show_peek_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalPasswordEntryActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (PasswordEntry.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PasswordEntry(Refcounted.get(source)));
        }
    }
}
