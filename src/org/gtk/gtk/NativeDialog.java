package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public NativeDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NativeDialog */
    public static NativeDialog castFrom(org.gtk.gobject.Object gobject) {
        return new NativeDialog(gobject.getReference());
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
        gtk_h.gtk_native_dialog_destroy(handle());
    }
    
    /**
     * Returns whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.gtk_native_dialog_get_modal(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the title of the {@code GtkNativeDialog}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_native_dialog_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the transient parent for this window.
     */
    public Window getTransientFor() {
        var RESULT = gtk_h.gtk_native_dialog_get_transient_for(handle());
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Determines whether the dialog is visible.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_native_dialog_get_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Hides the dialog if it is visible, aborting any interaction.
     * <p>
     * Once this is called the {@code Gtk.NativeDialog::response} signal
     * will <strong>not</strong> be emitted until after the next call to
     * {@link NativeDialog#show}.
     * <p>
     * If the dialog is not visible this does nothing.
     */
    public void hide() {
        gtk_h.gtk_native_dialog_hide(handle());
    }
    
    /**
     * Sets a dialog modal or non-modal.
     * <p>
     * Modal dialogs prevent interaction with other windows in the same
     * application. To keep modal dialogs on top of main application
     * windows, use {@link NativeDialog#setTransientFor} to make
     * the dialog transient for the parent; most window managers will
     * then disallow lowering the dialog below the parent.
     */
    public void setModal(boolean modal) {
        gtk_h.gtk_native_dialog_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets the title of the {@code GtkNativeDialog.}
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_native_dialog_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Dialog windows should be set transient for the main application
     * window they were spawned from.
     * <p>
     * This allows window managers to e.g. keep the dialog on top of the
     * main window, or center the dialog over the main window.
     * <p>
     * Passing {@code null} for {@code parent} unsets the current transient window.
     */
    public void setTransientFor(Window parent) {
        gtk_h.gtk_native_dialog_set_transient_for(handle(), parent.handle());
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
        gtk_h.gtk_native_dialog_show(handle());
    }
    
    @FunctionalInterface
    public interface ResponseHandler {
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
    public SignalHandle onResponse(ResponseHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("response").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(NativeDialog.class, "__signalNativeDialogResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalNativeDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NativeDialog.ResponseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new NativeDialog(References.get(source)), responseId);
    }
    
}
