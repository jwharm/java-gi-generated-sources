package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAppChooserWidget} is a widget for selecting applications.
 * <p>
 * It is the main building block for {@link AppChooserDialog}.
 * Most applications only need to use the latter; but you can use
 * this widget as part of a larger widget if you have special needs.
 * <p>
 * {@code GtkAppChooserWidget} offers detailed control over what applications
 * are shown, using the
 * {@code Gtk.AppChooserWidget:show-default},
 * {@code Gtk.AppChooserWidget:show-recommended},
 * {@code Gtk.AppChooserWidget:show-fallback},
 * {@code Gtk.AppChooserWidget:show-other} and
 * {@code Gtk.AppChooserWidget:show-all} properties. See the
 * {@code Gtk.AppChooser} documentation for more information about these
 * groups of applications.
 * <p>
 * To keep track of the selected application, use the
 * {@code Gtk.AppChooserWidget::application-selected} and
 * {@code Gtk.AppChooserWidget::application-activated} signals.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkAppChooserWidget} has a single CSS node with name appchooser.
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
     * Creates a new {@code GtkAppChooserWidget} for applications
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
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public boolean getShowDefault() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_default(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public boolean getShowFallback() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_fallback(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public boolean getShowOther() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_other(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public boolean getShowRecommended() {
        var RESULT = gtk_h.gtk_app_chooser_widget_get_show_recommended(handle());
        return RESULT != 0;
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
     * Emitted when an application item is activated from the widget's list.
     * <p>
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     */
    public SignalHandle onApplicationActivated(ApplicationActivatedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("application-activated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.class, "__signalAppChooserWidgetApplicationActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (AppChooserWidget.ApplicationActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(References.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(References.get(application, false)));
    }
    
    @FunctionalInterface
    public interface ApplicationSelectedHandler {
        void signalReceived(AppChooserWidget source, org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is selected from the widget's list.
     */
    public SignalHandle onApplicationSelected(ApplicationSelectedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("application-selected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.class, "__signalAppChooserWidgetApplicationSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (AppChooserWidget.ApplicationSelectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(References.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(References.get(application, false)));
    }
    
}
