package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAppChooserWidget` is a widget for selecting applications.
 * 
 * It is the main building block for [class@Gtk.AppChooserDialog].
 * Most applications only need to use the latter; but you can use
 * this widget as part of a larger widget if you have special needs.
 * 
 * `GtkAppChooserWidget` offers detailed control over what applications
 * are shown, using the
 * [property@Gtk.AppChooserWidget:show-default],
 * [property@Gtk.AppChooserWidget:show-recommended],
 * [property@Gtk.AppChooserWidget:show-fallback],
 * [property@Gtk.AppChooserWidget:show-other] and
 * [property@Gtk.AppChooserWidget:show-all] properties. See the
 * [iface@Gtk.AppChooser] documentation for more information about these
 * groups of applications.
 * 
 * To keep track of the selected application, use the
 * [signal@Gtk.AppChooserWidget::application-selected] and
 * [signal@Gtk.AppChooserWidget::application-activated] signals.
 * 
 * # CSS nodes
 * 
 * `GtkAppChooserWidget` has a single CSS node with name appchooser.
 */
public class AppChooserWidget extends Widget implements Accessible, AppChooser, Buildable, ConstraintTarget {

    public AppChooserWidget(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AppChooserWidget */
    public static AppChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserWidget(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkAppChooserWidget` for applications
     * that can handle content of the given type.
     */
    public AppChooserWidget(java.lang.String contentType) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_new(Interop.getAllocator().allocateUtf8String(contentType)), false));
    }
    
    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     */
    public java.lang.String getDefaultText() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_default_text(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the app chooser should show all applications
     * in a flat list.
     */
    public boolean getShowAll() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_show_all(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public boolean getShowDefault() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_show_default(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public boolean getShowFallback() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_show_fallback(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public boolean getShowOther() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_show_other(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public boolean getShowRecommended() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_get_show_recommended(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     */
    public void setDefaultText(java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_default_text(HANDLE(), Interop.getAllocator().allocateUtf8String(text));
    }
    
    /**
     * Sets whether the app chooser should show all applications
     * in a flat list.
     */
    public void setShowAll(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_show_all(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public void setShowDefault(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_show_default(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public void setShowFallback(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_show_fallback(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public void setShowOther(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_show_other(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public void setShowRecommended(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_app_chooser_widget_set_show_recommended(HANDLE(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ApplicationActivatedHandler {
        void signalReceived(AppChooserWidget source, org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is activated from the widget's list.
     * 
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     */
    public void onApplicationActivated(ApplicationActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserWidgetApplicationActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("application-activated"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationSelectedHandler {
        void signalReceived(AppChooserWidget source, org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is selected from the widget's list.
     */
    public void onApplicationSelected(ApplicationSelectedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserWidgetApplicationSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("application-selected"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
