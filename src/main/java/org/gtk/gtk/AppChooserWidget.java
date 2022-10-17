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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkAppChooserWidget} has a single CSS node with name appchooser.
 */
public class AppChooserWidget extends Widget implements Accessible, AppChooser, Buildable, ConstraintTarget {

    public AppChooserWidget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AppChooserWidget */
    public static AppChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new AppChooserWidget(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_app_chooser_widget_new = Interop.downcallHandle(
        "gtk_app_chooser_widget_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String contentType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_app_chooser_widget_new.invokeExact(Interop.allocateNativeString(contentType)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserWidget} for applications
     * that can handle content of the given type.
     */
    public AppChooserWidget(@NotNull java.lang.String contentType) {
        super(constructNew(contentType));
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_default_text = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_default_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     */
    public @Nullable java.lang.String getDefaultText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_app_chooser_widget_get_default_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_show_all = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_show_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the app chooser should show all applications
     * in a flat list.
     */
    public boolean getShowAll() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_widget_get_show_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_show_default = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_show_default",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public boolean getShowDefault() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_widget_get_show_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_show_fallback = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_show_fallback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public boolean getShowFallback() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_widget_get_show_fallback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_show_other = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_show_other",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public boolean getShowOther() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_widget_get_show_other.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_widget_get_show_recommended = Interop.downcallHandle(
        "gtk_app_chooser_widget_get_show_recommended",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public boolean getShowRecommended() {
        int RESULT;
        try {
            RESULT = (int) gtk_app_chooser_widget_get_show_recommended.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_default_text = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_default_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     */
    public @NotNull void setDefaultText(@NotNull java.lang.String text) {
        try {
            gtk_app_chooser_widget_set_default_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_show_all = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_show_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the app chooser should show all applications
     * in a flat list.
     */
    public @NotNull void setShowAll(@NotNull boolean setting) {
        try {
            gtk_app_chooser_widget_set_show_all.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_show_default = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_show_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the app chooser should show the default handler
     * for the content type in a separate section.
     */
    public @NotNull void setShowDefault(@NotNull boolean setting) {
        try {
            gtk_app_chooser_widget_set_show_default.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_show_fallback = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_show_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the app chooser should show related applications
     * for the content type in a separate section.
     */
    public @NotNull void setShowFallback(@NotNull boolean setting) {
        try {
            gtk_app_chooser_widget_set_show_fallback.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_show_other = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_show_other",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the app chooser should show applications
     * which are unrelated to the content type.
     */
    public @NotNull void setShowOther(@NotNull boolean setting) {
        try {
            gtk_app_chooser_widget_set_show_other.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_app_chooser_widget_set_show_recommended = Interop.downcallHandle(
        "gtk_app_chooser_widget_set_show_recommended",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     */
    public @NotNull void setShowRecommended(@NotNull boolean setting) {
        try {
            gtk_app_chooser_widget_set_show_recommended.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationActivatedHandler {
        void signalReceived(AppChooserWidget source, @NotNull org.gtk.gio.AppInfo application);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("application-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.Callbacks.class, "signalAppChooserWidgetApplicationActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplicationSelectedHandler {
        void signalReceived(AppChooserWidget source, @NotNull org.gtk.gio.AppInfo application);
    }
    
    /**
     * Emitted when an application item is selected from the widget's list.
     */
    public SignalHandle onApplicationSelected(ApplicationSelectedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("application-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppChooserWidget.Callbacks.class, "signalAppChooserWidgetApplicationSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppChooserWidget.ApplicationActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppChooserWidget(Refcounted.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(application, false)));
        }
        
        public static void signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppChooserWidget.ApplicationSelectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppChooserWidget(Refcounted.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(application, false)));
        }
        
    }
}
