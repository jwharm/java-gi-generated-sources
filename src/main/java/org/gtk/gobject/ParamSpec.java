package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ParamSpec} is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. {@link GObject} properties.
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
public class ParamSpec extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpec";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    /**
     * Create a ParamSpec proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpec(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpec> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpec(input, ownership);
    
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     * @return a pointer to a {@link Value} which must not be modified
     */
    public org.gtk.gobject.Value getDefaultValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_default_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     * @return the name of {@code pspec}.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the GQuark for the name.
     * @return the GQuark for {@code pspec}-&gt;name.
     */
    public org.gtk.glib.Quark getNameQuark() {
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
    public java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_get_nick.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return the user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
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
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Increments the reference count of {@code pspec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public org.gtk.gobject.ParamSpec ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     * @return the {@link ParamSpec} that was passed into this function
     */
    public org.gtk.gobject.ParamSpec refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ref_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     */
    public void setQdata(org.gtk.glib.Quark quark) {
        try {
            DowncallHandles.g_param_spec_set_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) MemoryAddress.NULL);
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
     * @param destroy function to invoke with {@code data} as argument, when {@code data} needs to
     *  be freed
     */
    public void setQdataFull(org.gtk.glib.Quark quark, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.g_param_spec_set_qdata_full.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
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
     * @param paramType the {@link org.gtk.glib.Type} for the property; must be derived from {@code G_TYPE_PARAM}
     * @param name the canonical name of the property
     * @param nick the nickname of the property
     * @param blurb a short description of the property
     * @param flags a combination of {@link ParamFlags}
     * @return (transfer floating): a newly allocated
     *     {@link ParamSpec} instance, which is initially floating
     */
    public static org.gtk.gobject.ParamSpec internal(org.gtk.glib.Type paramType, java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, org.gtk.gobject.ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_internal.invokeExact(
                    paramType.getValue().longValue(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nick, null)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(blurb, null)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public static boolean isValidName(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_spec_is_valid_name.invokeExact(
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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

    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
}
