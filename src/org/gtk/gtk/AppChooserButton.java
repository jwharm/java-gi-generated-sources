package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkAppChooserButton` lets the user select an application.
 * 
 * ![An example GtkAppChooserButton](appchooserbutton.png)
 * 
 * Initially, a `GtkAppChooserButton` selects the first application
 * in its list, which will either be the most-recently used application
 * or, if [property@Gtk.AppChooserButton:show-default-item] is %TRUE, the
 * default application.
 * 
 * The list of applications shown in a `GtkAppChooserButton` includes
 * the recommended applications for the given content type. When
 * [property@Gtk.AppChooserButton:show-default-item] is set, the default
 * application is also included. To let the user chooser other applications,
 * you can set the [property@Gtk.AppChooserButton:show-dialog-item] property,
 * which allows to open a full [class@Gtk.AppChooserDialog].
 * 
 * It is possible to add custom items to the list, using
 * [method@Gtk.AppChooserButton.append_custom_item]. These items cause
 * the [signal@Gtk.AppChooserButton::custom-item-activated] signal to be
 * emitted when they are selected.
 * 
 * To track changes in the selected application, use the
 * [signal@Gtk.AppChooserButton::changed] signal.
 * 
 * # CSS nodes
 * 
 * `GtkAppChooserButton` has a single CSS node with the name “appchooserbutton”.
 */
public class AppChooserButton extends Widget implements Accessible, AppChooser, Buildable, ConstraintTarget {

    public AppChooserButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AppChooserButton */
    public static AppChooserButton castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserButton(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAppChooserButton` for applications
     * that can handle content of the given type.
     */
    public AppChooserButton(java.lang.String contentType) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_new(Interop.getAllocator().allocateUtf8String(contentType)), false));
    }
    
    /**
     * Appends a custom item to the list of applications that is shown
     * in the popup.
     * 
     * The item name must be unique per-widget. Clients can use the
     * provided name as a detail for the
     * [signal@Gtk.AppChooserButton::custom-item-activated] signal, to add a
     * callback for the activation of a particular custom item in the list.
     * 
     * See also [method@Gtk.AppChooserButton.append_separator].
     */
    public void appendCustomItem(java.lang.String name, java.lang.String label, org.gtk.gio.Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_append_custom_item(HANDLE(), Interop.getAllocator().allocateUtf8String(name), Interop.getAllocator().allocateUtf8String(label), icon.HANDLE());
    }
    
    /**
     * Appends a separator to the list of applications that is shown
     * in the popup.
     */
    public void appendSeparator() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_append_separator(HANDLE());
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     */
    public java.lang.String getHeading() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_get_heading(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the dialog is modal.
     */
    public boolean getModal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_get_modal(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the dropdown menu should show the default
     * application at the top.
     */
    public boolean getShowDefaultItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_get_show_default_item(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the dropdown menu shows an item
     * for a `GtkAppChooserDialog`.
     */
    public boolean getShowDialogItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_get_show_dialog_item(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Selects a custom item.
     * 
     * See [method@Gtk.AppChooserButton.append_custom_item].
     * 
     * Use [method@Gtk.AppChooser.refresh] to bring the selection
     * to its initial state.
     */
    public void setActiveCustomItem(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_set_active_custom_item(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * 
     * If the heading is not set, the dialog displays a default text.
     */
    public void setHeading(java.lang.String heading) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_set_heading(HANDLE(), Interop.getAllocator().allocateUtf8String(heading));
    }
    
    /**
     * Sets whether the dialog should be modal.
     */
    public void setModal(boolean modal) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_set_modal(HANDLE(), modal ? 1 : 0);
    }
    
    /**
     * Sets whether the dropdown menu of this button should show the
     * default application for the given content type at top.
     */
    public void setShowDefaultItem(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_set_show_default_item(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the dropdown menu of this button should show an
     * entry to trigger a `GtkAppChooserDialog`.
     */
    public void setShowDialogItem(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_button_set_show_dialog_item(HANDLE(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted to when the button is activated.
     * 
     * The `::activate` signal on `GtkAppChooserButton` is an action signal and
     * emitting it causes the button to pop up its dialog.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(AppChooserButton source);
    }
    
    /**
     * Emitted when the active application changes.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserButtonChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CustomItemActivatedHandler {
        void signalReceived(AppChooserButton source, java.lang.String itemName);
    }
    
    /**
     * Emitted when a custom item is activated.
     * 
     * Use [method@Gtk.AppChooserButton.append_custom_item],
     * to add custom items.
     */
    public void onCustomItemActivated(CustomItemActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserButtonCustomItemActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("custom-item-activated"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
