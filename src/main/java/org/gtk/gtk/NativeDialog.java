package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Native dialogs are platform dialogs that don't use {@code GtkDialog}.
 * <p>
 * They are used in order to integrate better with a platform, by
 * looking the same as other native applications and supporting
 * platform specific features.
 * <p>
 * The {@link Dialog} functions cannot be used on such objects,
 * but we need a similar API in order to drive them. The {@code GtkNativeDialog}
 * object is an API that allows you to do this. It allows you to set
 * various common properties on the dialog, as well as show and hide
 * it and get a {@code Gtk.NativeDialog::response} signal when the user
 * finished with the dialog.
 * <p>
 * Note that unlike {@code GtkDialog}, {@code GtkNativeDialog} objects are not
 * toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 */
public class NativeDialog extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNativeDialog";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NativeDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NativeDialog(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NativeDialog> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NativeDialog(input, ownership);
    
    /**
     * Destroys a dialog.
     * <p>
     * When a dialog is destroyed, it will break any references it holds
     * to other objects.
     * <p>
     * If it is visible it will be hidden and any underlying window system
     * resources will be destroyed.
     * <p>
     * Note that this does not release any reference to the object (as opposed
     * to destroying a {@code GtkWindow}) because there is no reference from the
     * windowing system to the {@code GtkNativeDialog}.
     */
    public void destroy() {
        try {
            DowncallHandles.gtk_native_dialog_destroy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the dialog is modal.
     * @return {@code true} if the dialog is set to be modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_native_dialog_get_modal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the title of the {@code GtkNativeDialog}.
     * @return the title of the dialog, or {@code null} if none has
     *    been set explicitly. The returned string is owned by the widget
     *    and must not be modified or freed.
     */
    public @Nullable java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_dialog_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Fetches the transient parent for this window.
     * @return the transient parent for this window,
     *   or {@code null} if no transient parent has been set.
     */
    public @Nullable org.gtk.gtk.Window getTransientFor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_dialog_get_transient_for.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Window.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines whether the dialog is visible.
     * @return {@code true} if the dialog is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_native_dialog_get_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Hides the dialog if it is visible, aborting any interaction.
     * <p>
     * Once this is called the {@code Gtk.NativeDialog::response} signal
     * will <em>not</em> be emitted until after the next call to
     * {@link NativeDialog#show}.
     * <p>
     * If the dialog is not visible this does nothing.
     */
    public void hide() {
        try {
            DowncallHandles.gtk_native_dialog_hide.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a dialog modal or non-modal.
     * <p>
     * Modal dialogs prevent interaction with other windows in the same
     * application. To keep modal dialogs on top of main application
     * windows, use {@link NativeDialog#setTransientFor} to make
     * the dialog transient for the parent; most window managers will
     * then disallow lowering the dialog below the parent.
     * @param modal whether the window is modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.gtk_native_dialog_set_modal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(modal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of the {@code GtkNativeDialog.}
     * @param title title of the dialog
     */
    public void setTitle(java.lang.String title) {
        try {
            DowncallHandles.gtk_native_dialog_set_title.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(title, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Dialog windows should be set transient for the main application
     * window they were spawned from.
     * <p>
     * This allows window managers to e.g. keep the dialog on top of the
     * main window, or center the dialog over the main window.
     * <p>
     * Passing {@code null} for {@code parent} unsets the current transient window.
     * @param parent parent window
     */
    public void setTransientFor(@Nullable org.gtk.gtk.Window parent) {
        try {
            DowncallHandles.gtk_native_dialog_set_transient_for.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shows the dialog on the display.
     * <p>
     * When the user accepts the state of the dialog the dialog will
     * be automatically hidden and the {@code Gtk.NativeDialog::response}
     * signal will be emitted.
     * <p>
     * Multiple calls while the dialog is visible will be ignored.
     */
    public void show() {
        try {
            DowncallHandles.gtk_native_dialog_show.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_native_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Response {
        void run(int responseId);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceNativeDialog, int responseId) {
            run(responseId);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Response.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the user responds to the dialog.
     * <p>
     * When this is called the dialog has been hidden.
     * <p>
     * If you call {@link NativeDialog#hide} before the user
     * responds to the dialog this signal will not be emitted.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<NativeDialog.Response> onResponse(NativeDialog.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("response"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link NativeDialog.Builder} object constructs a {@link NativeDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NativeDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NativeDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NativeDialog}.
         * @return A new instance of {@code NativeDialog} with the properties 
         *         that were set in the Builder object.
         */
        public NativeDialog build() {
            return (NativeDialog) org.gtk.gobject.GObject.newWithProperties(
                NativeDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the window should be modal with respect to its transient parent.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * The title of the dialog window
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * The transient parent of the dialog, or {@code null} for none.
         * @param transientFor The value for the {@code transient-for} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransientFor(org.gtk.gtk.Window transientFor) {
            names.add("transient-for");
            values.add(org.gtk.gobject.Value.create(transientFor));
            return this;
        }
        
        /**
         * Whether the window is currently visible.
         * @param visible The value for the {@code visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_native_dialog_destroy = Interop.downcallHandle(
            "gtk_native_dialog_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_get_modal = Interop.downcallHandle(
            "gtk_native_dialog_get_modal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_get_title = Interop.downcallHandle(
            "gtk_native_dialog_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_get_transient_for = Interop.downcallHandle(
            "gtk_native_dialog_get_transient_for",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_get_visible = Interop.downcallHandle(
            "gtk_native_dialog_get_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_hide = Interop.downcallHandle(
            "gtk_native_dialog_hide",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_set_modal = Interop.downcallHandle(
            "gtk_native_dialog_set_modal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_set_title = Interop.downcallHandle(
            "gtk_native_dialog_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_set_transient_for = Interop.downcallHandle(
            "gtk_native_dialog_set_transient_for",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_show = Interop.downcallHandle(
            "gtk_native_dialog_show",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_native_dialog_get_type = Interop.downcallHandle(
            "gtk_native_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
