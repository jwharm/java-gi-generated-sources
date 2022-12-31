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
    
    private static final java.lang.String C_TYPE_NAME = "GtkPasswordEntry";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PasswordEntry proxy instance for the provided memory address.
     * <p>
     * Because PasswordEntry is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PasswordEntry(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PasswordEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PasswordEntry(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_password_entry_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkPasswordEntry}.
     */
    public PasswordEntry() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the menu model set with gtk_password_entry_set_extra_menu().
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_password_entry_get_extra_menu.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the entry is showing an icon to
     * reveal the contents.
     * @return {@code true} if an icon is shown
     */
    public boolean getShowPeekIcon() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_password_entry_get_show_peek_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets a menu model to add when constructing
     * the context menu for {@code entry}.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            DowncallHandles.gtk_password_entry_set_extra_menu.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
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
            DowncallHandles.gtk_password_entry_set_show_peek_icon.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showPeekIcon, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_password_entry_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePasswordEntry) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PasswordEntry.Activate> onActivate(PasswordEntry.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link PasswordEntry.Builder} object constructs a {@link PasswordEntry} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PasswordEntry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PasswordEntry} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PasswordEntry}.
         * @return A new instance of {@code PasswordEntry} with the properties 
         *         that were set in the Builder object.
         */
        public PasswordEntry build() {
            return (PasswordEntry) org.gtk.gobject.GObject.newWithProperties(
                PasswordEntry.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to activate the default widget when Enter is pressed.
         * @param activatesDefault The value for the {@code activates-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivatesDefault(boolean activatesDefault) {
            names.add("activates-default");
            values.add(org.gtk.gobject.Value.create(activatesDefault));
            return this;
        }
        
        /**
         * A menu model whose contents will be appended to
         * the context menu.
         * @param extraMenu The value for the {@code extra-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtraMenu(org.gtk.gio.MenuModel extraMenu) {
            names.add("extra-menu");
            values.add(org.gtk.gobject.Value.create(extraMenu));
            return this;
        }
        
        /**
         * The text that will be displayed in the {@code GtkPasswordEntry}
         * when it is empty and unfocused.
         * @param placeholderText The value for the {@code placeholder-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        /**
         * Whether to show an icon for revealing the content.
         * @param showPeekIcon The value for the {@code show-peek-icon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowPeekIcon(boolean showPeekIcon) {
            names.add("show-peek-icon");
            values.add(org.gtk.gobject.Value.create(showPeekIcon));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_password_entry_new = Interop.downcallHandle(
            "gtk_password_entry_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_password_entry_get_extra_menu = Interop.downcallHandle(
            "gtk_password_entry_get_extra_menu",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_password_entry_get_show_peek_icon = Interop.downcallHandle(
            "gtk_password_entry_get_show_peek_icon",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_password_entry_set_extra_menu = Interop.downcallHandle(
            "gtk_password_entry_set_extra_menu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_password_entry_set_show_peek_icon = Interop.downcallHandle(
            "gtk_password_entry_set_show_peek_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_password_entry_get_type = Interop.downcallHandle(
            "gtk_password_entry_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
