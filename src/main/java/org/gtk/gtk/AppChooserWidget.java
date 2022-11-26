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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AppChooserWidget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooserWidget", a ClassCastException will be thrown.
     */
    public static AppChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), AppChooserWidget.getType())) {
            return new AppChooserWidget(gobject.handle(), gobject.yieldOwnership());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_app_chooser_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppChooserWidget.ApplicationSelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link AppChooserWidget.Build} object constructs a {@link AppChooserWidget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AppChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppChooserWidget} using {@link AppChooserWidget#castFrom}.
         * @return A new instance of {@code AppChooserWidget} with the properties 
         *         that were set in the Build object.
         */
        public AppChooserWidget construct() {
            return AppChooserWidget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AppChooserWidget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The text that appears in the widget when there are no applications
         * for the given content type.
         * @param defaultText The value for the {@code default-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDefaultText(java.lang.String defaultText) {
            names.add("default-text");
            values.add(org.gtk.gobject.Value.create(defaultText));
            return this;
        }
        
        /**
         * If {@code true}, the app chooser presents all applications
         * in a single list, without subsections for default,
         * recommended or related applications.
         * @param showAll The value for the {@code show-all} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowAll(boolean showAll) {
            names.add("show-all");
            values.add(org.gtk.gobject.Value.create(showAll));
            return this;
        }
        
        /**
         * Determines whether the app chooser should show the default
         * handler for the content type in a separate section.
         * <p>
         * If {@code false}, the default handler is listed among the recommended
         * applications.
         * @param showDefault The value for the {@code show-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowDefault(boolean showDefault) {
            names.add("show-default");
            values.add(org.gtk.gobject.Value.create(showDefault));
            return this;
        }
        
        /**
         * Determines whether the app chooser should show a section
         * for fallback applications.
         * <p>
         * If {@code false}, the fallback applications are listed among the
         * other applications.
         * @param showFallback The value for the {@code show-fallback} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowFallback(boolean showFallback) {
            names.add("show-fallback");
            values.add(org.gtk.gobject.Value.create(showFallback));
            return this;
        }
        
        /**
         * Determines whether the app chooser should show a section
         * for other applications.
         * @param showOther The value for the {@code show-other} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowOther(boolean showOther) {
            names.add("show-other");
            values.add(org.gtk.gobject.Value.create(showOther));
            return this;
        }
        
        /**
         * Determines whether the app chooser should show a section
         * for recommended applications.
         * <p>
         * If {@code false}, the recommended applications are listed
         * among the other applications.
         * @param showRecommended The value for the {@code show-recommended} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowRecommended(boolean showRecommended) {
            names.add("show-recommended");
            values.add(org.gtk.gobject.Value.create(showRecommended));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_widget_new = Interop.downcallHandle(
            "gtk_app_chooser_widget_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_default_text = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_default_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_all = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_all",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_default = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_fallback = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_fallback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_other = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_other",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_show_recommended = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_show_recommended",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_default_text = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_default_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_all = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_default = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_fallback = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_fallback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_other = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_other",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_set_show_recommended = Interop.downcallHandle(
            "gtk_app_chooser_widget_set_show_recommended",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_widget_get_type = Interop.downcallHandle(
            "gtk_app_chooser_widget_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppChooserWidget.ApplicationActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserWidget(source, Ownership.NONE), new org.gtk.gio.AppInfo.AppInfoImpl(application, Ownership.NONE));
        }
        
        public static void signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AppChooserWidget.ApplicationSelected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppChooserWidget(source, Ownership.NONE), new org.gtk.gio.AppInfo.AppInfoImpl(application, Ownership.NONE));
        }
    }
}
