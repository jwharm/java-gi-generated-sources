package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsSection} collects all the keyboard shortcuts and gestures
 * for a major application mode.
 * <p>
 * If your application needs multiple sections, you should give each
 * section a unique {@code Gtk.ShortcutsSection:section-name} and
 * a {@code Gtk.ShortcutsSection:title} that can be shown in the
 * section selector of the {@link ShortcutsWindow}.
 * <p>
 * The {@code Gtk.ShortcutsSection:max-height} property can be used
 * to influence how the groups in the section are distributed over pages
 * and columns.
 * <p>
 * This widget is only meant to be used with {@link ShortcutsWindow}.
 */
public class ShortcutsSection extends org.gtk.gtk.Box implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsSection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutsSection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShortcutsSection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutsSection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutsSection(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_section_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ChangeCurrentPage} callback.
     */
    @FunctionalInterface
    public interface ChangeCurrentPage {
    
        boolean run(int object);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceShortcutsSection, int object) {
            var RESULT = run(object);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeCurrentPage.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<ShortcutsSection.ChangeCurrentPage> onChangeCurrentPage(ShortcutsSection.ChangeCurrentPage handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("change-current-page", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ShortcutsSection.Builder} object constructs a {@link ShortcutsSection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutsSection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Box.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutsSection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsSection}.
         * @return A new instance of {@code ShortcutsSection} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutsSection build() {
            return (ShortcutsSection) org.gtk.gobject.GObject.newWithProperties(
                ShortcutsSection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The maximum number of lines to allow per column.
         * <p>
         * This property can be used to influence how the groups in this
         * section are distributed across pages and columns. The default
         * value of 15 should work in most cases.
         * @param maxHeight The value for the {@code max-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxHeight(int maxHeight) {
            names.add("max-height");
            values.add(org.gtk.gobject.Value.create(maxHeight));
            return this;
        }
        
        /**
         * A unique name to identify this section among the sections
         * added to the {@code GtkShortcutsWindow}.
         * <p>
         * Setting the {@code Gtk.ShortcutsWindow:section-name} property
         * to this string will make this section shown in the {@code GtkShortcutsWindow}.
         * @param sectionName The value for the {@code section-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSectionName(java.lang.String sectionName) {
            names.add("section-name");
            values.add(org.gtk.gobject.Value.create(sectionName));
            return this;
        }
        
        /**
         * The string to show in the section selector of the {@code GtkShortcutsWindow}
         * for this section.
         * <p>
         * If there is only one section, you don't need to set a title,
         * since the section selector will not be shown in this case.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * A view name to filter the groups in this section by.
         * <p>
         * See {@code Gtk.ShortcutsGroup:view}.
         * <p>
         * Applications are expected to use the
         * {@code Gtk.ShortcutsWindow:view-name} property
         * for this purpose.
         * @param viewName The value for the {@code view-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setViewName(java.lang.String viewName) {
            names.add("view-name");
            values.add(org.gtk.gobject.Value.create(viewName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcuts_section_get_type = Interop.downcallHandle(
                "gtk_shortcuts_section_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcuts_section_get_type != null;
    }
}
