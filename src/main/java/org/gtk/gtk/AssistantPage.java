package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAssistantPage} is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAssistantPage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AssistantPage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AssistantPage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AssistantPage if its GType is a (or inherits from) "GtkAssistantPage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AssistantPage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAssistantPage", a ClassCastException will be thrown.
     */
    public static AssistantPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AssistantPage.getType())) {
            return new AssistantPage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAssistantPage");
        }
    }
    
    /**
     * Returns the child to which {@code page} belongs.
     * @return the child to which {@code page} belongs
     */
    public @NotNull org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_page_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_assistant_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link AssistantPage.Build} object constructs a {@link AssistantPage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AssistantPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AssistantPage} using {@link AssistantPage#castFrom}.
         * @return A new instance of {@code AssistantPage} with the properties 
         *         that were set in the Build object.
         */
        public AssistantPage construct() {
            return AssistantPage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AssistantPage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether all required fields are filled in.
         * <p>
         * GTK uses this information to control the sensitivity
         * of the navigation buttons.
         * @param complete The value for the {@code complete} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setComplete(boolean complete) {
            names.add("complete");
            values.add(org.gtk.gobject.Value.create(complete));
            return this;
        }
        
        /**
         * The type of the assistant page.
         * @param pageType The value for the {@code page-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPageType(org.gtk.gtk.AssistantPageType pageType) {
            names.add("page-type");
            values.add(org.gtk.gobject.Value.create(pageType));
            return this;
        }
        
        /**
         * The title of the page.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_assistant_page_get_child = Interop.downcallHandle(
            "gtk_assistant_page_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_assistant_page_get_type = Interop.downcallHandle(
            "gtk_assistant_page_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
