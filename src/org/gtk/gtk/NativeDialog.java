package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Native dialogs are platform dialogs that don't use `GtkDialog`.
 * 
 * They are used in order to integrate better with a platform, by
 * looking the same as other native applications and supporting
 * platform specific features.
 * 
 * The [class@Gtk.Dialog] functions cannot be used on such objects,
 * but we need a similar API in order to drive them. The `GtkNativeDialog`
 * object is an API that allows you to do this. It allows you to set
 * various common properties on the dialog, as well as show and hide
 * it and get a [signal@Gtk.NativeDialog::response] signal when the user
 * finished with the dialog.
 * 
 * Note that unlike `GtkDialog`, `GtkNativeDialog` objects are not
 * toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 */
public class NativeDialog extends org.gtk.gobject.Object {

    public NativeDialog(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NativeDialog */
    public static NativeDialog castFrom(org.gtk.gobject.Object gobject) {
        return new NativeDialog(gobject.getProxy());
    }
    
    /**
     * Destroys a dialog.
     * 
     * When a dialog is destroyed, it will break any references it holds
     * to other objects.
     * 
     * If it is visible it will be hidden and any underlying window system
     * resources will be destroyed.
     * 
     * Note that this does not release any reference to the object (as opposed
     * to destroying a `GtkWindow`) because there is no reference from the
     * windowing system to the `GtkNativeDialog`.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_destroy(HANDLE());
    }
    
    /**
     * Returns whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_get_modal(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the title of the `GtkNativeDialog`.
     */
    public java.lang.String getTitle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_get_title(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the transient parent for this window.
     */
    public Window getTransientFor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_get_transient_for(HANDLE());
        return new Window(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Determines whether the dialog is visible.
     */
    public boolean getVisible() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_get_visible(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Hides the dialog if it is visible, aborting any interaction.
     * 
     * Once this is called the [signal@Gtk.NativeDialog::response] signal
     * will *not* be emitted until after the next call to
     * [method@Gtk.NativeDialog.show].
     * 
     * If the dialog is not visible this does nothing.
     */
    public void hide() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_hide(HANDLE());
    }
    
    /**
     * Sets a dialog modal or non-modal.
     * 
     * Modal dialogs prevent interaction with other windows in the same
     * application. To keep modal dialogs on top of main application
     * windows, use [method@Gtk.NativeDialog.set_transient_for] to make
     * the dialog transient for the parent; most window managers will
     * then disallow lowering the dialog below the parent.
     */
    public void setModal(boolean modal) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_set_modal(HANDLE(), modal ? 1 : 0);
    }
    
    /**
     * Sets the title of the `GtkNativeDialog.`
     */
    public void setTitle(java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_set_title(HANDLE(), Interop.getAllocator().allocateUtf8String(title));
    }
    
    /**
     * Dialog windows should be set transient for the main application
     * window they were spawned from.
     * 
     * This allows window managers to e.g. keep the dialog on top of the
     * main window, or center the dialog over the main window.
     * 
     * Passing %NULL for @parent unsets the current transient window.
     */
    public void setTransientFor(Window parent) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_set_transient_for(HANDLE(), parent.HANDLE());
    }
    
    /**
     * Shows the dialog on the display.
     * 
     * When the user accepts the state of the dialog the dialog will
     * be automatically hidden and the [signal@Gtk.NativeDialog::response]
     * signal will be emitted.
     * 
     * Multiple calls while the dialog is visible will be ignored.
     */
    public void show() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_native_dialog_show(HANDLE());
    }
    
    @FunctionalInterface
    public interface ResponseHandler {
        void signalReceived(NativeDialog source, int responseId);
    }
    
    /**
     * Emitted when the user responds to the dialog.
     * 
     * When this is called the dialog has been hidden.
     * 
     * If you call [method@Gtk.NativeDialog.hide] before the user
     * responds to the dialog this signal will not be emitted.
     */
    public void onResponse(ResponseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNativeDialogResponse", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("response"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
