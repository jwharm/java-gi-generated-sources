package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAssistantPage} is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.GObject {
    
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
     */
    protected AssistantPage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AssistantPage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AssistantPage(input);
    
    /**
     * Returns the child to which {@code page} belongs.
     * @return the child to which {@code page} belongs
     */
    public org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_assistant_page_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_assistant_page_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AssistantPage.Builder} object constructs a {@link AssistantPage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AssistantPage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AssistantPage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AssistantPage}.
         * @return A new instance of {@code AssistantPage} with the properties 
         *         that were set in the Builder object.
         */
        public AssistantPage build() {
            return (AssistantPage) org.gtk.gobject.GObject.newWithProperties(
                AssistantPage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
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
        public Builder setComplete(boolean complete) {
            names.add("complete");
            values.add(org.gtk.gobject.Value.create(complete));
            return this;
        }
        
        /**
         * The type of the assistant page.
         * @param pageType The value for the {@code page-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPageType(org.gtk.gtk.AssistantPageType pageType) {
            names.add("page-type");
            values.add(org.gtk.gobject.Value.create(pageType));
            return this;
        }
        
        /**
         * The title of the page.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_assistant_page_get_type != null;
    }
}
