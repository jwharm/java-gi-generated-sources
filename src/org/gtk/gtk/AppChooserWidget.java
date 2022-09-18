package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAppChooserWidget</code> is a widget for selecting applications.
 * <p>
 * It is the main building block for {@link org.gtk.gtk.AppChooserDialog}.
 * Most applications only need to use the latter; but you can use
 * this widget as part of a larger widget if you have special needs.
 * <p><code>GtkAppChooserWidget</code> offers detailed control over what applications
 * are shown, using the
 * {@link [property@Gtk.AppChooserWidget:show-default] (ref=property)},
 * {@link [property@Gtk.AppChooserWidget:show-recommended] (ref=property)},
 * {@link [property@Gtk.AppChooserWidget:show-fallback] (ref=property)},
 * {@link [property@Gtk.AppChooserWidget:show-other] (ref=property)} and
 * {@link [property@Gtk.AppChooserWidget:show-all] (ref=property)} properties. See the
 * {@link [iface@Gtk.AppChooser] (ref=iface)} documentation for more information about these
 * groups of applications.
 * <p>
 * To keep track of the selected application, use the
 * {@link [signal@Gtk.AppChooserWidget::application-selected] (ref=signal)} and
 * {@link [signal@Gtk.AppChooserWidget::application-activated] (ref=signal)} signals.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkAppChooserWidget</code> has a single CSS node with name appchooser.
 */
public class AppChooserWidget extends Widget implements Accessible, AppChooser, Buildable, ConstraintTarget {

    public AppChooserWidget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppChooserWidget */
    public static AppChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserWidget(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String contentType) {
        Reference RESULT = References.get(gtk_h.gtk_app_chooser_widget_new(Interop.allocateNativeString(contentType).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkAppChooserWidget</code> for applications
     * that can handle content of the given type.
     */
    public AppChooserWidget(java.lang.String contentType) {
        super(constructNew(contentType));
    }
    
    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     */
    public java.lang.String getDefaultText() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_default_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the app chooser should show all applications
     * in a flat list.
     */
    public boolean getShowAll() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_all(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public boolean getShowDefault() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_default(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public boolean getShowFallback() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_fallback(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public boolean getShowOther() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_other(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public boolean getShowRecommended() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_recommended(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     */
    public void setDefaultText(java.lang.String text) {
        gtk_h.gtk_app_chooser_widget_set_default_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Sets whether the app chooser should show all applications
     * in a flat list.
     */
    public void setShowAll(boolean setting) {
        gtk_h.gtk_app_chooser_widget_set_show_all(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public void setShowDefault(boolean setting) {
        gtk_h.gtk_app_chooser_widget_set_show_default(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public void setShowFallback(boolean setting) {
        gtk_h.gtk_app_chooser_widget_set_show_fallback(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public void setShowOther(boolean setting) {
        gtk_h.gtk_app_chooser_widget_set_show_other(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public void setShowRecommended(boolean setting) {
        gtk_h.gtk_app_chooser_widget_set_show_recommended(handle(), setting ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ApplicationActivatedHandler {
        void signalReceived(AppChooserWidget source, org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is activated from the widget&<code>#39</code> s list.
     * 
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     */
    public SignalHandle onApplicationActivated(ApplicationActivatedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserWidgetApplicationActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("application-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationSelectedHandler {
        void signalReceived(AppChooserWidget source, org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is selected from the widget&<code>#39</code> s list.
     */
    public SignalHandle onApplicationSelected(ApplicationSelectedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppChooserWidgetApplicationSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("application-selected").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
