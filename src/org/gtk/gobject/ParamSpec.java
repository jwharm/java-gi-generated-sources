package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GParamSpec is an object structure that encapsulates the metadata
 * required to specify parameters, such as e.g. #GObject properties.
 * 
 * ## Parameter names # {#canonical-parameter-names}
 * 
 * A property name consists of one or more segments consisting of ASCII letters
 * and digits, separated by either the `-` or `_` character. The first
 * character of a property name must be a letter. These are the same rules as
 * for signal naming (see g_signal_new()).
 * 
 * When creating and looking up a #GParamSpec, either separator can be
 * used, but they cannot be mixed. Using `-` is considerably more
 * efficient, and is the ‘canonical form’. Using `_` is discouraged.
 */
public class ParamSpec extends org.gtk.gobject.Object {

    public ParamSpec(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpec */
    public static ParamSpec castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpec(gobject.getReference());
    }
    
    /**
     * Get the short description of a #GParamSpec.
     */
    public java.lang.String getBlurb() {
        var RESULT = gtk_h.g_param_spec_get_blurb(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the default value of @pspec as a pointer to a #GValue.
     * 
     * The #GValue will remain valid for the life of @pspec.
     */
    public Value getDefaultValue() {
        var RESULT = gtk_h.g_param_spec_get_default_value(handle());
        return new Value(References.get(RESULT, false));
    }
    
    /**
     * Get the name of a #GParamSpec.
     * 
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
     * Get the nickname of a #GParamSpec.
     */
    public java.lang.String getNick() {
        var RESULT = gtk_h.g_param_spec_get_nick(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     */
    public jdk.incubator.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_param_spec_get_qdata(handle(), quark.getValue());
        return RESULT;
    }
    
    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type #GParamSpecOverride. See g_object_class_override_property()
     * for an example of the use of this capability.
     */
    public ParamSpec getRedirectTarget() {
        var RESULT = gtk_h.g_param_spec_get_redirect_target(handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of @pspec.
     */
    public ParamSpec ref() {
        var RESULT = gtk_h.g_param_spec_ref(handle());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Convenience function to ref and sink a #GParamSpec.
     */
    public ParamSpec refSink() {
        var RESULT = gtk_h.g_param_spec_ref_sink(handle());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Sets an opaque, named pointer on a #GParamSpec. The name is
     * specified through a #GQuark (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the @pspec with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using %NULL as pointer essentially removes the data stored.
     */
    public void setQdata(org.gtk.glib.Quark quark, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_param_spec_set_qdata(handle(), quark.getValue(), data);
    }
    
    /**
     * The initial reference count of a newly created #GParamSpec is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls `g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);` in sequence on it, taking over the initial
     * reference count (thus ending up with a @pspec that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public void sink() {
        gtk_h.g_param_spec_sink(handle());
    }
    
    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the @data from @pspec without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     */
    public jdk.incubator.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_param_spec_steal_qdata(handle(), quark.getValue());
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a @pspec.
     */
    public void unref() {
        gtk_h.g_param_spec_unref(handle());
    }
    
    /**
     * Creates a new #GParamSpec instance.
     * 
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for @name. Names which violate these rules lead to undefined
     * behaviour.
     * 
     * Beyond the name, #GParamSpecs have two more descriptive
     * strings associated with them, the @nick, which should be suitable
     * for use as a label for the property in a property editor, and the
     * @blurb, which should be a somewhat longer description, suitable for
     * e.g. a tooltip. The @nick and @blurb should ideally be localized.
     */
    public static ParamSpec internal(Type paramType, java.lang.String name, java.lang.String nick, java.lang.String blurb, int flags) {
        var RESULT = gtk_h.g_param_spec_internal(paramType.getValue(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags);
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Validate a property name for a #GParamSpec. This can be useful for
     * dynamically-generated properties which need to be validated at run-time
     * before actually trying to create them.
     * 
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names.
     */
    public static boolean isValidName(java.lang.String name) {
        var RESULT = gtk_h.g_param_spec_is_valid_name(Interop.allocateNativeString(name).handle());
        return (RESULT != 0);
    }
    
}
