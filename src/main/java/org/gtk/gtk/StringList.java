package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStringList} is a list model that wraps an array of strings.
 * <p>
 * The objects in the model have a "string" property.
 * <p>
 * {@code GtkStringList} is well-suited for any place where you would
 * typically use a {@code char*[]}, but need a list model.
 * <p>
 * <strong>GtkStringList as GtkBuildable</strong><br/>
 * The {@code GtkStringList} implementation of the {@code GtkBuildable} interface
 * supports adding items directly using the &lt;items&gt; element and
 * specifying &lt;item&gt; elements for each item. Each &lt;item&gt; element
 * supports the regular translation attributes “translatable”,
 * “context” and “comments”.
 * <p>
 * Here is a UI definition fragment specifying a {@code GtkStringList}
 * <pre>{@code xml
 * <object class="GtkStringList">
 *   <items>
 *     <item translatable="yes">Factory</item>
 *     <item translatable="yes">Home</item>
 *     <item translatable="yes">Subway</item>
 *   </items>
 * </object>
 * }</pre>
 */
public class StringList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StringList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StringList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to StringList if its GType is a (or inherits from) "GtkStringList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StringList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStringList", a ClassCastException will be thrown.
     */
    public static StringList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), StringList.getType())) {
            return new StringList(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStringList");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String[] strings) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_list_new.invokeExact(
                    (Addressable) (strings == null ? MemoryAddress.NULL : Interop.allocateNativeArray(strings, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkStringList} with the given {@code strings}.
     * @param strings The strings to put in the model
     */
    public StringList(@Nullable java.lang.String[] strings) {
        super(constructNew(strings), Ownership.FULL);
    }
    
    /**
     * Appends {@code string} to {@code self}.
     * <p>
     * The {@code string} will be copied. See
     * {@link StringList#take} for a way to avoid that.
     * @param string the string to insert
     */
    public void append(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gtk_string_list_append.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the string that is at {@code position} in {@code self}.
     * <p>
     * If {@code self} does not contain {@code position} items, {@code null} is returned.
     * <p>
     * This function returns the const char *. To get the
     * object wrapping it, use g_list_model_get_item().
     * @param position the position to get the string for
     * @return the string at the given position
     */
    public @Nullable java.lang.String getString(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_list_get_string.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Removes the string at {@code position} from {@code self}.
     * <p>
     * {@code position} must be smaller than the current
     * length of the list.
     * @param position the position of the string that is to be removed
     */
    public void remove(int position) {
        try {
            DowncallHandles.gtk_string_list_remove.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes {@code self} by removing {@code n_removals} strings and adding {@code additions}
     * to it.
     * <p>
     * This function is more efficient than {@link StringList#append}
     * and {@link StringList#remove}, because it only emits the
     * ::items-changed signal once for the change.
     * <p>
     * This function copies the strings in {@code additions}.
     * <p>
     * The parameters {@code position} and {@code n_removals} must be correct (ie:
     * {@code position} + {@code n_removals} must be less than or equal to the length
     * of the list at the time this function is called).
     * @param position the position at which to make the change
     * @param nRemovals the number of strings to remove
     * @param additions The strings to add
     */
    public void splice(int position, int nRemovals, @Nullable java.lang.String[] additions) {
        try {
            DowncallHandles.gtk_string_list_splice.invokeExact(
                    handle(),
                    position,
                    nRemovals,
                    (Addressable) (additions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(additions, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code string} to self at the end, and takes
     * ownership of it.
     * <p>
     * This variant of {@link StringList#append}
     * is convenient for formatting strings:
     * <pre>{@code c
     * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
     * }</pre>
     * @param string the string to insert
     */
    public void take(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gtk_string_list_take.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string));
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
            RESULT = (long) DowncallHandles.gtk_string_list_get_type.invokeExact();
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
         * A {@link StringList.Build} object constructs a {@link StringList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link StringList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StringList} using {@link StringList#castFrom}.
         * @return A new instance of {@code StringList} with the properties 
         *         that were set in the Build object.
         */
        public StringList construct() {
            return StringList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    StringList.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_list_new = Interop.downcallHandle(
            "gtk_string_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_list_append = Interop.downcallHandle(
            "gtk_string_list_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_list_get_string = Interop.downcallHandle(
            "gtk_string_list_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_string_list_remove = Interop.downcallHandle(
            "gtk_string_list_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_string_list_splice = Interop.downcallHandle(
            "gtk_string_list_splice",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_list_take = Interop.downcallHandle(
            "gtk_string_list_take",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_list_get_type = Interop.downcallHandle(
            "gtk_string_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
