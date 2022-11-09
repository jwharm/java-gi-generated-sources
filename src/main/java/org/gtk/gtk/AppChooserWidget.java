package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAppChooserWidget} has a single CSS node with name appchooser.
 */
public class AppChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.AppChooser, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAppChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AppChooserWidget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppChooserWidget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AppChooserWidget if its GType is a (or inherits from) "GtkAppChooserWidget".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AppChooserWidget" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooserWidget", a ClassCastException will be thrown.
     */
    public static AppChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAppChooserWidget"))) {
            return new AppChooserWidget(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAppChooserWidget");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_widget_new.invokeExact(
                    Interop.allocateNativeString(contentType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAppChooserWidget} for applications
     * that can handle content of the given type.
     * @param contentType the content type to show applications for
     */
    public AppChooserWidget(@NotNull java.lang.String contentType) {
        super(constructNew(contentType), Ownership.NONE);
    }
    
    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     * @return the value of {@code Gtk.AppChooserWidget:default-text}
     */
    public @Nullable java.lang.String getDefaultText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_widget_get_default_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the app chooser should show all applications
     * in a flat list.
     * @return the value of {@code Gtk.AppChooserWidget:show-all}
     */
    public boolean getShowAll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-default}
     */
    public boolean getShowDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-fallback}
     */
    public boolean getShowFallback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_fallback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     * @return the value of {@code Gtk.AppChooserWidget:show-other}
     */
    public boolean getShowOther() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_other.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-recommended}
     */
    public boolean getShowRecommended() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_recommended.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     * @param text the new value for {@code Gtk.AppChooserWidget:default-text}
     */
    public void setDefaultText(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_app_chooser_widget_set_default_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the app chooser should show all applications
     * in a flat list.
     * @param setting the new value for {@code Gtk.AppChooserWidget:show-all}
     */
    public void setShowAll(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_widget_set_show_all.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the app chooser should show the default handler
     * for the content type in a separate section.
     * @param setting the new value for {@code Gtk.AppChooserWidget:show-default}
     */
    public void setShowDefault(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_widget_set_show_default.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the app chooser should show related applications
     * for the content type in a separate section.
     * @param setting the new value for {@code Gtk.AppChooserWidget:show-fallback}
     */
    public void setShowFallback(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_widget_set_show_fallback.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the app chooser should show applications
     * which are unrelated to the content type.
     * @param setting the new value for {@code Gtk.AppChooserWidget:show-other}
     */
    public void setShowOther(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_widget_set_show_other.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     * @param setting the new value for {@code Gtk.AppChooserWidget:show-recommended}
     */
    public void setShowRecommended(boolean setting) {
        try {
            DowncallHandles.gtk_app_chooser_widget_set_show_recommended.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationActivated {
        void signalReceived(AppChooserWidget source, @NotNull org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is activated from the widget's list.
     * <p>
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserWidget.ApplicationActivated> onApplicationActivated(AppChooserWidget.ApplicationActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("application-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.Callbacks.class, "signalAppChooserWidgetApplicationActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserWidget.ApplicationActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationSelected {
        void signalReceived(AppChooserWidget source, @NotNull org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is selected from the widget's list.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserWidget.ApplicationSelected> onApplicationSelected(AppChooserWidget.ApplicationSelected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("application-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.Callbacks.class, "signalAppChooserWidgetApplicationSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserWidget.ApplicationSelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_widget_new = Interop.downcallHandle(
            "gtk_app_chooser_widget_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_default_text = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_default_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_all = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_all",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_default = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_default",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_fallback = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_fallback",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_other = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_other",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_recommended = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_recommended",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_default_text = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_default_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_all = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_default = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_default",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_fallback = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_fallback",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_other = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_other",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_recommended = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_recommended",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppChooserWidget.ApplicationActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserWidget(source, Ownership.UNKNOWN), new org.gtk.gio.AppInfo.AppInfoImpl(application, Ownership.NONE));
        }
        
        public static void signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppChooserWidget.ApplicationSelected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserWidget(source, Ownership.UNKNOWN), new org.gtk.gio.AppInfo.AppInfoImpl(application, Ownership.NONE));
        }
    }
}
