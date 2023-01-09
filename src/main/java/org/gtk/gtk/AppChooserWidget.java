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
     */
    protected AppChooserWidget(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppChooserWidget> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppChooserWidget(input);
    
    private static MemoryAddress constructNew(java.lang.String contentType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_widget_new.invokeExact(Marshal.stringToAddress.marshal(contentType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkAppChooserWidget} for applications
     * that can handle content of the given type.
     * @param contentType the content type to show applications for
     */
    public AppChooserWidget(java.lang.String contentType) {
        super(constructNew(contentType));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     * @return the value of {@code Gtk.AppChooserWidget:default-text}
     */
    public @Nullable java.lang.String getDefaultText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_widget_get_default_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether the app chooser should show all applications
     * in a flat list.
     * @return the value of {@code Gtk.AppChooserWidget:show-all}
     */
    public boolean getShowAll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the app chooser should show the default handler
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-default}
     */
    public boolean getShowDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the app chooser should show related applications
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-fallback}
     */
    public boolean getShowFallback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_fallback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the app chooser should show applications
     * which are unrelated to the content type.
     * @return the value of {@code Gtk.AppChooserWidget:show-other}
     */
    public boolean getShowOther() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_other.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the app chooser should show recommended applications
     * for the content type in a separate section.
     * @return the value of {@code Gtk.AppChooserWidget:show-recommended}
     */
    public boolean getShowRecommended() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_app_chooser_widget_get_show_recommended.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     * @param text the new value for {@code Gtk.AppChooserWidget:default-text}
     */
    public void setDefaultText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_app_chooser_widget_set_default_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
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
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_app_chooser_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ApplicationActivated} callback.
     */
    @FunctionalInterface
    public interface ApplicationActivated {
    
        /**
         * Emitted when an application item is activated from the widget's list.
         * <p>
         * This usually happens when the user double clicks an item, or an item
         * is selected and the user presses one of the keys Space, Shift+Space,
         * Return or Enter.
         */
        void run(org.gtk.gio.AppInfo application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppChooserWidget, MemoryAddress application) {
            run((org.gtk.gio.AppInfo) Interop.register(application, org.gtk.gio.AppInfo.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ApplicationActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("application-activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ApplicationSelected} callback.
     */
    @FunctionalInterface
    public interface ApplicationSelected {
    
        /**
         * Emitted when an application item is selected from the widget's list.
         */
        void run(org.gtk.gio.AppInfo application);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppChooserWidget, MemoryAddress application) {
            run((org.gtk.gio.AppInfo) Interop.register(application, org.gtk.gio.AppInfo.fromAddress).marshal(application, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ApplicationSelected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when an application item is selected from the widget's list.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppChooserWidget.ApplicationSelected> onApplicationSelected(AppChooserWidget.ApplicationSelected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("application-selected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppChooserWidget.Builder} object constructs a {@link AppChooserWidget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppChooserWidget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppChooserWidget}.
         * @return A new instance of {@code AppChooserWidget} with the properties 
         *         that were set in the Builder object.
         */
        public AppChooserWidget build() {
            return (AppChooserWidget) org.gtk.gobject.GObject.newWithProperties(
                AppChooserWidget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The text that appears in the widget when there are no applications
         * for the given content type.
         * @param defaultText The value for the {@code default-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultText(java.lang.String defaultText) {
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
        public Builder setShowAll(boolean showAll) {
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
        public Builder setShowDefault(boolean showDefault) {
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
        public Builder setShowFallback(boolean showFallback) {
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
        public Builder setShowOther(boolean showOther) {
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
        public Builder setShowRecommended(boolean showRecommended) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_app_chooser_widget_get_type != null;
    }
}
