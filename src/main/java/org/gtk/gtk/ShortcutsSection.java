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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutsSection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutsSection if its GType is a (or inherits from) "GtkShortcutsSection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutsSection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsSection", a ClassCastException will be thrown.
     */
    public static ShortcutsSection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ShortcutsSection.getType())) {
            return new ShortcutsSection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsSection");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_section_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPage {
        boolean signalReceived(ShortcutsSection source, int object);
    }
    
    public Signal<ShortcutsSection.ChangeCurrentPage> onChangeCurrentPage(ShortcutsSection.ChangeCurrentPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-current-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsSection.Callbacks.class, "signalShortcutsSectionChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ShortcutsSection.ChangeCurrentPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Box.Build {
        
         /**
         * A {@link ShortcutsSection.Build} object constructs a {@link ShortcutsSection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ShortcutsSection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsSection} using {@link ShortcutsSection#castFrom}.
         * @return A new instance of {@code ShortcutsSection} with the properties 
         *         that were set in the Build object.
         */
        public ShortcutsSection construct() {
            return ShortcutsSection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ShortcutsSection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setMaxHeight(int maxHeight) {
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
        public Build setSectionName(java.lang.String sectionName) {
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
        public Build setTitle(java.lang.String title) {
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
        public Build setViewName(java.lang.String viewName) {
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
    
    private static class Callbacks {
        
        public static boolean signalShortcutsSectionChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ShortcutsSection.ChangeCurrentPage) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new ShortcutsSection(source, Ownership.NONE), object);
        }
    }
}
