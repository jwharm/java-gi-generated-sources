package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These functions allow querying information about registered typefind
 * functions. How to create and register these functions is described in
 * the section &lt;link linkend="gstreamer-Writing-typefind-functions"&gt;
 * "Writing typefind functions"&lt;/link&gt;.
 * <p>
 * The following example shows how to write a very simple typefinder that
 * identifies the given data. You can get quite a bit more complicated than
 * that though.
 * <pre>{@code <!-- language="C" -->
 *   typedef struct {
 *     guint8 *data;
 *     guint size;
 *     guint probability;
 *     GstCaps *data;
 *   } MyTypeFind;
 *   static void
 *   my_peek (gpointer data, gint64 offset, guint size)
 *   {
 *     MyTypeFind *find = (MyTypeFind *) data;
 *     if (offset >= 0 && offset + size <= find->size) {
 *       return find->data + offset;
 *     }
 *     return NULL;
 *   }
 *   static void
 *   my_suggest (gpointer data, guint probability, GstCaps *caps)
 *   {
 *     MyTypeFind *find = (MyTypeFind *) data;
 *     if (probability > find->probability) {
 *       find->probability = probability;
 *       gst_caps_replace (&find->caps, caps);
 *     }
 *   }
 *   static GstCaps *
 *   find_type (guint8 *data, guint size)
 *   {
 *     GList *walk, *type_list;
 *     MyTypeFind find = {data, size, 0, NULL};
 *     GstTypeFind gst_find = {my_peek, my_suggest, &find, };
 *     walk = type_list = gst_type_find_factory_get_list ();
 *     while (walk) {
 *       GstTypeFindFactory *factory = GST_TYPE_FIND_FACTORY (walk->data);
 *       walk = g_list_next (walk)
 *       gst_type_find_factory_call_function (factory, &gst_find);
 *     }
 *     g_list_free (type_list);
 *     return find.caps;
 *   };
 * }</pre>
 */
public class TypeFindFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTypeFindFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TypeFindFactory proxy instance for the provided memory address.
     * <p>
     * Because TypeFindFactory is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypeFindFactory(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TypeFindFactory if its GType is a (or inherits from) "GstTypeFindFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TypeFindFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTypeFindFactory", a ClassCastException will be thrown.
     */
    public static TypeFindFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TypeFindFactory.getType())) {
            return new TypeFindFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTypeFindFactory");
        }
    }
    
    /**
     * Calls the {@link TypeFindFunction} associated with this factory.
     * @param find a properly setup {@link TypeFind} entry. The get_data
     *     and suggest_type members must be set.
     */
    public void callFunction(@NotNull org.gstreamer.gst.TypeFind find) {
        java.util.Objects.requireNonNull(find, "Parameter 'find' must not be null");
        try {
            DowncallHandles.gst_type_find_factory_call_function.invokeExact(
                    handle(),
                    find.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@link Caps} associated with a typefind factory.
     * @return the {@link Caps} associated with this factory
     */
    public @Nullable org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_factory_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the extensions associated with a {@link TypeFindFactory}. The returned
     * array should not be changed. If you need to change stuff in it, you should
     * copy it using g_strdupv().  This function may return {@code null} to indicate
     * a 0-length list.
     * @return a {@code null}-terminated array of extensions associated with this factory
     */
    public @Nullable PointerString getExtensions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_factory_get_extensions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Check whether the factory has a typefind function. Typefind factories
     * without typefind functions are a last-effort fallback mechanism to
     * e.g. assume a certain media type based on the file extension.
     * @return {@code true} if the factory has a typefind functions set, otherwise {@code false}
     */
    public boolean hasFunction() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_type_find_factory_has_function.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_type_find_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the list of all registered typefind factories. You must free the
     * list using gst_plugin_feature_list_free().
     * <p>
     * The returned factories are sorted by highest rank first, and then by
     * factory name.
     * <p>
     * Free-function: gst_plugin_feature_list_free
     * @return the list of all
     *     registered {@link TypeFindFactory}.
     */
    public static @NotNull org.gtk.glib.List getList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_factory_get_list.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.PluginFeature.Build {
        
         /**
         * A {@link TypeFindFactory.Build} object constructs a {@link TypeFindFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TypeFindFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TypeFindFactory} using {@link TypeFindFactory#castFrom}.
         * @return A new instance of {@code TypeFindFactory} with the properties 
         *         that were set in the Build object.
         */
        public TypeFindFactory construct() {
            return TypeFindFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TypeFindFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_type_find_factory_call_function = Interop.downcallHandle(
            "gst_type_find_factory_call_function",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_factory_get_caps = Interop.downcallHandle(
            "gst_type_find_factory_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_factory_get_extensions = Interop.downcallHandle(
            "gst_type_find_factory_get_extensions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_factory_has_function = Interop.downcallHandle(
            "gst_type_find_factory_has_function",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_factory_get_type = Interop.downcallHandle(
            "gst_type_find_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_type_find_factory_get_list = Interop.downcallHandle(
            "gst_type_find_factory_get_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
