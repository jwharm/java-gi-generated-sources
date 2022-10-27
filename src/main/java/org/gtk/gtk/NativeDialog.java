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
public class NativeDialog extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("GtkNativeDialog");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public NativeDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NativeDialog */
    public static NativeDialog castFrom(org.gtk.gobject.Object gobject) {
        return new NativeDialog(gobject.refcounted());
    }
    
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
            DowncallHandles.gtk_native_dialog_destroy.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_native_dialog_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_dialog_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the transient parent for this window.
     * @return the transient parent for this window,
     *   or {@code null} if no transient parent has been set.
     */
    public @Nullable org.gtk.gtk.Window getTransientFor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_native_dialog_get_transient_for.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Window(Refcounted.get(RESULT, false));
    }
    
    /**
     * Determines whether the dialog is visible.
     * @return {@code true} if the dialog is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_native_dialog_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            DowncallHandles.gtk_native_dialog_hide.invokeExact(handle());
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
            DowncallHandles.gtk_native_dialog_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of the {@code GtkNativeDialog.}
     * @param title title of the dialog
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.gtk_native_dialog_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
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
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_native_dialog_set_transient_for.invokeExact(handle(), parent.handle());
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
            DowncallHandles.gtk_native_dialog_show.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Response {
        void signalReceived(NativeDialog source, int responseId);
    }
    
    /**
     * Emitted when the user responds to the dialog.
     * <p>
     * When this is called the dialog has been hidden.
     * <p>
     * If you call {@link NativeDialog#hide} before the user
     * responds to the dialog this signal will not be emitted.
     */
    public Signal<NativeDialog.Response> onResponse(NativeDialog.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("response"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(NativeDialog.Callbacks.class, "signalNativeDialogResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<NativeDialog.Response>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_native_dialog_destroy = Interop.downcallHandle(
            "gtk_native_dialog_destroy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_get_modal = Interop.downcallHandle(
            "gtk_native_dialog_get_modal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_get_title = Interop.downcallHandle(
            "gtk_native_dialog_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_get_transient_for = Interop.downcallHandle(
            "gtk_native_dialog_get_transient_for",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_get_visible = Interop.downcallHandle(
            "gtk_native_dialog_get_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_hide = Interop.downcallHandle(
            "gtk_native_dialog_hide",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_set_modal = Interop.downcallHandle(
            "gtk_native_dialog_set_modal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_native_dialog_set_title = Interop.downcallHandle(
            "gtk_native_dialog_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_set_transient_for = Interop.downcallHandle(
            "gtk_native_dialog_set_transient_for",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_native_dialog_show = Interop.downcallHandle(
            "gtk_native_dialog_show",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalNativeDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (NativeDialog.Response) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new NativeDialog(Refcounted.get(source)), responseId);
        }
    }
}
