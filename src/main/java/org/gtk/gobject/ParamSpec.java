package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ParamSpec} is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. {@link Object} properties.
 * <p>
 * <strong>Parameter names # {#canonical-parameter-names}</strong><br/>
 * A property name consists of one or more segments consisting of ASCII letters
 * and digits, separated by either the {@code -} or {@code _} character. The first
 * character of a property name must be a letter. These are the same rules as
 * for signal naming (see g_signal_new()).
 * <p>
 * When creating and looking up a {@link ParamSpec}, either separator can be
 * used, but they cannot be mixed. Using {@code -} is considerably more
 * efficient, and is the ‘canonical form’. Using {@code _} is discouraged.
 */
public class ParamSpec extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpec";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("value_type"),
        Interop.valueLayout.C_LONG.withName("owner_type"),
        Interop.valueLayout.ADDRESS.withName("_nick"),
        Interop.valueLayout.ADDRESS.withName("_blurb"),
        Interop.valueLayout.ADDRESS.withName("qdata"),
        Interop.valueLayout.C_INT.withName("ref_count"),
        Interop.valueLayout.C_INT.withName("param_id")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code g_type_instance}
     * @return The value of the field {@code g_type_instance}
     */
    public org.gtk.gobject.TypeInstance g_type_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_instance"));
        return new org.gtk.gobject.TypeInstance(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gtk.gobject.ParamFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.ParamFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gtk.gobject.ParamFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code value_type}
     * @return The value of the field {@code value_type}
     */
    public org.gtk.glib.Type value_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_type}
     * @param value_type The new value of the field {@code value_type}
     */
    public void value_type$set(org.gtk.glib.Type value_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value_type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code owner_type}
     * @return The value of the field {@code owner_type}
     */
    public org.gtk.glib.Type owner_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("owner_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code owner_type}
     * @param owner_type The new value of the field {@code owner_type}
     */
    public void owner_type$set(org.gtk.glib.Type owner_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("owner_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), owner_type.getValue().longValue());
    }
    
    /**
     * Create a ParamSpec proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpec(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ParamSpec if its GType is a (or inherits from) "GParamSpec".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ParamSpec} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GParamSpec", a ClassCastException will be thrown.
     */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ParamSpec.getType())) {
            return new ParamSpec(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GParamSpec");
        }
    }
    
    /**
     * Get the short description of a {@link ParamSpec}.
     * @return the short description of {@code pspec}.
     */
    public @Nullable java.lang.String getBlurb() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_blurb.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     * @return a pointer to a {@link Value} which must not be modified
     */
    public @NotNull org.gtk.gobject.Value getDefaultValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_default_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     * @return the name of {@code pspec}.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the GQuark for the name.
     * @return the GQuark for {@code pspec}-&gt;name.
     */
    public @NotNull org.gtk.glib.Quark getNameQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_spec_get_name_quark.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Get the nickname of a {@link ParamSpec}.
     * @return the nickname of {@code pspec}.
     */
    public @NotNull java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_nick.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return the user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type {@link ParamSpecOverride}. See g_object_class_override_property()
     * for an example of the use of this capability.
     * @return paramspec to which requests on this
     *          paramspec should be redirected, or {@code null} if none.
     */
    public @Nullable org.gtk.gobject.ParamSpec getRedirectTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_redirect_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    /**
     * Increments the reference count of {@code pspec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public @NotNull org.gtk.gobject.ParamSpec ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public @NotNull org.gtk.gobject.ParamSpec refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data an opaque user data pointer
     */
    public void setQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_param_spec_set_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * a {@code void (*destroy) (gpointer)} function may be
     * specified which is called with {@code data} as argument when the {@code pspec} is
     * finalized, or the data is being overwritten by a call to
     * g_param_spec_set_qdata() with the same {@code quark}.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data an opaque user data pointer
     * @param destroy function to invoke with {@code data} as argument, when {@code data} needs to
     *  be freed
     */
    public void setQdataFull(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_param_spec_set_qdata_full.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) data,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The initial reference count of a newly created {@link ParamSpec} is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls {@code g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);} in sequence on it, taking over the initial
     * reference count (thus ending up with a {@code pspec} that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public void sink() {
        try {
            DowncallHandles.g_param_spec_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the {@code data} from {@code pspec} without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return the user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_steal_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a {@code pspec}.
     */
    public void unref() {
        try {
            DowncallHandles.g_param_spec_unref.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.intern.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link ParamSpec} instance.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for {@code name}. Names which violate these rules lead to undefined
     * behaviour.
     * <p>
     * Beyond the name, {@code GParamSpecs} have two more descriptive strings, the
     * {@code nick} and {@code blurb}, which may be used as a localized label and description.
     * For GTK and related libraries these are considered deprecated and may be
     * omitted, while for other libraries such as GStreamer and its plugins they
     * are essential. When in doubt, follow the conventions used in the
     * surrounding code and supporting libraries.
     * @param paramType the {@link Type} for the property; must be derived from {@code G_TYPE_PARAM}
     * @param name the canonical name of the property
     * @param nick the nickname of the property
     * @param blurb a short description of the property
     * @param flags a combination of {@link ParamFlags}
     * @return (transfer floating): a newly allocated
     *     {@link ParamSpec} instance, which is initially floating
     */
    public static @NotNull org.gtk.gobject.ParamSpec internal(@NotNull org.gtk.glib.Type paramType, @NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(paramType, "Parameter 'paramType' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_internal.invokeExact(
                    paramType.getValue().longValue(),
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    /**
     * Validate a property name for a {@link ParamSpec}. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     * @param name the canonical name of the property
     * @return {@code true} if {@code name} is a valid property name, {@code false} otherwise.
     */
    public static boolean isValidName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_spec_is_valid_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends io.github.jwharm.javagi.Build {
        
         /**
         * A {@link ParamSpec.Build} object constructs a {@link ParamSpec} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ParamSpec} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ParamSpec} using {@link ParamSpec#castFrom}.
         * @return A new instance of {@code ParamSpec} with the properties 
         *         that were set in the Build object.
         */
        public ParamSpec construct() {
            return ParamSpec.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ParamSpec.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_param_spec_get_blurb = Interop.downcallHandle(
            "g_param_spec_get_blurb",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_get_default_value = Interop.downcallHandle(
            "g_param_spec_get_default_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_get_name = Interop.downcallHandle(
            "g_param_spec_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_get_name_quark = Interop.downcallHandle(
            "g_param_spec_get_name_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_get_nick = Interop.downcallHandle(
            "g_param_spec_get_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_get_qdata = Interop.downcallHandle(
            "g_param_spec_get_qdata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_get_redirect_target = Interop.downcallHandle(
            "g_param_spec_get_redirect_target",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_ref = Interop.downcallHandle(
            "g_param_spec_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_ref_sink = Interop.downcallHandle(
            "g_param_spec_ref_sink",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_set_qdata = Interop.downcallHandle(
            "g_param_spec_set_qdata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_set_qdata_full = Interop.downcallHandle(
            "g_param_spec_set_qdata_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_sink = Interop.downcallHandle(
            "g_param_spec_sink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_steal_qdata = Interop.downcallHandle(
            "g_param_spec_steal_qdata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_unref = Interop.downcallHandle(
            "g_param_spec_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle intern = Interop.downcallHandle(
            "intern",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_param_spec_internal = Interop.downcallHandle(
            "g_param_spec_internal",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_is_valid_name = Interop.downcallHandle(
            "g_param_spec_is_valid_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
