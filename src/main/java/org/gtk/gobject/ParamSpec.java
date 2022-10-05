package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ParamSpec} is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. {@link Object} properties.
 * <p>
 * <h2>Parameter names # {#canonical-parameter-names}</h2>
 * <p>
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

    public ParamSpec(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpec */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpec(gobject.refcounted());
    }
    
    static final MethodHandle g_param_spec_get_blurb = Interop.downcallHandle(
        "g_param_spec_get_blurb",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the short description of a {@link ParamSpec}.
     */
    public java.lang.String getBlurb() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_blurb.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_default_value = Interop.downcallHandle(
        "g_param_spec_get_default_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     */
    public Value getDefaultValue() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_default_value.invokeExact(handle());
            return new Value(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_name = Interop.downcallHandle(
        "g_param_spec_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_name_quark = Interop.downcallHandle(
        "g_param_spec_get_name_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the GQuark for the name.
     */
    public org.gtk.glib.Quark getNameQuark() {
        try {
            var RESULT = (int) g_param_spec_get_name_quark.invokeExact(handle());
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_nick = Interop.downcallHandle(
        "g_param_spec_get_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the nickname of a {@link ParamSpec}.
     */
    public java.lang.String getNick() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_nick.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_qdata = Interop.downcallHandle(
        "g_param_spec_get_qdata",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     */
    public java.lang.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_qdata.invokeExact(handle(), quark.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_get_redirect_target = Interop.downcallHandle(
        "g_param_spec_get_redirect_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type {@link ParamSpecOverride}. See g_object_class_override_property()
     * for an example of the use of this capability.
     */
    public ParamSpec getRedirectTarget() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_get_redirect_target.invokeExact(handle());
            return new ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_ref = Interop.downcallHandle(
        "g_param_spec_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of {@code pspec}.
     */
    public ParamSpec ref() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_ref.invokeExact(handle());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_ref_sink = Interop.downcallHandle(
        "g_param_spec_ref_sink",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     */
    public ParamSpec refSink() {
        try {
            var RESULT = (MemoryAddress) g_param_spec_ref_sink.invokeExact(handle());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_set_qdata = Interop.downcallHandle(
        "g_param_spec_set_qdata",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     */
    public void setQdata(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data) {
        try {
            g_param_spec_set_qdata.invokeExact(handle(), quark.getValue(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_set_qdata_full = Interop.downcallHandle(
        "g_param_spec_set_qdata_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * a {@code void (*destroy) (gpointer)} function may be
     * specified which is called with {@code data} as argument when the {@code pspec} is
     * finalized, or the data is being overwritten by a call to
     * g_param_spec_set_qdata() with the same {@code quark}.
     */
    public void setQdataFull(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify destroy) {
        try {
            g_param_spec_set_qdata_full.invokeExact(handle(), quark.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_sink = Interop.downcallHandle(
        "g_param_spec_sink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            g_param_spec_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_steal_qdata = Interop.downcallHandle(
        "g_param_spec_steal_qdata",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the {@code data} from {@code pspec} without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     */
    public java.lang.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_steal_qdata.invokeExact(handle(), quark.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_unref = Interop.downcallHandle(
        "g_param_spec_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@code pspec}.
     */
    public void unref() {
        try {
            g_param_spec_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_internal = Interop.downcallHandle(
        "g_param_spec_internal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpec} instance.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for {@code name}. Names which violate these rules lead to undefined
     * behaviour.
     * <p>
     * Beyond the name, {@code GParamSpecs} have two more descriptive
     * strings associated with them, the {@code nick}, which should be suitable
     * for use as a label for the property in a property editor, and the
     * {@code blurb}, which should be a somewhat longer description, suitable for
     * e.g. a tooltip. The {@code nick} and {@code blurb} should ideally be localized.
     */
    public static ParamSpec internal(org.gtk.gobject.Type paramType, java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_internal.invokeExact(paramType.getValue(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_is_valid_name = Interop.downcallHandle(
        "g_param_spec_is_valid_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Validate a property name for a {@link ParamSpec}. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     */
    public static boolean isValidName(java.lang.String name) {
        try {
            var RESULT = (int) g_param_spec_is_valid_name.invokeExact(Interop.allocateNativeString(name).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
