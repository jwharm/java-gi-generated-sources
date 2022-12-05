package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ElementFactory} is used to create instances of elements. A
 * GstElementFactory can be added to a {@link Plugin} as it is also a
 * {@link PluginFeature}.
 * <p>
 * Use the gst_element_factory_find() and gst_element_factory_create()
 * functions to create element instances or use gst_element_factory_make() as a
 * convenient shortcut.
 * <p>
 * The following code example shows you how to create a GstFileSrc element.
 * <p>
 * <strong>Using an element factory</strong><br/>
 * <pre>{@code <!-- language="C" -->
 *   #include <gst/gst.h>
 * 
 *   GstElement *src;
 *   GstElementFactory *srcfactory;
 * 
 *   gst_init (&argc, &argv);
 * 
 *   srcfactory = gst_element_factory_find ("filesrc");
 *   g_return_if_fail (srcfactory != NULL);
 *   src = gst_element_factory_create (srcfactory, "src");
 *   g_return_if_fail (src != NULL);
 *   ...
 * }</pre>
 */
public class ElementFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstElementFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ElementFactory proxy instance for the provided memory address.
     * <p>
     * Because ElementFactory is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ElementFactory(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to ElementFactory if its GType is a (or inherits from) "GstElementFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ElementFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstElementFactory", a ClassCastException will be thrown.
     */
    public static ElementFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ElementFactory.getType())) {
            return new ElementFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstElementFactory");
        }
    }
    
    /**
     * Checks if the factory can sink all possible capabilities.
     * @param caps the caps to check
     * @return {@code true} if the caps are fully compatible.
     */
    public boolean canSinkAllCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_can_sink_all_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the factory can sink any possible capability.
     * @param caps the caps to check
     * @return {@code true} if the caps have a common subset.
     */
    public boolean canSinkAnyCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_can_sink_any_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the factory can src all possible capabilities.
     * @param caps the caps to check
     * @return {@code true} if the caps are fully compatible.
     */
    public boolean canSrcAllCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_can_src_all_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the factory can src any possible capability.
     * @param caps the caps to check
     * @return {@code true} if the caps have a common subset.
     */
    public boolean canSrcAnyCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_can_src_any_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Create a new element of the type defined by the given elementfactory.
     * It will be given the name supplied, since all elements require a name as
     * their first argument.
     * @param name name of new element, or {@code null} to automatically create
     *    a unique name
     * @return new {@link Element} or {@code null}
     *     if the element couldn't be created
     */
    public @Nullable org.gstreamer.gst.Element create(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_create.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given elementfactory.
     * The supplied list of properties, will be passed at object construction.
     * @param first name of the first property
     * @param varargs {@code null} terminated list of properties
     * @return new {@link Element} or {@code null}
     *     if the element couldn't be created
     */
    public @Nullable org.gstreamer.gst.Element createFull(@Nullable java.lang.String first, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_create_full.invokeExact(
                    handle(),
                    (Addressable) (first == null ? MemoryAddress.NULL : Interop.allocateNativeString(first)),
                    (Addressable) (varargs == null ? MemoryAddress.NULL : varargs));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given elementfactory.
     * The supplied list of properties, will be passed at object construction.
     * @param first name of the first property
     * @param properties list of properties
     * @return new {@link Element} or {@code null}
     *     if the element couldn't be created
     */
    public @Nullable org.gstreamer.gst.Element createValist(@Nullable java.lang.String first, @Nullable VaList properties) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_create_valist.invokeExact(
                    handle(),
                    (Addressable) (first == null ? MemoryAddress.NULL : Interop.allocateNativeString(first)),
                    (Addressable) (properties == null ? MemoryAddress.NULL : properties));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given elementfactory.
     * The supplied list of properties, will be passed at object construction.
     * @param n count of properties
     * @param names array of properties names
     * @param values array of associated properties values
     * @return new {@link Element} or {@code null}
     *     if the element couldn't be created
     */
    public @Nullable org.gstreamer.gst.Element createWithProperties(int n, @Nullable java.lang.String[] names, @Nullable org.gtk.gobject.Value[] values) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_create_with_properties.invokeExact(
                    handle(),
                    n,
                    (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, false)),
                    (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the {@link org.gtk.gobject.Type} for elements managed by this factory. The type can
     * only be retrieved if the element factory is loaded, which can be
     * assured with gst_plugin_feature_load().
     * @return the {@link org.gtk.gobject.Type} for elements managed by this factory or 0 if
     * the factory is not loaded.
     */
    public @NotNull org.gtk.glib.Type getElementType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_element_factory_get_element_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the metadata on {@code factory} with {@code key}.
     * @param key a key
     * @return the metadata with {@code key} on {@code factory} or {@code null}
     * when there was no metadata with the given {@code key}.
     */
    public @Nullable java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the available keys for the metadata on {@code factory}.
     * @return a {@code null}-terminated array of key strings, or {@code null} when there is no
     * metadata. Free with g_strfreev() when no longer needed.
     */
    public @Nullable PointerString getMetadataKeys() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_get_metadata_keys.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the number of pad_templates in this factory.
     * @return the number of pad_templates
     */
    public int getNumPadTemplates() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_get_num_pad_templates.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries whether registered element managed by {@code factory} needs to
     * be excluded from documentation system or not.
     * @return {@code true} if documentation should be skipped
     */
    public boolean getSkipDocumentation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_get_skip_documentation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the {@link org.gtk.glib.List} of {@link StaticPadTemplate} for this factory.
     * @return the
     *     static pad templates
     */
    public @NotNull org.gtk.glib.List getStaticPadTemplates() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_get_static_pad_templates.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets a {@code null}-terminated array of protocols this element supports or {@code null} if
     * no protocols are supported. You may not change the contents of the returned
     * array, as it is still owned by the element factory. Use g_strdupv() to
     * make a copy of the protocol string array if you need to.
     * @return the supported protocols
     *     or {@code null}
     */
    public @NotNull PointerString getUriProtocols() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_get_uri_protocols.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the type of URIs the element supports or {@code GST_URI_UNKNOWN} if none.
     * @return type of URIs this element supports
     */
    public @NotNull org.gstreamer.gst.URIType getUriType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_get_uri_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.URIType.of(RESULT);
    }
    
    /**
     * Check if {@code factory} implements the interface with name {@code interfacename}.
     * @param interfacename an interface name
     * @return {@code true} when {@code factory} implement the interface.
     */
    public boolean hasInterface(@NotNull java.lang.String interfacename) {
        java.util.Objects.requireNonNull(interfacename, "Parameter 'interfacename' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_has_interface.invokeExact(
                    handle(),
                    Interop.allocateNativeString(interfacename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if {@code factory} is of the given types.
     * @param type a {@link ElementFactoryListType}
     * @return {@code true} if {@code factory} is of {@code type}.
     */
    public boolean listIsType(@NotNull org.gstreamer.gst.ElementFactoryListType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_element_factory_list_is_type.invokeExact(
                    handle(),
                    type.getValue().longValue());
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
            RESULT = (long) DowncallHandles.gst_element_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Search for an element factory of the given name. Refs the returned
     * element factory; caller is responsible for unreffing.
     * @param name name of factory to find
     * @return {@link ElementFactory} if found,
     * {@code null} otherwise
     */
    public static @Nullable org.gstreamer.gst.ElementFactory find(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_find.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ElementFactory(RESULT, Ownership.FULL);
    }
    
    /**
     * Filter out all the elementfactories in {@code list} that can handle {@code caps} in
     * the given direction.
     * <p>
     * If {@code subsetonly} is {@code true}, then only the elements whose pads templates
     * are a complete superset of {@code caps} will be returned. Else any element
     * whose pad templates caps can intersect with {@code caps} will be returned.
     * @param list a {@link org.gtk.glib.List} of
     *     {@link ElementFactory} to filter
     * @param caps a {@link Caps}
     * @param direction a {@link PadDirection} to filter on
     * @param subsetonly whether to filter on caps subsets or not.
     * @return a {@link org.gtk.glib.List} of
     *     {@link ElementFactory} elements that match the given requisites.
     *     Use {@code gst_plugin_feature_list_free} after usage.
     */
    public static @NotNull org.gtk.glib.List listFilter(@NotNull org.gtk.glib.List list, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.PadDirection direction, boolean subsetonly) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_list_filter.invokeExact(
                    list.handle(),
                    caps.handle(),
                    direction.getValue(),
                    subsetonly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a list of factories that match the given {@code type}. Only elements
     * with a rank greater or equal to {@code minrank} will be returned.
     * The list of factories is returned by decreasing rank.
     * @param type a {@link ElementFactoryListType}
     * @param minrank Minimum rank
     * @return a {@link org.gtk.glib.List} of
     *     {@link ElementFactory} elements. Use gst_plugin_feature_list_free() after
     *     usage.
     */
    public static @NotNull org.gtk.glib.List listGetElements(@NotNull org.gstreamer.gst.ElementFactoryListType type, @NotNull org.gstreamer.gst.Rank minrank) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(minrank, "Parameter 'minrank' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_list_get_elements.invokeExact(
                    type.getValue().longValue(),
                    minrank.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new element of the type defined by the given element factory.
     * If name is {@code null}, then the element will receive a guaranteed unique name,
     * consisting of the element factory name and a number.
     * If name is given, it will be given the name supplied.
     * @param factoryname a named factory to instantiate
     * @param name name of new element, or {@code null} to automatically create
     *    a unique name
     * @return new {@link Element} or {@code null}
     * if unable to create element
     */
    public static @Nullable org.gstreamer.gst.Element make(@NotNull java.lang.String factoryname, @Nullable java.lang.String name) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_make.invokeExact(
                    Interop.allocateNativeString(factoryname),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given element factory.
     * The supplied list of properties, will be passed at object construction.
     * @param factoryname a named factory to instantiate
     * @param first name of first property
     * @param varargs {@code null} terminated list of properties
     * @return new {@link Element} or {@code null}
     * if unable to create element
     */
    public static @Nullable org.gstreamer.gst.Element makeFull(@NotNull java.lang.String factoryname, @Nullable java.lang.String first, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_make_full.invokeExact(
                    Interop.allocateNativeString(factoryname),
                    (Addressable) (first == null ? MemoryAddress.NULL : Interop.allocateNativeString(first)),
                    (Addressable) (varargs == null ? MemoryAddress.NULL : varargs));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given element factory.
     * The supplied list of properties, will be passed at object construction.
     * @param factoryname a named factory to instantiate
     * @param first name of first property
     * @param properties list of properties
     * @return new {@link Element} or {@code null}
     * if unable to create element
     */
    public static @Nullable org.gstreamer.gst.Element makeValist(@NotNull java.lang.String factoryname, @Nullable java.lang.String first, @Nullable VaList properties) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_make_valist.invokeExact(
                    Interop.allocateNativeString(factoryname),
                    (Addressable) (first == null ? MemoryAddress.NULL : Interop.allocateNativeString(first)),
                    (Addressable) (properties == null ? MemoryAddress.NULL : properties));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Create a new element of the type defined by the given elementfactory.
     * The supplied list of properties, will be passed at object construction.
     * @param factoryname a named factory to instantiate
     * @param n count of properties
     * @param names array of properties names
     * @param values array of associated properties values
     * @return new {@link Element} or {@code null}
     *     if the element couldn't be created
     */
    public static @Nullable org.gstreamer.gst.Element makeWithProperties(@NotNull java.lang.String factoryname, int n, @Nullable java.lang.String[] names, @Nullable org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_factory_make_with_properties.invokeExact(
                    Interop.allocateNativeString(factoryname),
                    n,
                    (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, false)),
                    (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.PluginFeature.Build {
        
         /**
         * A {@link ElementFactory.Build} object constructs a {@link ElementFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ElementFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ElementFactory} using {@link ElementFactory#castFrom}.
         * @return A new instance of {@code ElementFactory} with the properties 
         *         that were set in the Build object.
         */
        public ElementFactory construct() {
            return ElementFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ElementFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_element_factory_can_sink_all_caps = Interop.downcallHandle(
            "gst_element_factory_can_sink_all_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_can_sink_any_caps = Interop.downcallHandle(
            "gst_element_factory_can_sink_any_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_can_src_all_caps = Interop.downcallHandle(
            "gst_element_factory_can_src_all_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_can_src_any_caps = Interop.downcallHandle(
            "gst_element_factory_can_src_any_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_create = Interop.downcallHandle(
            "gst_element_factory_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_create_full = Interop.downcallHandle(
            "gst_element_factory_create_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_element_factory_create_valist = Interop.downcallHandle(
            "gst_element_factory_create_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_create_with_properties = Interop.downcallHandle(
            "gst_element_factory_create_with_properties",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_element_type = Interop.downcallHandle(
            "gst_element_factory_get_element_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_metadata = Interop.downcallHandle(
            "gst_element_factory_get_metadata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_metadata_keys = Interop.downcallHandle(
            "gst_element_factory_get_metadata_keys",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_num_pad_templates = Interop.downcallHandle(
            "gst_element_factory_get_num_pad_templates",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_skip_documentation = Interop.downcallHandle(
            "gst_element_factory_get_skip_documentation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_static_pad_templates = Interop.downcallHandle(
            "gst_element_factory_get_static_pad_templates",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_uri_protocols = Interop.downcallHandle(
            "gst_element_factory_get_uri_protocols",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_uri_type = Interop.downcallHandle(
            "gst_element_factory_get_uri_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_has_interface = Interop.downcallHandle(
            "gst_element_factory_has_interface",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_list_is_type = Interop.downcallHandle(
            "gst_element_factory_list_is_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_element_factory_get_type = Interop.downcallHandle(
            "gst_element_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_element_factory_find = Interop.downcallHandle(
            "gst_element_factory_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_list_filter = Interop.downcallHandle(
            "gst_element_factory_list_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_element_factory_list_get_elements = Interop.downcallHandle(
            "gst_element_factory_list_get_elements",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_element_factory_make = Interop.downcallHandle(
            "gst_element_factory_make",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_make_full = Interop.downcallHandle(
            "gst_element_factory_make_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_element_factory_make_valist = Interop.downcallHandle(
            "gst_element_factory_make_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_factory_make_with_properties = Interop.downcallHandle(
            "gst_element_factory_make_with_properties",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
