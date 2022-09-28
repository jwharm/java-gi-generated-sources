package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public ParamSpec(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpec */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpec(gobject.getReference());
    }
    
    /**
     * Get the short description of a {@link ParamSpec}.
     */
    public java.lang.String getBlurb() {
        var RESULT = gtk_h.g_param_spec_get_blurb(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the default value of {@code pspec} as a pointer to a {@link Value}.
     * <p>
     * The {@link Value} will remain valid for the life of {@code pspec}.
     */
    public Value getDefaultValue() {
        var RESULT = gtk_h.g_param_spec_get_default_value(handle());
        return new Value(References.get(RESULT, false));
    }
    
    /**
     * Get the name of a {@link ParamSpec}.
     * <p>
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_param_spec_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the GQuark for the name.
     */
    public org.gtk.glib.Quark getNameQuark() {
        var RESULT = gtk_h.g_param_spec_get_name_quark(handle());
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Get the nickname of a {@link ParamSpec}.
     */
    public java.lang.String getNick() {
        var RESULT = gtk_h.g_param_spec_get_nick(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     */
    public java.lang.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_param_spec_get_qdata(handle(), quark.getValue());
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
     */
    public ParamSpec getRedirectTarget() {
        var RESULT = gtk_h.g_param_spec_get_redirect_target(handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of {@code pspec}.
     */
    public ParamSpec ref() {
        var RESULT = gtk_h.g_param_spec_ref(handle());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Convenience function to ref and sink a {@link ParamSpec}.
     */
    public ParamSpec refSink() {
        var RESULT = gtk_h.g_param_spec_ref_sink(handle());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Sets an opaque, named pointer on a {@link ParamSpec}. The name is
     * specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the {@code pspec} with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using {@code null} as pointer essentially removes the data stored.
     */
    public void setQdata(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_param_spec_set_qdata(handle(), quark.getValue(), data);
    }
    
    /**
     * This function works like g_param_spec_set_qdata(), but in addition,
     * a {@code void (*destroy) (gpointer)} function may be
     * specified which is called with {@code data} as argument when the {@code pspec} is
     * finalized, or the data is being overwritten by a call to
     * g_param_spec_set_qdata() with the same {@code quark}.
     */
    public void setQdataFull(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify destroy) {
        gtk_h.g_param_spec_set_qdata_full(handle(), quark.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
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
        gtk_h.g_param_spec_sink(handle());
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the {@code data} from {@code pspec} without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     */
    public java.lang.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_param_spec_steal_qdata(handle(), quark.getValue());
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a {@code pspec}.
     */
    public void unref() {
        gtk_h.g_param_spec_unref(handle());
    }
    
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
        var RESULT = gtk_h.g_param_spec_internal(paramType.getValue(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Validate a property name for a {@link ParamSpec}. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     */
    public static boolean isValidName(java.lang.String name) {
        var RESULT = gtk_h.g_param_spec_is_valid_name(Interop.allocateNativeString(name).handle());
        return (RESULT != 0);
    }
    
}
